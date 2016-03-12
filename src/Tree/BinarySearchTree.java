package Tree;

public class BinarySearchTree {
	static Node root;

	public BinarySearchTree() {
		root = null;
	}

	// method to insert node
	public void insert(int key) {
		root = insertRec(root, key);
	}

	public Node insertRec(Node root, int key) {
		// if tree is empty add the key and return the new node
		if (root == null) {
			root = new Node(key);
			return root;
		}

		// otherwise recur down the tree
		if (key > root.key) {
			root.right = insertRec(root.right, key);
		} else if (key < root.key) {
			root.left = insertRec(root.left, key);
		}

		return root;
	}

	// method to do traversal

	public void inOrder(Node root) {
		if (root != null) {
			inOrder(root.left);
			System.out.println(root.key);
			inOrder(root.right);
		}
	}

	
	// method to do search
	// A utility function to search a given key in BST
	public Node search(Node root, int key)
	{
	    // Base Cases: root is null or key is present at root
	    if (root==null || root.key==key)
	        return root;
	 
	    // val is greater than root's key
	    if (root.key > key)
	        return search(root.left, key);
	 
	    // val is less than root's key
	    return search(root.right, key);
	}
	

	// method to print lowest common ancestor
	public Node lca(Node node,int n1,int n2){
		if(node == null){
			return null;
		}
		

        // If both n1 and n2 are smaller than root, then LCA lies in left
        if (node.key > n1 && node.key > n2) {
            return lca(node.left, n1, n2);
        }
 
        // If both n1 and n2 are greater than root, then LCA lies in right
        if (node.key < n1 && node.key < n2) {
            return lca(node.right, n1, n2);
        }
 
        return node;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
//		tree.insert(50);
//		tree.insert(30);
//		tree.insert(20);
//		tree.insert(40);
//		tree.insert(70);
//		tree.insert(60);
//		tree.insert(80);

//		// print inorder traversal of the BST
//		tree.inOrder(root);
//		
//		Node val = (tree.search(root, 100));
//		System.out.println(val);

		tree.root = new Node(20);
        tree.root.left = new Node(8);
        tree.root.right = new Node(22);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(12);
        tree.root.left.right.left = new Node(10);
        tree.root.left.right.right = new Node(14);
        
        int n1 = 10, n2 = 14;
        Node t = tree.lca(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.key);
 
        n1 = 14;
        n2 = 8;
        t = tree.lca(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.key);
 
        n1 = 10;
        n2 = 22;
        t = tree.lca(root, n1, n2);
        System.out.println("LCA of " + n1 + " and " + n2 + " is " + t.key);
 
	}

}
