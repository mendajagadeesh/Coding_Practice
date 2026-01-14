#include<stdio.h>
void secondlargest(int n,int arr[n]);
void main(){
    int n;
    int arr[n];
    printf("enter size of array : ");
    scanf("%d",&n);
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    
    secondlargest(n,arr);
}

void secondlargest(int n,int arr[n]){
int first=arr[0];
int second=arr[0];
for(int i=0;i<n;i++){
    if(arr[i]>first){
        second=first;
        first=arr[i];
    }
    else if(arr[i]>second && first>second)
    {
        second=arr[i];
    }
}
printf("%d",second);
}