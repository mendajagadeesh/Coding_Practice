class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class LinkedlistPalindromeCheck {
    
    boolean palindromecheck(Node head){
        if(head==null||head.next==null)return true;
        Node mid=midnode(head);
        Node secondhalf=reverse(mid);
        Node firsthalf=head;
        while(secondhalf!=null){
            if(firsthalf.val!=secondhalf.val)return false;
                firsthalf=firsthalf.next;
                secondhalf=secondhalf.next;
        }
        return true;
    }

    Node reverse(Node head){
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

    Node midnode(Node head){
        if(head==null)return head;
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
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
    public static void main(String args[]){
        LinkedlistPalindromeCheck obj=new LinkedlistPalindromeCheck();

        Node list=obj.creation(new int[]{1,2,3,2,1});
        boolean result=obj.palindromecheck(list);
        System.out.println(result);

        
    }
}
