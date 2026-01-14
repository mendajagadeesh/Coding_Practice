import java.util.ArrayList;
import java.util.Scanner;
class student {
    String name;
    int rollno;
    String grade;

    student(String name, int rollno, String grade) {
        this.name = name;
        this.rollno = rollno;
        this.grade = grade;
    }


}

public class prgm10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<student> s = new ArrayList<>();
        while(true) {
        	System.out.println("1.add students\n 2.display students\n 3.exit the program");
        	System.out.print("enter your choice :-");
        	int choice=sc.nextInt();
        	switch(choice) {
        	case 1:
        	System.out.print("enter name :- ");
            String name = sc.next();
            System.out.print("enter rollno :- ");
            int rollno = sc.nextInt();
            System.out.print("enter grade :- ");
            String grade = sc.next();
            

            s.add(new student(name, rollno, grade));
           
            break;
        	case 2:
        		 for (student s1 : s) {
                	 System.out.println(s1.name+"\n"+s1.rollno+"\n"+s1.grade);
                }
        		 break;
        		 
        	  case 3:
                  System.out.println("Exiting program...");
                  sc.close();
                  System.exit(0);
                  break;

              default:
                  System.out.println("Invalid choice. Please enter 1, 2, or 3.");
        	
        }

 
        
    }
}
}
