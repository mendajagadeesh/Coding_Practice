import java.util.Arrays;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class Linkedlistreversal_Knodes {

    static Node ktimesReversal(Node head,int k){
        if(k<=0||head==null||head.next==null){
            return head;
        }
        Node current=head;
        Node prevTail=null;
        Node newHead=null;
        while(current!=null){
            Node segmenthead=current;
            int count=0;
            Node temp=current;
            while(count<k&&temp!=null){
                temp=temp.next;
                count++;
            }
             if (count < k) {
            // Less than k nodes left, no reversal
            if (prevTail != null) {
                prevTail.next = current;
            }
            break;
        }

        // Reverse k nodes
        Node prev = null;
        Node next = null;
        count = 0;
        while (count < k && current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
            count++;
        }

        if (newHead == null) {
            newHead = prev;
        }

        if (prevTail != null) {
            prevTail.next = prev;
        }

        prevTail = segmenthead;
    }
       return newHead;
    }

    static Node creation(int[] arr){
        if(arr.length==0)return null;
        Node dummy=new Node(0);
        Node current=dummy;
        for(int i=0;i<arr.length;i++){
            current.next=new Node(arr[i]);
            current=current.next;
        }
        return dummy.next;
    }

    static Node reverse(Node head){
        if(head==null||head.next==null)return head;
        Node prev=null;
        Node current=head;
        Node next=current.next;
        while(current!=null){
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null){
                next=next.next;
            }
        }
        return prev;
    }
    public static void main(String args[]){
        Node list=creation(new int[]{1,2,3,4,5});
        Node list1=ktimesReversal(list, 2);
        while(list1!=null){
            System.out.print(list1.val+" ");
            list1=list1.next;
        }

    } 
}
