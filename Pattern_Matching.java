import java.util.ArrayList;
import java.util.Arrays;

public class Pattern_Matching {

    int[] constructLps(String s){
        int[] LPS=new int[s.length()];
        LPS[0]=0;
       char[] list=s.toCharArray();
       int len=0;
        for(int i=1;i<s.length();i++){
            while(len>0&&s.charAt(i)!=s.charAt(len)){
               len=LPS[len-1];
            }
             if(list[len]==list[i]){
                len++;
            }
                LPS[i]=len;
        }

        return LPS;

    }

    ArrayList<Integer> Stringmatching(String text,String pattern){
        int LPS[]=constructLps(pattern);
        ArrayList<Integer> list=new ArrayList<>();
        int i=0;int j=0;
        while(i<text.length()){
            if(text.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
            }
    
         if(j == pattern.length()){
            list.add(i-j);
            j = LPS[j - 1];
        } 
        else if(i < text.length() && text.charAt(i) != pattern.charAt(j)){
            if(j != 0){
                j = LPS[j - 1];
            } else {
                i++;
            }
        }
    }
        return list;
    }
    public static void main(String args[]){
     Pattern_Matching obj=new Pattern_Matching();
     int[] ans=obj.constructLps("ababc");
     System.out.println(Arrays.toString(ans));
     System.out.println(obj.Stringmatching("ababcababc","ababc"));
    }
}
