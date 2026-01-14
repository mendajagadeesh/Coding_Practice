public class MaxCircularSubArray {
    static int maxcircularsumsubarray(int[] arr){
        int totalsum=arr[0];
        int maxsum=arr[0];
        int minsum=arr[0];
        int currentmax=arr[0];
        int currentmin=arr[0];
        for(int i=1;i<arr.length;i++){
            totalsum+=arr[i];
            currentmax=Math.max(currentmax+arr[i], arr[i]);
            maxsum=Math.max(currentmax, maxsum);

            currentmin=Math.min(currentmin+arr[i], arr[i]);
            minsum=Math.min(currentmin,minsum); 
        }
        int normalsum=maxsum;
        int circularsum=totalsum-minsum;
            if(minsum==totalsum){
                return normalsum;
            }
        return Math.max(normalsum, circularsum);
    }
    public static void main(String args[]){
       int[] arr={8,-8,9,-9,10,-11,12};
       System.out.println("max circular sum sub array is :"+maxcircularsumsubarray(arr));
    }
}
