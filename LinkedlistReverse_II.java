class ListNode{
    int val;
    ListNode next;
    ListNode(int val){
        this.val=val;
    }
}
public class LinkedlistReverse_II {
  //I done this code using ai help.
    static ListNode linkedlistreverseII(ListNode head,int left,int right){
        if(left==right)return head;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
       
        for(int i=1;i<left;i++){
          prev=prev.next;
        }
        ListNode current=prev.next;
        ListNode next=null;
        for(int i=0;i<right-left;i++){
            next=current.next;
            current.next=next.next;
            next.next=prev.next;
            prev.next=next;
        }
        return dummy.next;
        
        
    }

    static ListNode Reverse(ListNode head){
        if(head==null)return head;
        ListNode prev=null;
        ListNode current=head;
        ListNode next=current.next;
        while(current!=null){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null)next=next.next;
        }
        return prev;
    }

    static ListNode creation(int[] nums){
        if(nums.length==0)return null;
        ListNode dummy=new ListNode(0);
        ListNode current=dummy;
        for(int i=0;i<nums.length;i++){
            current.next=new ListNode(nums[i]);
            current=current.next;
        }
        return dummy.next;
    }
    public static void main(String args[]){
      ListNode l1=creation(new int[]{1,2,3,4,5});
      ListNode l3=l1;

    //   ListNode l2=Reverse(l1);
    //   while(l2!=null){
    //     System.out.println(l2.val);
    //     l2=l2.next;
    //   }
      int right=4;
      int left=2;
      ListNode l4=linkedlistreverseII(l3,left,right);
      while(l4!=null){
        System.out.println(l4.val);
        l4=l4.next;
      }
    }
}
