// import java.util.Arrays;
// import java.util.Scanner;

import java.util.Arrays;

public class Practice {
     static int id;
     static String name;
     void demo(){
            System.out.println("practice of funtions");
        }

        void demo2(){
            System.out.println("practice of java");
        }

        void pract(int id,String name){
            System.out.println("id :"+id+" my name is "+name);
        }

        // Practice(int id,String name){
        //     this.id=id;
        //     this.name=name;
        // }

    public static void main(String[] args){
        // int x=10;
        // float y=10.5f;
        // int z=(int)y;

        // System.out.print(z);
        // String s="jagadeeh";
        // System.out.print(s);
        // int[] arr={1,2,3,4};
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }
        // int x;
        // Scanner sc=new Scanner(System.in);
        // // x=sc.nextInt();
        // String s=sc.nextLine();
        // // System.out.println(x);
        // System.out.println(s);
        // int z;
        // Practice obj=new Practice();
        // Practice obj1=new Practice();
        // obj.demo();
        // obj1.demo();
        // obj.pract(101, "vikas");
        // x=100;
        // Practice p=new Practice(101, "vikas");
        
        int freq[]=new int[26];
        freq['a'-'a']++;
        freq['a'-'a']++;
        freq[1]++;
           System.out.println(Arrays.toString(freq));
    }
}
