public class BinarySearch {
    static void search(int[] arr,int target){
          int low,high,mid;
          boolean flag=false;
          low=0;
          high=arr.length-1;
          while(low<=high){
          mid=(low+high)/2;
          if(arr[mid]==target){
            System.out.println("element found at index :"+mid);
            flag=true;
            break;
          }
          else if(arr[mid]<target){
            low=mid+1;
          }
          else if(arr[mid]>target){
            high=mid-1;
          }
          }
          if(!flag){
            System.out.println("element not found");
        }
    }
    public static void main(String args[]){
      int[] arr={11,22,33,44,55,66,77,88,99};
        search(arr, 77);
    }
}
