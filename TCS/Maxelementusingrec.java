public class Maxelementusingrec {
    static int maxelement(int[] arr,int index){
        if(index==arr.length-1){
            return arr[index];
        }
        int maxofrest= maxelement(arr, index+1);
        return maxofrest < arr[index+1] ?arr[index+1]:maxofrest;
        
    }

    static int noOfVowels(String word){
        word.toLowerCase();
        if(word.isEmpty()){
            return 0;
        }
       
        char ch=word.charAt(0);
        int count=0;
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            count++;
        }
        return count+noOfVowels(word.substring(1));
    }
    public static void main(String args[]){
         int arr[]={1,2,3,4,5};
      System.out.println(maxelement(arr, 0));
    System.out.println(noOfVowels("abcde"));
    
    }
}
