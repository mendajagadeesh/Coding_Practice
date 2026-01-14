public class prgm3 {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
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
        }
    }

    void display(){
        Node temp=head;
        if(head==null){
            System.out.println("list is empty");
        }
        else{
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    }
    void remove_duplicates(){
        Node temp=head;
        while(temp!=null){
            Node current =temp;
            while(current.next!=null){
               if(current.next.data==temp.data){
                current.next=current.next.next;
               }
               else{
                current=current.next;
               }
               
            }
            temp=temp.next;
        }
    }
public static void main(String args[]){
    prgm3 list=new prgm3();
    list.creation(1);
     list.creation(2);
      list.creation(3);
       list.creation(2);
        list.creation(4);
         list.creation(3);
         System.out.println("Before removing duplicates");
         list.display();
          System.out.println("After removing duplicates");
         list.remove_duplicates();
    list.display();

}
}
