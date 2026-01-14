import java.util.Arrays;

public class Quicksort {
    static void sort(int[] arr,int start,int end){
        if(start>=end) return;
      int mid=start+(end-start)/2;
      int low=start;
      int high=end;
      int pivot=arr[mid];
      while(start<=end){
        while(arr[start]<pivot){
            start++;
        }
        while(arr[end]>pivot){
            end--;
        }
        if(start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
      }
      
      sort(arr, low, end);
      sort(arr, start, high);
      
    }
    public static void main(String args[]){
        int[] arr={3,4,2,87,1,5};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
