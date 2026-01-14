#include<stdio.h>
void sums(int n,int arr[n]);
void avg(int n,int arr[n]);
void main(){
    int n;
    printf("enter size of array :");
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    printf("sum of given arrray is:");
    sums(n,arr);
    printf("\n");
    printf("average of given array is:");
    avg(n,arr);
}
void sums(int n,int arr[n]){
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    printf("%d",sum);
}

void avg(int n,int arr[n]){
    int sum=0;
    for(int i=0;i<n;i++){
        sum+=arr[i];
    }
    printf("%d",sum/n);
}