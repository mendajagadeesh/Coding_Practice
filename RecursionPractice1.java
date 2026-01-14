public class RecursionPractice1 {
    static void fun1(int n){ //print numbers 1 to n
        if(n==0){
            return;
        }
        fun1(n-1);
         System.out.print(n+" ");
    }

    static void fun2(int n){ //print numbers n to 1
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        fun2(n-1);
         
    }

      static void fun3(int n){ //print numbers n to 1
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        fun3(n-1);
        System.out.print(n+" ");
         
    }

    static int factorial(int n){
        if(n<=1){
            return 1;
        }

        return n*factorial(n-1);
    }

    static int sumofnNumbers(int n){
        if(n==0){
            return 0;
        }
        return n+sumofnNumbers(n-1);
    }
    static int sumofdigits(int n){
        if(n==0){
            return 0;
        }
        return n%10+sumofdigits(n/10);
    }

     static int productofdigits(int n){
        if(n==0){
            return 1;
        }
        return n%10*productofdigits(n/10);
    }
    static int sum=0;
    static void numreversemethod1(int n){
        if(n==0){
            return;
        }
        int rem=n%10;
        sum=sum*10+rem;
        numreversemethod1(n/10);
        
    }

    static int numreversemethod2(int n){
        int digits=(int)Math.log10(n)+1;
        return helper(n,digits);    
    }

    private static int helper(int n,int digits){
            if(n%10==n){
                return n;
            }
            int rem=n%10;
            return rem*(int)Math.pow(10,digits-1)+helper(n/10,digits-1);
        }

    static void palindrome(int n){
        if(n==numreversemethod2(n)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

    }

    static int countno_of_zeros(int n){
        return helper2(n,0);

    }
    private static int helper2(int n, int count) {
        if(n==0){
            return count;
        }
        int rem=n%10;
        if(rem==0){
        return helper2(n/10, count+1);
        }
        return helper2(n/10, count);
    }


    static int No_of_steps_count(int n){
            return helper3(n,0);
    }

    private static int helper3(int n, int count) {
        if(n==0){
            return count;
        }
        if(n%2==0){
            return (helper3(n/2, count+1));
        }
        return helper3(n-1, count+1);
        
    }

    public static void main(String args[]){
        // fun1(5);
        // System.out.println();
        // fun2(5);
        // System.out.println();
        // fun3(5);
        //  System.out.println();
        System.out.println("factorial of given number is : "+factorial(4));
        // System.out.println();
        // System.out.println("sum of numbers of range of given number is : "+sumofnNumbers(10));
        // System.out.println();
        // System.out.println("sum of digits of given number is :"+sumofdigits(5151));
        //  System.out.println();
        //  System.out.println("product of digits of given number is :"+productofdigits(55));
        // numreversemethod1(1234);
        // System.out.println(sum);
        // System.out.println("number reverse is : "+numreversemethod2(3456));
        // palindrome(121);
        // System.out.println("no of zeros of given number is :"+countno_of_zeros(40506));
        // System.out.println("no of steps is :"+No_of_steps_count(14));
    }
}
