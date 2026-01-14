import java.util.*;
public class SubsetsinArrays {
    static void subsets(int[] arr,int index,ArrayList<Integer>list,List<List<Integer>> result){
        if(index==arr.length){
            result.add(new ArrayList<>(list));
            return;
        }
        list.add(arr[index]);
        subsets(arr, index+1, list, result);
         list.remove(list.size()-1);
        subsets(arr, index+1, list, result);
       
        
    }
    public static void main(String args[]){
         int[] arr={1,2,3};
         List<List<Integer>> result=new ArrayList<>();
          subsets(arr, 0,new ArrayList<>(), result);
          for(List<Integer> sets:result){
            System.out.println(sets);
          }
        }
}
