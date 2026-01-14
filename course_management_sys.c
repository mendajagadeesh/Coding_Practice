#include<stdio.h>
#include<stdlib.h>
#include<string.h>
struct course{
int course_id;
char  course_name[50];
char instructor[50];
int credit;
int max_enroll;
};
struct course courses[100];
int course_count=0;

struct academic_progress{
int student_id;
int course_id;
char grade[10];
char completion_status[50];
struct academic_progress *next;
};
struct academic_progress *Head=NULL;


void insert(){
    struct academic_progress *temp,*new;
    temp=Head;
    new=(struct academic_progress*)malloc(sizeof(struct academic_progress));
    printf("student id : \n course id : \n grade : \n completion status \n");
    scanf("%d %d %s %s",new->student_id,new->course_id,new->grade,new->completion_status);
    if(temp==NULL){
     Head=new;
     new->next=NULL;
    }
    temp->next=new;
    new->next=NULL;

    
}

void insert_course(int id,char name[],char instructor[],int credit,int max_count){
     if (course_count < 100) {
        courses[course_count].course_id = id;
        strcpy(courses[course_count].course_name, name);
        strcpy(courses[course_count].instructor, instructor);
        courses[course_count].credit = credit;
        courses[course_count].max_enroll = max_count;
        course_count++;
    } else {
        printf("Course list is full.\n");
    }
}

void updateCourse(int id, char new_instructor[], int new_credit) {
    for (int i = 0; i < course_count; i++) {
        if (courses[i].course_id == id) {
            strcpy(courses[i].instructor, new_instructor);
            courses[i].credit = new_credit;
            return;
        }
    }
    printf("Course not found.\n");
}

void checkAvailability(int id) {
    for (int i = 0; i < course_count; i++) {
        if (courses[i].course_id == id) {
            printf("Course %s has %d seats available.\n", courses[i].course_name, courses[i].max_enroll);
            return;
        }
    }
    printf("Course not found.\n");
}

void main(){
    insert();
    struct academic_progress *temp;
    temp=Head;
    while(temp->next!=NULL){
        printf("%d %d %s %s",temp->student_id,temp->course_id,temp->grade,temp->completion_status);
}
 }