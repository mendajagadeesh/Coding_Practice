import java.util.*;
public class FibanocciSeries {
    public static void main(String args[]){
        int a=0,b=1;
        int c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size ");
        int n=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=2;i<n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
        sc.close();

    }
}
