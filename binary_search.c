#include<stdio.h>
void binary_search(int n,int arr[n]);
void main(){
    int n;
    printf("enter size of array :");
    scanf("%d",&n);
    int arr[n];
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
     
    binary_search(n,arr);
}

void binary_search(int n,int arr[n]){
int low=0;
int high=n-1;
int mid;
int target=5;//manual taking we can take from user for better experience
int flag=0;
while(low<=high){
mid=(low+high)/2;
if(arr[mid]==target){
    printf("element found\n");
    flag=1;
    break;
}
else if(arr[mid]>target){
high=mid-1;
}
else if(arr[mid]<target){
    low=mid+1;
}
}
if(flag==0){
    printf("element not found");
}
}