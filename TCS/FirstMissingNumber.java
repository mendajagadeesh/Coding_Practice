class FirstMissingNumber {
    static int firstmissingpositivenumber(int arr[]){
        if(arr.length==0){
            return 0;
        }
           int i=0;
           int n=arr.length;
        while ((1<=arr[i] && arr[i]<=n) && arr[i]!=arr[arr[i]-1]){
           int temp=arr[i];
           arr[i]=arr[arr[i]-1];
           arr[temp-1]=temp;
           i++;
        }
        for(int j=0;j<n;j++){
            if(j+1!=arr[j]){
              return j+1;
            }
        }
        return n+1;

    }
    public static void main(String args[]){
        int[] arr={2,1,4,5};
        System.out.println(firstmissingpositivenumber(arr));
    }
}
