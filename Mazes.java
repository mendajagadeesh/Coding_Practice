import java.util.ArrayList;

public class Mazes {

    static int No_of_roots(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int down=No_of_roots(r-1, c);
        int right=No_of_roots(r, c-1);
        return right+down;
    }

    static void No_of_rootspaths(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            No_of_rootspaths(p+"D",r-1, c);
        }
        if(c>1){
            No_of_rootspaths(p+"R",r,c-1);
        }
    }

    static ArrayList<String> No_of_rootspathsRec(String p,int r,int c){
         ArrayList<String> list=new ArrayList<>();
        if(r==1 && c==1){ 
            list.add(p);
            return list;
        }
        if(r>1){
             list.addAll(No_of_rootspathsRec(p+"D",r-1, c));
        }
        
        if(c>1){
            list.addAll(No_of_rootspathsRec(p+"R",r,c-1));
        }
        return list;
    }
    public static void main(String args[]){
        // int ans=No_of_roots(3, 3);
        // System.out.println(ans);
        // No_of_rootspaths("", 3, 3);
        System.out.println(No_of_rootspathsRec("", 3, 3));
    }
}
