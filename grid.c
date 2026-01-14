#include<stdio.h>
#include<ctype.h>
void grid(int x,int y);
void main(){
    int x=2,y=2,steps;
    grid(x,y);
    char choice;
    printf("enter your choice and no of steps:");
    scanf("%c %d",&choice,&steps);
    choice=toupper(choice);
    switch(choice){
        case 'U':x=x-steps;
        break;
        case 'D':x=x+steps;
        break;
        case 'L':y=y-steps;
        break;
        case 'R':y=y+steps;
        break;
        default:
        printf("enter correct choice");
    }

    if (x < 0) x = 0;
    if (x > 4) x = 4;
    if (y < 0) y = 0;
    if (y > 4) y = 4;
    grid(x,y);
    
}

void grid(int x,int y){
    char arr[5][5];
    for(int i=0;i<5;i++){
        for(int j=0;j<5;j++){
            if(i==x && j==y){
                arr[i][j]='R';
            }
            else{
                arr[i][j]='.';
            }

            printf("%c ",arr[i][j]);
        }
        printf("\n");
    }
}