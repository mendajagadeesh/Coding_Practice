public class Accounts_Max_Wealth {
    static void max_wealth_checker(int arr[][]){
     int ans=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
            }

            if(sum>ans){
           ans=sum;
           }
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int arr[][]={
            {1,2,3},
            {3,2,1},
            {10,20,30}
        };
        max_wealth_checker(arr);
        
        
    }
}
