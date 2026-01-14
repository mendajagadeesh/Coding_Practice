public class LinearSearch {
    static void search(int[] arr,int target){
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("element found at index : "+i);
                flag=true;
                
            }
        }
        if(!flag){
            System.out.println("element not found");
        }
    }
    public static void main(String args[]){
        int[] arr={10,20,40,30,60,45,66,71};
        search(arr, 66);
    }
}
