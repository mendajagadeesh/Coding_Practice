public class RemoveduplicatesLL {
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
Node head=null;
void insert(int data){
    Node newnode=new Node(data);
    if(head==null){
        head=newnode;
    }
    else{
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
}
void dispay(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("End");
}

void removeduplicatesonsortedlist(){
    Node temp=head;
    while(temp!=null&&temp.next!=null){
            if(temp.data==temp.next.data){
                temp.next=temp.next.next;
            }
            else{
            temp=temp.next;
            }
    }
}

Node findMiddle(){
    Node slow=head;
    Node fast=head;
    while(fast!=null && fast.next!=null){
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}

    public static void main(String args[]){
        RemoveduplicatesLL list=new RemoveduplicatesLL();
        list.insert(10);
        list.insert(10);
        list.insert(20);
        list.insert(20);
        list.insert(30);
        list.removeduplicatesonsortedlist();
        Node mid=list.findMiddle();
        System.out.println(mid.data);
        list.dispay();
        
    }
}
