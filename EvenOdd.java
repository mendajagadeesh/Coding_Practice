import java.util.Scanner;

public class EvenOdd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any number");
        int n=sc.nextInt();
        sc.close();
        if((n & 1)==1){
            System.out.println("given number is odd : "+n);
        }
        else{
            System.out.println("given number is even : "+n);
        }
    }
}
