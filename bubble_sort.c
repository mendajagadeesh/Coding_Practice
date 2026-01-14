#include<stdio.h>
void bubble_sort(int n,int arr[n]);
void main(){
    int n;
    printf("enter size of array :");
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
     
    bubble_sort(n,arr);
    printf("Sorted array: ");
    for (int i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }

}
void bubble_sort(int n,int arr[n]){
for(int i=0;i<n;i++){
    for(int j=0;j<n-1-i;j++){
    if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
    }
    }

}
}