import java.util.Scanner;

public class NthMagic_no {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter any number :-");
        int n=sc.nextInt();
        int ans=0;
        int base=5;
        while(n>0){
           int last=n&1;
           n=n>>1;
           ans+=last*base;
           base=base*5;
        }
        sc.close();
        System.out.println("magic number of given number is :"+ans);
    }
}
