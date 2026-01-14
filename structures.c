#include<stdio.h>
#include<stdlib.h>
struct Employee {
    int id;
    char name[50];
    int age;
    char designation[50];
    union Salary {
    float hourly_wage;
    float fixed_salary;
};
};
struct PayType {
    int salary_type;
    union Salary sal;
};

void saverecord(struct Employee emp,struct PayType pay){
    FILE *fp=fopen("empdata.dat","wb");
    if(fp==NULL){
        printf("file is not reading");
        return;
    }
    fwrite(&emp,sizeof(emp),1,fp);
    fwrite(&pay, sizeof(pay), 1, fp);
    fclose(fp);
    printf("Record saved successfully.\n");
}
void readrecord(){
    struct Employee emp;
    struct PayType pay;
    FILE *fp=fopen("empdata.dat","rb");
    if (fp == NULL) {
        printf("Error opening file for reading.\n");
        return;
    }
    fread(&emp, sizeof(emp), 1, fp);
    fread(&pay, sizeof(pay), 1, fp);
    fclose(fp);
    printf("employee details\n");
    printf("ID: %d\nName: %s\nAge: %d\nDesignation: %s\n",
           emp.id, emp.name, emp.age, emp.designation);
     printf("Salary Type: %s\n",
           pay.salary_type == 0 ? "Hourly" : "Fixed");
    if (pay.salary_type == 0)
        printf("Hourly Wage: ₹%.2f\n", pay.sal.hourly_wage);
    else
        printf("Fixed Salary: ₹%.2f\n", pay.sal.fixed_salary);
}

void main(){
    struct Employee emp={101,"jagadeesh", 22,"computer Engineer"};
    struct PayType pay;
    pay.salary_type=1;
    pay.sal.fixed_salary=50000;
    saverecord(emp,pay);
    readrecord();
}