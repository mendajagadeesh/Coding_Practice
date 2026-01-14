public class Max_subArraySum{

     static int maxsubSum(int[] arr){
        if(arr.length==0)return -1;
        int minsofar=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            minsofar=Math.max(arr[i],arr[i]+minsofar);
            max=Math.max(max,minsofar);
        }
        return max;

    }
    public static void main(String args[]){
        System.out.println(maxsubSum(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}