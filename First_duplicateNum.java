import java.util.HashSet;

public class First_duplicateNum {

    static int findearliestsecondoccurance(int[] arr){
        if(arr.length==0)return -1;
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                return arr[i];
            }
            else{
                set.add(arr[i]);
            }
            
        }
        return -1;
    }
    public static 
    void main(String args[]){
      System.out.println(findearliestsecondoccurance(new int[]{10,5,3,4,3,5,6}));
    }
}
