class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
public class LinkedListCycle {

    static Node creation(int[] arr){
        Node dummy=new Node(0);
        Node current=dummy;
        for(int i=0;i<arr.length;i++){
            current.next=new Node(arr[i]);
            current=current.next;
        }
        return dummy.next;

    }

    static void insertatpos(Node head,int pos){//cycle list making
        if(head==null||pos<0)return;
        Node cycleEntry=null;
        Node tail=head;
        int index=0;
        while(tail.next!=null){
            if(index==pos){
                cycleEntry=tail;
            }
            tail=tail.next;
            index++;
        }
        if(cycleEntry!=null){
            tail.next=cycleEntry;
        }
    }

    static boolean cyclelinkedlistcheck(Node l1){
        Node slow=l1;
        Node fast=l1;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
        
    }

    static int cyclelinkedlistsize(Node l1){
        Node slow=l1;
        Node fast=l1;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                int count=1;
                Node current=slow.next;
                while(current!=slow){
                    count++;
                    current=current.next;
                }
                return count;
            }
        }
        return -1;
        
    }


        static Node cyclelinkedliststartNode(Node l1){
        Node slow=l1;
        Node fast=l1;
       
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                 Node temp=l1;
                while(slow!=temp){
                    slow=slow.next;
                    temp=temp.next;
                }
                return temp;
            }
        }
        return null;
        
    }


    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8};
        Node l1=creation(arr);
        insertatpos(l1, 3);

        // while(l1!=null){
        //     System.out.print(l1.val+"->");
        //     l1=l1.next;
        // }

        System.out.println("The given list have cycle or not:"+cyclelinkedlistcheck(l1));
        System.out.println("cycle size is :"+cyclelinkedlistsize(l1));
        Node startnodeofcycle=cyclelinkedliststartNode(l1);
        System.out.println(startnodeofcycle.val);
    }
}
