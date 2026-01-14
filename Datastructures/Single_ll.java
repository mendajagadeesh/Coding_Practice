class Linked_list{
    static class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
static Node head,temp;
public  void creation(int data){
    Node newnode=new Node(data);
    if(head==null){
        head=newnode;
    }
    else{
        temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }
}
void display(){
    Node temp=head;
    while(temp!=null){
        
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
}
void insertbeg(int data){
    Node temp=new Node(data);
    temp.next=head;
    head=temp;
}
void insertend(int data){
Node temp=head;
Node temp1=new Node(data);
while(temp.next!=null){
    temp=temp.next;
}
temp.next=temp1;
}

void insert_at_pos(int data,int pos){
Node temp=head;
Node temp1=new Node(data);
int i=0;
while(i<pos){
    temp=temp.next;
    i++;
}
Node t=temp.next;
temp.next=temp1;
temp1.next=t;

}

void deletebeg(){
    Node temp=head;
    temp=temp.next;
    head=temp;
}
void delete_end(){
    Node temp=head;
    Node temp1=temp.next;
    while(temp.next!=null){
        temp1=temp;
        temp=temp.next;
        
    }
    temp1.next=null;
}
void delete_at_pos(int pos){
Node temp=head;
int i=1;
while(i<pos-1){
    temp=temp.next;
    i++;
}
temp.next=temp.next.next;

}
void searching(int data){
    Node temp=head;
    while(temp.next!=null){
        if(data==temp.data){
            System.out.println("element is found");
        }
        temp=temp.next;
        
    }
}
}
class Single_ll {
    public static void main(String[] args) {
        Linked_list list=new Linked_list();
        list.creation(1);
        list.creation(2);
        list.creation(3);
        list.creation(4);
        list.creation(5);
        list.insertbeg(100);
        list.insertend(20);
        list.insert_at_pos(5000,2);
        list.deletebeg();
        list.delete_end();
        list.delete_at_pos(3);
        list.searching(1);
        list.display();
    }
}
