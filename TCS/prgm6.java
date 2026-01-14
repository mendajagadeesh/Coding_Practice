class stack{
        int arr[];
        int size;
       int top=-1;
        stack(int size){
            this.size=size;
            arr=new int[size];
        }

        void push(int data){
            if(top<size-1){
                arr[++top]=data;
            }
            else{
                //System.out.println("stack overflow");
                int temp []=new int[size*2];
                for(int i=0;i<arr.length;i++){
                    temp[i]=arr[i];
                }
                arr=temp;
                size=temp.length;
                arr[++top]=data;
            }
        }
        public boolean isEmpty(){
            return top==-1;
        }
        

        int pop(){
            if(!isEmpty()){
            return arr[top--];
            }
            else{
             System.out.println("stack underflow");
            return -1;
            }
        }

        void peek(){
            if(!isEmpty()){
            int ans=arr[top];
            System.out.println(ans);
            }
            else{
                System.out.println("stack is empty");
            }
        }
    }

class prgm6{

     public void reversestack(stack s1){
        if(s1.isEmpty()) return;
           int top=s1.pop();
           reversestack(s1);
           insertstack(s1,top);
        }
        public void insertstack(stack s1,int item){
            if(s1.isEmpty()){
                s1.push(item);
            }
            else{
                int top=s1.pop();
                insertstack(s1, item);
                s1.push(top);

            }
        }
    public static void main(String args[]){
        stack s=new stack(3);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.peek();
        System.out.print("Original Stack: ");
        for(int i=0;i<=s.top;i++){
            System.out.print(s.arr[i]+"->");
        }
        System.out.println("End");
        prgm6 p=new prgm6();

        p.reversestack(s);

        System.out.print("Reversed Stack: ");
        for(int i=0;i<=s.top;i++){
            System.out.print(s.arr[i]+"->");
        }
        System.out.println("End");


       

    }

    
}