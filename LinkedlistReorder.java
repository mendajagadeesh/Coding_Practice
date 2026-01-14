class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class LinkedlistReorder {

    Node findmidnode(Node head){
        if(head==null||head.next==null)return head;
        Node slow=head;
        Node fast=head;
        while(fast!=null&& fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    Node creation(int[] arr){
        if(arr.length==0)return null;
        Node dummy=new Node(0);
        Node current=dummy;
        for(int i=0;i<arr.length;i++){
           current.next=new Node(arr[i]);
           current=current.next;
        }
        return dummy.next;

    }

    Node reorder(Node head){
        if(head==null||head.next==null)return head;
        Node firsthalf=head;
        Node mid=findmidnode(head);
        Node secondhalf=reverse(mid.next);
        mid.next=null;
        Node dummy=new Node(0);
        Node current=dummy;
        while(firsthalf!=null||secondhalf!=null){
            if(firsthalf!=null){
                current.next=firsthalf;
                current=current.next;
                firsthalf=firsthalf.next;
            }
            if(secondhalf!=null){
                current.next=secondhalf;
                current=current.next;
                secondhalf=secondhalf.next;
            }
        }
        return dummy.next;

    }

    Node reverse(Node head){
        if(head==null||head.next==null)return head;
        Node prev=null;
        Node current=head;
        Node Next=current.next;
        while(current!=null){
            current.next=prev;
            prev=current;
            current=Next;
            if(Next!=null){
                Next=Next.next;
            }
        }
        return prev;

    }
    public static void main(String args[]){
        LinkedlistReorder obj=new LinkedlistReorder();
        Node list=obj.creation(new int[]{1,2,3,4,5});
        Node list1=obj.reorder(list);
        while(list1!=null){
            System.out.print(list1.val+" ");
            list1=list1.next;
        }
    }
}
