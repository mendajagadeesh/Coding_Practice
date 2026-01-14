import java.util.Arrays;

public class RecursionPractice3 {

    static void triangle(int row,int column){
        if(row==0){
            return;
        }
        if(column<row){
            System.out.print("* ");
            triangle(row, column+1);
        }
        else{
            System.out.println();
            triangle(row-1, 0);
        }
    }

     static void triangle2(int row,int column){
        if(row==0){
            return;
        }
        if(column<row){
           
            triangle2(row, column+1);
             System.out.print("* ");
        }
        else{
            
            triangle2(row-1, 0);
            System.out.println();
        }
    }

    
     static void bubblesort(int[] arr,int row,int column){
        if(row==0){
            return;
        }
        if(column<row){
        if(arr[column]>arr[column+1]){
           
            int temp=arr[column];
            arr[column]=arr[column+1];
            arr[column+1]=temp;
        }
          bubblesort(arr, row, column+1);
    }
        else{
            
            bubblesort(arr, row-1, 0);
        }
    }

    //selectionsort sort using recursion

    static void selectionSort(int[] arr,int start,int end,int max){
        if(end==0) return;
        if(start<end){
            if(arr[start]>arr[max]){
                selectionSort(arr, start+1, end, start);
            } 
            else{
            selectionSort(arr, start+1, end, max);
            }
        
        }
        else{
            int temp=arr[max];
            arr[max]=arr[end-1];
            arr[end-1]=temp;
            selectionSort(arr, 0, end-1, 0);
        }
    }

    public static void main(String args[]){
    //  triangle(4, 0); 
    //  System.out.println();
    int[] arr={4,3,6,2,1};
    //  triangle2(4, 0);
    //  bubblesort(arr,arr.length-1,0);
    selectionSort(arr, 0, arr.length, 0);
     System.out.println(Arrays.toString(arr));
    }
}
