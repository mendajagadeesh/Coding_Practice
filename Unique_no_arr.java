public class Unique_no_arr {
    static int unique(int[] arr){
        int unique=0;
        for(int n:arr){
            unique^=n;
        }
        return unique;
    }
    static int unique2(int[] arr2){
        int i;
        for(i=0;i<arr2.length;i++){
            int count=0;
            for(int j=0;j<arr2.length;j++){
                if(arr2[i]==arr2[j]){
                    count++;
                }
            }
            if(count!=3){
                return arr2[i];
            }
        }
        return -1;

    }
    public static void main(String args[]){
        int[] arr={1,3,4,2,3,2,1,6,4};
        int[] arr2={2,3,2,2,4,7,4,7,7,4};
    System.out.println("unique number in the given array is :"+unique(arr));
    System.out.println("unique number in the given array is :"+unique2(arr2));
    }
}
