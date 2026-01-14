public class prgm2 {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
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
           Node temp=head;
           if(head==null){
             head=newnode;
           }
           else{
              newnode.next=temp;
              temp.prev=newnode;
              head=newnode;
           }
        }
        void delete_at_particular_element(int key){
            Node temp=head;
            boolean found=false;
            if(head==null){
                System.out.println("list is empty");
                return;
            }
            while(temp!=null){
                if(temp.data==key){
                    found=true;
                    break;
                }
                temp=temp.next;
            }
            if(!found){
            System.out.println("element not found");
            return;
            }
            if(temp==head){
                head=head.next;
                if(head!=null){
                    head.prev=null;
                }
            }
            if(temp.next==null){
                temp.prev.next=null;
            }
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;

            
        }
        
        public static void main(String args[]){
        prgm2 list=new prgm2();
        list.creation(5);
        list.creation(15);
        list.creation(25);
        list.creation(35);
        list.insert_beg(20);
        list.delete_at_particular_element(25);
        list.display();
    }
}
