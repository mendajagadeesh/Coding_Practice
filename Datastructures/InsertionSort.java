public class InsertionSort {
    static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
                else{
                    break;
                }
            }
        }
    }

    static void swap(int[]arr,int start,int end){
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
    }

    public static void main(String args[]){
        int[] arr={5,1,4,2,3};
        System.out.print("Sorted array : ");
        sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
