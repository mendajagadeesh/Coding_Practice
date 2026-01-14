public class MedianofTwoSortedlists {

    double findmedian(int[] arr1,int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        if(n==0&&m==0)return 0;
        int l1=Integer.MIN_VALUE;
        int l2=Integer.MIN_VALUE;
        int r1=Integer.MAX_VALUE;
        int r2=Integer.MAX_VALUE;
        int mid=0;
        if(arr1.length%2!=0){
           mid=arr1.length/2+1;
        }
        else{
          mid=arr1.length/2;
        }
        int high=arr1.length;
        double median=0;
        if(l1==Integer.MIN_VALUE)l1=arr1[mid];
        if(l2==Integer.MIN_VALUE)l2=arr2[mid-1];
        if(r1==Integer.MAX_VALUE)r1=arr1[mid+1];
        if(r2==Integer.MAX_VALUE)r2=arr2[mid];
        if(l1<r2&&l2<r1){
           int max=Math.max(l1,l2);
           int min=Math.min(r1, r2);
           median=max+min/2.0;
        }
        else if(l1!=0) {
          mid=mid+1;
        }
        else{
            mid=high-mid;
        }
        return median;

    }
    public static void main(String args[]){
       MedianofTwoSortedlists obj=new MedianofTwoSortedlists();
       int[] arr1={1,2,3,4,5};
       int arr2[]={1,3,9,10,12};
       double result=obj.findmedian(arr1, arr2);
       System.out.println(result);
    }
}
