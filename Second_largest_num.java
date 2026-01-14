class second_largest_num {
    public static int getSecondLargest(int[] arr) {
         int first=arr[0];
        int second=Integer.MIN_VALUE;
        if(arr.length<2){
            return-1;
        }
        for(int i=0;i<arr.length;i++){
           
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }
            else if(arr[i]>second && arr[i]!=first){
                second=arr[i];
            }
            
        }
        return (second==Integer.MIN_VALUE)?-1:second;
    }
    public static void main(String[] args){
        int[] arr={10,10,5};
        int result=getSecondLargest(arr);
        System.out.println(result);
    }
}