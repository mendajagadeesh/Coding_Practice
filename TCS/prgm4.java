public class prgm4 {
    public static void main(String args[]){
        int[] arr={1,5,-1,7,5,3};
        int target=6;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum=0;
                sum=arr[i]+arr[j];
                if(target==sum){
                   System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}
