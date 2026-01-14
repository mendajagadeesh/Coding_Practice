import java.util.ArrayList;

public class Substringinnumberpad {
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            pad(p+ch, up.substring(1));
        }
    }

     static ArrayList<String> padusingArrayList(String p,String up,ArrayList<String> list){
        if(up.isEmpty()){
            list.add(p);
            return list;
        
        }
        int digit=up.charAt(0)-'0';
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            padusingArrayList(p+ch, up.substring(1),list);
        }
        return list;
    }
    public static void main(String args[]){
        // pad("", "12");
        System.out.println(padusingArrayList("", "12", new ArrayList<>()));

    }
}
