class Node{
    int val;
    Node next;
    public Node(int val){
      this.val=val;
    }
}

public class Linkedlistadd{

  static Node creation(int[] arr){
    Node dummy=new Node(0);
    Node current=dummy;
    for(int i=0;i<arr.length;i++){
      current.next=new Node(arr[i]);
      current=current.next;
    }
    return dummy.next;

  }

  Node addtwolists(Node l1,Node l2){
    Node dummy=new Node(0);
    Node current=dummy;
    int carry=0;
    while(l1!=null || l2!=null || carry!=0){
      int sum=carry;
      int val1=(l1!=null)?l1.val:0;
      int val2=(l2!=null)?l2.val:0;
      sum+=val1+val2;
      current.next=new Node(sum%10);
      current=current.next;
      carry=sum/10;
      if(l1!=null)l1=l1.next;
      if(l2!=null)l2=l2.next;
    }
    return dummy.next;
  }
    public static void main(String args[]){
     Node l1=creation(new int[]{2,4,3});
     Node l2=creation(new int[]{5,6,4});
     Linkedlistadd obj=new Linkedlistadd();
    Node l3= obj.addtwolists(l1, l2);
    while(l3!=null){
      System.out.println(l3.val);
      l3=l3.next;
     }
    }
}