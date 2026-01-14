import java.lang.String;
import java.util.ArrayList;
public class Subsets {

    static String skipcharacter(String word){
       if(word.length()==0){
          return word;
       }
       char ch=word.charAt(0);
       if(ch=='a'){
         return skipcharacter(word.substring(1));
       }
       return ch+skipcharacter(word.substring(1));
    }

     static String skipentireword(String word){
       if(word.length()==0){
          return word;
       }
        char ch=word.charAt(0);
       if(word.startsWith("apple")){
         return skipentireword(word.substring(5));
       }
       return ch+skipentireword(word.substring(1));
    }

    static void subsets(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subsets(p+ch, up.substring(1));
        subsets(p, up.substring(1));
        
         
         
    }

    static  void subsetsusingarraylist(String p,String up ,ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return;
        }
        char ch=up.charAt(0);
        subsetsusingarraylist(p+ch, up.substring(1),list);
        subsetsusingarraylist(p, up.substring(1),list);
    }

    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
           String f=p.substring(0, i);
           String s=p.substring(i,p.length());
           permutations(f+ch+s, up.substring(1));
        }
        
    }

     static ArrayList<String> permutationsusingArrayList(String p,String up,ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
           String f=p.substring(0, i);
           String s=p.substring(i,p.length());
           permutationsusingArrayList(f+ch+s, up.substring(1),list);
        }

        return list;
        
    }
    public static void main(String args[]){
          //String ans=skipcharacter("");
        // System.out.println(ans);
    //      String ans2=skipentireword("bdcappleba");
    //      System.out.println(ans2);
    //     ArrayList<String> ans=new ArrayList<>();
    //     subsetsusingarraylist("", "abc",ans);
    //     System.out.println(ans);
    //     permutations("", "abc");
    //     System.out.println(permutationsusingArrayList("", "abc", new ArrayList<>()));  
    // 
    }
}
