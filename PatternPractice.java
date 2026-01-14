import java.util.Scanner;

public class PatternPractice {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter any number :-");
        int n=sc.nextInt();
        for(int row=0;row<2*n;row++){
            int totalcols=row>n?2*n-row-1:row;
            for(int j=0;j<=totalcols;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
