public class patterns {
    public static void pattern1(){
      for(int i=0;i<3;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(){
      for(int i=0;i<3;i++){
            for(int j=3;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        System.out.println("first pattern");
       pattern1();
        System.out.println("Second pattern");
       pattern2();
    }
}
