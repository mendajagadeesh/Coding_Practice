class Node{
    int val;
    Node left=null;
    Node right=null;
    Node(int val){
        this.val=val;
    }
    
}
 
public class BinaryTree {
    static Node root;
   public void insert(int val){
       root=insertrec(root,val);
    }

    private Node insertrec(Node current,int val){
        if(current==null){
            return new Node(val);
        }
        if(val<current.val){
            current.left=insertrec(current.left, val);
        }
        else if(val>current.val){
            current.right=insertrec(current.right, val);
        }
        return current;
    }
    void inordertraversal(Node root){
        if(root==null)return;
        inordertraversal(root.left);
        System.out.print(root.val+" ");
        inordertraversal(root.right);
    }
    public static void main(String args[]){
     BinaryTree tree=new BinaryTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);
        tree.inordertraversal(root);

    }
}
