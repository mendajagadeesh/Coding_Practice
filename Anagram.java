import java.util.*;
class Anagram{
    public static void Anagramcheck(String s1,String s2){
        if(s1.length()!=s2.length())return;
        char[] a=s1.toCharArray();
        char[] b=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(Arrays.equals(a,b)){
            System.out.println(s1+" <--> "+s2);
        };

    }
    public static void main(String args[]){
       String[] words={"apple","cat","tac","mango"};
       for(int i=0;i<words.length;i++){
        for(int j=i+1;j<words.length;j++){
            Anagramcheck(words[i],words[j]);
        }
       }
    }
}