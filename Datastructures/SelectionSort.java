public class SelectionSort {
    static void sort(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int MaxIndex=arr.length-1;
             for(int j=i;j<arr.length;j++){
            if(arr[j]<arr[MaxIndex]){
                MaxIndex=j;
                
            }
        }
             int temp=arr[i];
             arr[i]=arr[MaxIndex];
             arr[MaxIndex]=temp;
    }  
    }
    public static void main(String args[]){
        int[] arr={5,4,2,3,1};
        System.out.print("Sorted array :-");
        sort(arr);
        for(int i=0;i<arr.length;i++){
           System.out.print(arr[i]+" ");
        }
    }
}
