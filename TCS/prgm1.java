class prgm1 {
public static void main(String args[]){
int arr[]={1,2,3,4,5};
String name="jagadeesh";
countvowels(name);
int n=arr.length;
int ans=findmax(arr,n);
System.out.println("Max of given array is :"+ans);
}
public static int countvowels(String name){
  int count=0;
  int count1=0;
  for(int i=0;i<name.length();i++){
if(name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'||name.charAt(i)=='0'||name.charAt(i)=='u'){
  count++;
}
else{
count1++;
}
  }
System.out.println("no of vowels is:"+count);
System.out.println("no of consants is:"+count1);
return 0;
}
public static int findmax(int[] arr,int n){
      if(n==1){
        return arr[0];
      }
    int maxrem=findmax(arr,n-1);
    
    return (arr[n-1]>maxrem)?arr[n-1]:maxrem;
}
}
