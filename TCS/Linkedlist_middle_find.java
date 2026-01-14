class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class Linkedlist_middle_find {

    Node creation(int[] arr){
        Node dummy=new Node(0);
        Node current=dummy;
        for(int num:arr){
            current.next=new Node(num);
            current=current.next;
        } 
        return dummy.next;
    }

    Node findmidoflinkedlist(Node head){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public static void main(String args[]){
        Linkedlist_middle_find obj=new Linkedlist_middle_find();
     int[] arr={1,2,3,4,5};
     Node l1=obj.creation(arr);
     Node l2=l1;
     while(l1!=null){
        System.out.print(l1.val+"->");
        l1=l1.next;
     }
     System.out.println("End");
     Node mid=obj.findmidoflinkedlist(l2);
     System.out.println();
     System.out.println("mid of linked list value is: "+mid.val);
    }
}
