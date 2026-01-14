public class Circular_ll {
    class Node{
        int data;
        Node next;
        Node(int data){
              this.data=data;
              this.next=null;
        }
    } Node head=null;

    void creation(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            newnode.next=head;
        }
        else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.next=head;
        }
    }

    void display(){
        Node temp=head;
        if(head==null){
            System.out.println("list is empty");
        }
        else{
        do{
            System.out.print(temp.data+"->");
            temp=temp.next;
        }while(temp!=head);
        System.out.println("null");
    }
    }
    void insert_beg(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            newnode.next=head;
        }
        else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            newnode.next=head;
            temp.next=newnode;
            head=newnode;
        }
    }
    void insert_end(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            newnode.next=head;
        }
        else{
            Node temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.next=head;
        }
    }
    void insert_at_pos(int data,int pos){
        Node newnode=new Node(data);
        Node temp=head;
        if(head==null){
            head=newnode;
            newnode.next=head;
        }
        else{
        int i=0;
        while(i<pos-1){
            temp=temp.next;
            i++;
        }
        Node t=temp.next;
        temp.next=newnode;
        newnode.next=t;
    }
    }
    void deletebeg(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
           Node temp=head;
           while(temp.next!=head){
            temp=temp.next;
           }
           head=head.next;
           temp.next=head;
        }
    }

    void delete_end(){
        Node temp=head;
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            while(temp.next.next!=head){
                temp=temp.next;
            }
            temp.next=head;
        }
    }
    void delete_at_pos(int pos){
        Node temp=head;
        if(head==null){
           System.out.println("list is empty");
        }
        else{
            int i=0;
            while(i<pos-1){
               temp=temp.next;
               i++;
            }
            temp.next=temp.next.next;
        }
    }
    void searching(int key){
        Node temp=head;
        boolean found=false;
        do{
            if(temp.data==key){
            System.out.println("element found");
            found=true;
            break;
            }
            temp=temp.next;
        }while(temp!=head);
        if(!found){
            System.out.println("element is not found");
        }
    }
    public static void main(String args[]){
        Circular_ll list=new Circular_ll();
        list.creation(10);
        list.creation(20);
        list.creation(30);
        list.creation(40);
        list.creation(50);
        list.insert_beg(5);
        list.insert_end(60);
        list.insert_at_pos(300, 2);
        list.delete_at_pos(2);
        list.deletebeg();
        list.delete_end();
        list.searching(10);
        list.display();
    }
}
