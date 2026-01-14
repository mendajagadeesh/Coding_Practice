import java.util.Arrays;

public class TwoSum {
    static int[] twosum(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String args[]){
         int[] arr={1,2,3,4,5};
         int[] x=twosum(arr, 5);
         System.out.println(Arrays.toString(x));
        
        }
}
