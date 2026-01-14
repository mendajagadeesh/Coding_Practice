class stack{
    int size;
    int top=-1;
    String arr[];
    stack(int size){
       this.size=size;
       arr=new String[size];
    }
    boolean isEmpty(){
        return top==-1;
    }

    void push(String data){
        if(top<size-1){
           arr[++top]=data;
        }
        else{
            System.out.println("stack is full");
        }
    }

    String pop(){
        if(!isEmpty()){
            String val=arr[top--];
            return val;
        }
        
        else{
             System.out.println("stack is empty");
            return null;
        }
    }

    void peek(){
        if(!isEmpty()){
            String ans=arr[top];
            System.out.println("______________________________");
            System.out.println(ans);
            System.out.println("______________________________");
        }
        else{
            System.out.println("stack is empty");
        }
    }
}
public class prgm8 {
    public static void  main(String args[]){
       stack s=new stack(5);
       s.push("wakeup");
        s.push("freshup");
         s.push("yoga");
          s.push("breakfast");
           s.push("go to college");
           s.peek();
           s.pop();
           boolean t=s.isEmpty();
           System.out.println("Stack is empty?->"+t);

        for(int i=0;i<=s.top;i++){
            System.out.println(s.arr[i]);
        }
    }
}
