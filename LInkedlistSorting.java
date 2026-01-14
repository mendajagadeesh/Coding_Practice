class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class LInkedlistSorting {
static Node creation(int[] num){
    if(num.length==0)return new Node(0);
    Node dummy=new Node(0);
    Node current=dummy;
    for(int i=0;i<num.length;i++){
       current.next=new Node(num[i]);
       current=current.next;
    }
    return dummy.next;
}

static Node getmid(Node head){
    Node slow=head;
    Node fast=head.next;//this is used only for sorted lists mid purpose only
    while(fast!=null&&fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }return slow;
}

static Node merge(Node l1,Node l2){
    Node dummy=new Node(0);
    Node current=dummy;
    while(l1!=null && l2!=null){
        if(l1.val<l2.val){
          current.next=new Node(l1.val);
          current=current.next;
          l1=l1.next;
        }
        else{
            current.next=new Node(l2.val);
            current=current.next;
            l2=l2.next;
        }
    }
        while(l1!=null){
            current.next=new Node(l1.val);
            current=current.next;
            l1=l1.next;
        }

        while(l2!=null){
            current.next=new Node(l2.val);
            current=current.next;
            l2=l2.next;
        }
        return dummy.next;
}

static Node sorted(Node head){
    if(head==null|| head.next==null)return head;
    Node mid=getmid(head);
    Node right=mid.next;
    mid.next=null;
    Node left=sorted(head);
    right=sorted(right);
    Node finalresult=merge(left, right);
    return finalresult;
}
    public static void main(String args[]){
      Node l1=creation(new int[]{1,4,2,3,9,56,0,2,90});
      Node result=sorted(l1);
      while(result!=null){
        System.out.print(result.val+" ");
        result=result.next;
      }
    }
}
