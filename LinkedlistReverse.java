class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class LinkedlistReverse {

    Node reverselinkedlist(Node head){
        if(head==null)return null;
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
    head=prev;
        return head;
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
    public static void main(String args[]){
        LinkedlistReverse obj=new LinkedlistReverse();

        Node list=obj.creation(new int[]{5,4,3,2,1});
        Node root=list;
       
        System.out.print("Before reversal of linked list:");
        while(root!=null){
            System.out.print(root.val+" ");
            root=root.next;
        }
        System.out.println();
        System.out.print("Afere reversal of linked list:");
        Node temp=list;
        Node reverselist=obj.reverselinkedlist(temp);
        while(reverselist!=null){
            System.out.print(reverselist.val+" ");
            reverselist=reverselist.next;
        }

    }
}
