import java.util.*;
public class OtpGeneration {
    public static void main(String args[]){
       child obj=new child();
       obj.display();
    }
}

class parent{
    public String OtpGenerator(){
           int otplength=4;
        Random rd=new Random();
        StringBuilder s=new StringBuilder();
        for(int i=0;i<otplength;i++){
           int digit=rd.nextInt(10);
           s.append(digit);
        }
        return s.toString();
    }
}

class child extends parent{
    
    public void display(){
        String Newotp=OtpGenerator();
        System.out.print("New OTP : "+Newotp);
    }
}
