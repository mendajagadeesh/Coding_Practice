class TreeNode{
    int data;
     TreeNode left,right;
     TreeNode(int data){
        this.data=data;
        left=right=null;
     
     }
}


public class prgm9 {
    public static void main(String args[]){
         TreeNode root=new TreeNode(10);
           root.left=new TreeNode(8);
            root.right=new TreeNode(20);
             root.left.left=new TreeNode(5);
              root.left.right=new TreeNode(9);
              System.out.print("Inorder Traversal:-");
              inorder(root);
    }

    private static void inorder(TreeNode root) {
       if(root==null) return;
       inorder(root.left);
       System.out.print(root.data+" ");
       inorder(root.right);
      
    
    
    }
}
