import java.util.*;
public class prime_num {
    public static void main(String[] args) {
        System.out.println("enter any number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.close();
        int i;
        for(i=2;i<=n;i++){
            if(n%i==0){
                break;
            }
        }
        if(n==i){
          System.out.println("given number is prime number");
        }
        else{
            System.out.println("given number is not a prime number");
        }
        
    }
}
