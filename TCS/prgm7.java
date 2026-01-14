 class queue{
    int size;
    int front=0;
    int rear=-1;
    int arr[];
    queue(int size){
        this.size=size;
        arr=new int[size];
    }

    boolean isEmpty(){
        return rear<front;
    }

    void enqueue(int data){

        if(!isFull()){
        arr[++rear]=data;
        }else{
            System.out.println("Queue is full");
            int temp[]=new int[size*2];
            for(int i=0;i<arr.length;i++){
                temp[i]=arr[i];
            }
            arr=temp;
            size=temp.length;
            arr[++rear]=data;
        }
    }

    int dequeue(){
        if(!isEmpty()){
          int val= arr[front++];
          if(front>rear){
            front=0;
            rear=-1;

          }
          return val;
        }
        else{
            System.out.println("queue is empty");
            return -1;
        }
    }

    boolean isFull(){
       return rear==size-1;
    }
}





public class prgm7 {
   public static void main(String args[]){
     queue q=new queue(5);
     q.enqueue(10);
     q.enqueue(20);
     q.enqueue(30);
     q.enqueue(40);
     q.enqueue(50);
     q.enqueue(10);
     q.enqueue(20);
     q.enqueue(30);
     q.enqueue(40);
     q.enqueue(50);
     q.dequeue();
     q.dequeue();
     q.dequeue();
     q.dequeue();
     q.dequeue();
   for(int i=q.front;i<=q.rear;i++){
       System.out.print(q.arr[i]+"->");
   }System.out.println("End");
}

}
