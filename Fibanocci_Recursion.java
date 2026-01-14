public class Fibanocci_Recursion {
    public static void main(String args[]){
          System.out.println(fibanocci(7));
    }

    static int  fibanocci(int n){
        if(n<2){
          return n;
    }
    else{
        return fibanocci(n-1)+fibanocci(n-2);
    }
}
}
