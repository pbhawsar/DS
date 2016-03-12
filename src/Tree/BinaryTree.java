package Tree;

class Node {
     int key;
     Node left;
     Node right;
     public Node(int item){
    	 key=item;
    	 left = right = null;
     }
}
public class BinaryTree {

	// root of tree
	
	public static Node root;
	
//	public BinaryTree(int key){
//		root = new Node(key);
//	}
	
	public BinaryTree(){
		root=null;
	}
	
	
	  /* Given a binary tree, print its nodes in inorder*/
    void printInorder(Node node)
    {
        if (node == null)
            return;
 
        /* first recur on left child */
        printInorder(node.left);
 
        /* then print the data of node */
        System.out.print(node.key + " ");
 
        /* now recur on right child */
        printInorder(node.right);
    }
    
    
    // tree inorder traversal without recursion
    
    /* Function to traverse binary tree without recursion and 
    without stack */
   void MorrisTraversal(Node node) {
       Node current, pre;
        
       if (node == null) {
           return;
       }
        
       current = node;
       while (current != null) {
           if (current.left == null) {
               System.out.print(current.key + " ");
               current = current.right;
           } else {

               /* Find the inorder predecessor of current */
               pre = current.left;
               while (pre.right != null && pre.right != current) {
                   pre = pre.right;
               }

               /* Make current as right child of its inorder predecessor */
               if (pre.right == null) {
                   pre.right = current;
                   current = current.left;
               } 

                /* Revert the changes made in if part to restore the original 
                tree i.e., fix the right child of predecssor */ else {
                   pre.right = null;
                   System.out.print(current.key + " ");
                   current = current.right;
               }   /* End of if condition pre->right == NULL */
                
           } /* End of if condition current->left == NULL*/
            
       } /* End of while */
        
   }
    
   // find the max depth or height of tree  
   // height = depth+1;
   public int maxDepth(Node node){
	   if(node == null){
		   return 0;
	   }else{
		   //compute the depth of each subtree
		   int lDepth = maxDepth(node.left);
		   int rDepth = maxDepth(node.right);
		   /* use the larger one */
           if (lDepth > rDepth) {
               return (lDepth + 1);
           } else {
               return (rDepth + 1);
           }   
	   }
	   
	   
   }
    // print all the leaf node of tree
   public static int printLeafCount(Node node){
	   if(node == null){
		   return 0;
	   }else if(node.left==null&&node.right==null){
		   return 1;
	   }else {
		   return printLeafCount(node.left)+printLeafCount(node.right);
	   }
	   
   }
    
  
   // method to check if binary tree is BST
   /* can give min and max value according to your code or
   can write a function to find min and max value of tree. */

   /* returns true if given search tree is binary
    search tree (efficient version) */
   boolean isBST()  {
       return isBSTUtil(root, Integer.MIN_VALUE,
                              Integer.MAX_VALUE);
   }

   /* Returns true if the given tree is a BST and its
     values are >= min and <= max. */
   boolean isBSTUtil(Node node, int min, int max)
   {
       /* an empty tree is BST */
       if (node == null)
           return true;

       /* false if this node violates the min/max constraints */
       if (node.key < min || node.key > max)
           return false;

       /* otherwise check the subtrees recursively
       tightening the min/max constraints */
       // Allow only distinct values
       return (isBSTUtil(node.left, min, node.key-1) &&
               isBSTUtil(node.right, node.key+1, max));
   }
	public static void main(String args[]){
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left=new Node(2);
		tree.root.right= new Node(3);
		tree.root.left.left=new Node(4);
		tree.root.left.right=new Node(5);
		
		  System.out.println("\nInorder traversal of binary tree is ");
	        tree.printInorder(root);
	        
	        System.out.println("Print iterative tree traversal");
	        tree.MorrisTraversal(root);
	        
	        System.out.println("Height of tree is : " + tree.maxDepth(root));
	        
	        System.out.println("Count of leaf in tree is :"+tree.printLeafCount(root));
	        
	        if (tree.isBST())
	            System.out.println("IS BST");
	        else
	            System.out.println("Not a BST");
	}
	
}
