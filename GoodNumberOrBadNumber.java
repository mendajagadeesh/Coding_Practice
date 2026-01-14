public class GoodNumberOrBadNumber {

    public static void goodorbadnum(int num){
        int originalNumber=num;
        if(num==0)return;
        int sum=0;
        for(int i=0;i<num;i++){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        if(sum%3==0){
            int temp=removeEvenDigits(originalNumber);
            if(temp%3==0){
            
            System.out.println("The given number is good number.(three divisible)");
            }
        }
        else{
            System.out.println("The given number is not a good number");
        }
    }

    public static int removeEvenDigits(int num){
        if(num==0)return -1;
        String number=Integer.toString(num);
        StringBuilder result=new StringBuilder();
        for(int i=0;i<number.length();i++){
            int digit=number.charAt(i)-'0';
            if(digit%2!=0){
                result.append(digit);
            }
        }
        if(result.length()==0)return -1;
        return Integer.parseInt(result.toString());
    }
    public static void main(String args[]){
      goodorbadnum(639);
      
    }
}
