public class AnagramCheck {

    boolean anagramcheck(String s1,String s2){
        if(s1.length()!=s2.length())return false;
        int freq[]=new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
        }

        for(int j=0;j<s2.length();j++){
            freq[s2.charAt(j)-'a']--;
        }
        // for(int i=0;i<s1.length();i++){
        //  if(freq[i]!=0){
        //      return false;
        //  }
        for(int count:freq){

        if(count!=0)return false;

         }
       return true;
    }
    public static void main(String args[]){
        AnagramCheck check=new AnagramCheck();
       System.out.println(check.anagramcheck("jagadeesh","hseedagaj"));
    }
}
