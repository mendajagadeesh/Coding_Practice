public class Encapsulation_ {
    private int student_id;
    private String student_name;
    public void setDetails(int student_id,String student_name){
           this.student_id=student_id;
           this.student_name=student_name;
    }

    public void getDetails(){
        System.out.println("Student id is "+student_id);
        System.out.println("student name is "+student_name);
    }
    public static void main(String args[]){
        Encapsulation_ obj=new Encapsulation_();
        obj.setDetails(516, "Jagadeesh");
        obj.getDetails();
    }
}
