import java.util.Stack;

public class QueueusingTwostacks {
private Stack<Integer> first;
private Stack<Integer> second;

public QueueusingTwostacks(){
    first=new Stack<>();
    second=new Stack<>();
}

public void add(int num){
    first.push(num);
}

public int remove(){
    while(!first.isEmpty()){
        second.push(first.pop());
    }
    int poppeditem=second.pop();
    while(!second.isEmpty()){
        first.push(second.pop());
    }
    return poppeditem;
}

public int peek(){
    while(!first.isEmpty()){
        second.push(first.pop());
    }
    int peekitem=second.pop();
    while(!second.isEmpty()){
        first.push(second.pop());
    }
    return peekitem;
}
public static void main(String args[]){
    QueueusingTwostacks queue=new QueueusingTwostacks();
    queue.first.add(10);
    queue.first.add(20);
    System.out.println(queue.remove());
    System.out.println(queue.peek());
}
    
}
