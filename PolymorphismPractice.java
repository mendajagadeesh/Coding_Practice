public class PolymorphismPractice{

    //Over loading concept compiler time polymorphism
     public void add(int a,int b){
        System.out.println(a+b);   
          }

          public void add(int a,int b,int c){
            System.out.println(a+b+c);
          }
    public static void main(String args[]){
          PolymorphismPractice obj=new PolymorphismPractice();
          obj.add(1, 2);
          obj.add(1, 2, 3);
    }
}