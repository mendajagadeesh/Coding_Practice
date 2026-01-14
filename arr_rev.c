#include<stdio.h>
void arr_rev(int n,int arr[n]);
void main(){
    int n;
    printf("enter size of array :");
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
     
    arr_rev(n,arr);
}

void arr_rev(int n,int arr[n]){
    int arr_rev[n];
    for(int i=n-1;i>=0;i--){
      arr_rev[i]=arr[i];
      printf("%d\t",arr_rev[i]);
    }
}