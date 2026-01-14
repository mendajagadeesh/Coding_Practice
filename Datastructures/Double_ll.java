public class Double_ll {
    static class Node{
        int data;
        Node prev;
        Node next;
        public Node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;

        }

    }
Node head=null;
    void creation(int data){
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
            newnode.prev=temp;
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

void insert_beg(int data){
    Node newnode=new Node(data);
    if(head==null){
     head=newnode;
    }
    else{
        newnode.next=head;
        head=newnode;
    }
}
void insert_end(int data){
    Node temp=head;
    Node newnode=new Node(data);
    if(temp==null){
        head=newnode;
    }
    else{
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
    }
}

void insert_at_pos(int data,int pos){
Node temp=head;
Node newnode=new Node(data);
if(head==null){
    head=newnode;
}
else{
    int i=0;
    while(i<pos){
     temp=temp.next;
     i++;
    }
    newnode.next=temp.next;
    newnode.prev=temp;
    temp.next=newnode;

}

}
void deletebeg(){
    Node temp=head;
    if(head==null){
     System.out.println("list is empty");
    }
    else{
        temp=temp.next;
        head=temp;
    }

}
void delete_end(){
    Node temp=head;
    if(head==null){
     System.out.println("list is empty");
    }
    else{
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
       
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
while(temp.next!=null){
    if(temp.data==key){
        System.out.println("element found");
        found=true;
        break;
        
    }
   
    temp=temp.next;
}
 if(!found) {
        System.out.println("element not found");
    }
}
    public static void main(String[] args) {
        Double_ll list=new Double_ll();
        list.creation(10);
          list.creation(20);
            list.creation(30);
              list.creation(40);
                list.creation(50);
                list.insert_beg(5);
                list.insert_end(60);
                list.insert_at_pos(5000, 2);
                list.deletebeg();
                list.delete_end();
                list.delete_at_pos(2);
                list.searching(20);

        list.display();
    }

}
