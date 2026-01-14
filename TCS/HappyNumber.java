import java.util.HashSet;

public class HappyNumber {

    boolean happynumber(int num){
        if(num<=0)return false;
        int slow=num;
        int fast=num;
        do{
        slow=findSquares(slow);
        fast=findSquares(findSquares(fast));
        }while(slow!=fast);
        return slow==1;
    }

    int findSquares(int n){
        if(n==0)return 0;
        int ans=0;
        while(n!=0){
          int rem=n%10;
          ans+=rem*rem;
          n=n/10;
        }
        return ans;
    }

    boolean happynumbercheckusingHashSet(int num){
        HashSet<Integer> set=new HashSet<>();
        int n=num;
        while(n!=1 &&!set.contains(n)){
            set.add(n);
            n=findSquares(n);
        }
            return n==1;
    }
    public static void main(String args[]){
        HappyNumber obj=new HappyNumber();
       int num=19;
       int n=19;
       System.out.println(obj.happynumbercheckusingHashSet(n));
       System.out.println(obj.happynumber(num));
    }
}
