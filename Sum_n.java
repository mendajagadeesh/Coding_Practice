import java.util.*;
public class Sum_n {
    public static void main(String[] args) {
        System.out.println("enter any number for range");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("sum of n natural numbers is:"+sum);
        sc.close();
    }
    
}
