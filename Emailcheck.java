import java.util.*;
public class Emailcheck {

    public static String emailcheck(String mail){
        if("<>,{}%/".indexOf(mail)!=-1){
            return "invalid email";
        }
        else{
            for(int i=0;i<mail.length();i++){
                if(mail.charAt(i)=='@'){
                   return "Valid email domain name -> "+ mail.substring(i);//returns domain name
                }
            }
            return "invalid email";
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter email :");
        String email=sc.next();
         String result=emailcheck(email);
         sc.close();
         System.out.println(result);
    }
}
