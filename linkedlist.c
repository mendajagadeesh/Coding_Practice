#include<stdio.h>
#include<stdlib.h>
struct node{
    int data;
    struct node *next;
};
struct node *head=NULL;
void creation(){
    struct node *ptr,*temp;
    int i,val,n;
    printf("enter no of elements:");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        ptr=(struct node*)malloc(sizeof(struct node));
        printf("enter data of element %d : ",i);
        scanf("%d",&val);
        ptr->data=val;
        ptr->next=NULL;
        if(head==NULL){
            head=ptr;
            temp=head;
        }
        else{
            temp->next=ptr;
            temp=temp->next;
        }
         
        
    }
}

void display(){
    struct node *temp;
    temp=head;
    while(temp!=NULL){
        printf("%d->",temp->data);
        temp=temp->next;
    }
    printf("NULL");
}
void insertbegin(){
    struct node *temp,*ptr;
    int i,val;
    printf("enter the value : ");
    scanf("%d",&val);
    ptr=(struct node*)malloc(sizeof(struct node));
    ptr->data=val;
    ptr->next=NULL;
    if(head==NULL){
        head=ptr;
    }
    else{
        ptr->next=head;
        head=ptr;
    }
}
void insertend(){
    struct node *temp,*ptr;
    int i,val;
    printf("enter the value : ");
    scanf("%d",&val);
    ptr=(struct node*)malloc(sizeof(struct node));
    temp=head;
    ptr->data=val;
    ptr->next=NULL;
    if(head==NULL){
        head=ptr;
    }
    else{
        while(temp->next!=NULL){
            temp=temp->next;
        }
        temp->next=ptr;
        ptr->next=NULL;
    }
}
void main(){
    creation();
    insertbegin();
    insertend();
    display();
}