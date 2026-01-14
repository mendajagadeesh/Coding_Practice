public class even_odd_digits {
    static void even_odd_digits_count(int[] arr){
     for(int i=0;i<arr.length;i++){
        counts(arr[i]);
     }
    }
    static void counts(int i){
        int original =i;
        int digit_count=0;
     while(i!=0){
        digit_count++;
        i=i/10;
     }
     if(digit_count%2==0){
        System.out.println(original +" is even no of digits");
     }
     else{
        System.out.println(original+" is odd no of digits");
     }
    }
    public static void main(String[] args) {
        
        int[] arr={12,345,2,6,7896};
        even_odd_digits_count(arr);

    }
}
