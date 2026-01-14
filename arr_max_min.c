#include<stdio.h>
void max(int n,int arr[n]);
void min(int n,int arr[n]);
void main(){
    int n;
    printf("enter size of array :");
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("maximam element is:");
    max(n,arr);
    printf("\n");
    printf("minimum element is :");
    min(n,arr);

}

void max(int n,int arr[n]){
    int max=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    printf("%d",max);
}

void min(int n,int arr[n]){
    int min=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
    printf("%d",min);
}