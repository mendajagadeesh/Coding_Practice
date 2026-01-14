class Maxprofit {

    public int maximumProfit(int prices[]) {
        int res=0;
        int minsofar=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            if(minsofar>prices[i]){
                minsofar=prices[i];
            }
            if(prices[i]-minsofar>max){
                max=prices[i]-minsofar;
            }
            res=max;
        }
        
        return res;
    }
    public static void main(String args[]){
        int prices[]={7,10,1,3,6,9,2};
       Maxprofit s=new Maxprofit();
        System.out.println(s.maximumProfit(prices));
    }
}