#include<stdio.h>
void leftshift(int n,int arr[n]);
void rightshift(int n,int arr[n]);
void main(){
    printf("enter size of array : ");
    int n;
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("enter your choice : ");
    char choice;
    scanf(" %c",&choice);
    switch(choice){
        case 'l':leftshift(n,arr);
        break;
        case 'r':rightshift(n,arr);
        break;
        default :
        printf("enter correct choice");
    }
    printf("Shifted array : "); 
    for (int i = 0; i < n; i++) {
        printf("%d\t", arr[i]);
    }
    printf("\n");

}

void leftshift(int n, int arr[n]){
    int temp=arr[0];
    for(int i=0;i<n-1;i++){
       arr[i]=arr[i+1];
    }
    arr[n-1]=temp;
}

void rightshift(int n, int arr[n]){
    int temp=arr[n-1];
    for(int i=n-1;i>0;i--){
       arr[i]=arr[i-1];
    }
    arr[0]=temp;
}