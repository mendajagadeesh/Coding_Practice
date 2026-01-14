public class Binary_Search_Recursion {
    static int search(int[] arr,int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(target<arr[mid]){
            search(arr, target, start, mid-1);
        }
        return search(arr, target, mid+1, end);
    }
    public static void main(String agrs[]){
       int[] arr={1,10,30,77,89,91};
       int x=search(arr, 77, 0, arr.length);
       System.out.println("element found at index "+x);
    }
}
