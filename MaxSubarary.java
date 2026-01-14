public class MaxSubarary {
    static int maxsubarray(int[] arr,int start, int end){
        int max=arr[start];
         int sum=arr[start];
        for(int i=start+1;i<arr.length;i++){
           sum=Math.max(arr[i], sum+arr[i]);
            max=Math.max(max, sum);
        }
        return max;
    }
    public static void main(String args[]){
        int[] arr={1,2,3,14,15};
        int start=3;
        int end=5;
        int x=maxsubarray(arr,start,end);
        System.out.println(x);
    }
}
