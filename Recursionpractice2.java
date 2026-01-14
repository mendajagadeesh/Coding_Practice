import java.util.ArrayList;

public class Recursionpractice2 {
    //check array is sorted or not
    static boolean check_arr_sort(int[] arr,int index){
         if(index==arr.length-1){
            return true;
         }
         return arr[index] < arr[index+1] && check_arr_sort(arr, index+1);
    }

    //linear search using recursion
    static String linear_search(int[] arr,int target,int index){
        if(index>=arr.length){
            return "element not found";
        }
        if(arr[index]==target){
            return "element found at index " + index;
        }
        return linear_search(arr, target, index+1);

    }

    //return arrayList or list of targets found indexes

    static ArrayList<Integer> FindAllIndexes(int[] arr,int target,int index,ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return FindAllIndexes(arr,target,index+1,list);

    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8};
        int[] arr1={1,2,3,4,4,5,6,7};
        System.out.println(check_arr_sort(arr, 0));
        System.out.println(linear_search(arr, 36, 0));
        ArrayList<Integer> ans=FindAllIndexes(arr1,4,0,new ArrayList<>());
        System.out.println(ans);
    }
}
