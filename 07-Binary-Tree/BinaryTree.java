
public class Node {
	String data;
	Node left;
	Node right;

	public Node(String data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

}

public class Main {
	
	static boolean isLeaf(Node node) {
		return ((node.left == null) && (node.right == null));
	}
	
	static int countNodes(Node node) {
		
		if (node == null) {
			return 0;
		}
		return (1 + countNodes(node.left) + countNodes(node.right)); 
	}

	static void preorder (Node node) {
		
		if (node == null) {
			return;
		}
		System.out.print(node.data + " "); // 1. Node
		preorder(node.left);               // 2. Left
		preorder(node.right);              // 3. Right
	}

	static void inorder (Node node) {
		
		if (node == null) {
			return;
		}
		inorder(node.left);                  // 1. Left
		System.out.print(node.data + " ");   // 2. Node
		inorder(node.right);                 // 3. Right
	}

	static void postorder (Node node) {
		
		if (node == null) {
			return;
		}
		postorder(node.left);               // 1. Left
		postorder(node.right);              // 2. Right
		System.out.print(node.data + " ");  // 3. Node
	}

	static void printLeaf(Node node) {
    	
		if (IsLeaf(node)) {
			System.out.println(node.data);
			return;
		}
		printLeaf(node.left);
		printLeaf(node.right);
		
	}

	public static void main(String[] args) {

    // Creating Nodes
		Node A = new Node("A");
		Node B = new Node("B");
		Node C = new Node("C");
		Node D = new Node("D");
		Node E = new Node("E");
		Node F = new Node("F");
		Node G = new Node("G");
		Node H = new Node("H");
		Node I = new Node("I");
		
		// A has two children: B & C
		A.left = B;
		A.right = C;
				
		// B has two children: D & E
		B.left = D;
		B.right = E;
				
		// E has only one child on the left: G
		E.left = G;
				
		// C has only one child on the right: F
		C.right = F;
				
		// F has only one child on the left: H
		F.left = H;		
		
		// Adding node I as the right Child of G
		G.right = I;
		
		// Displaying 
		System.out.println("Right of G: " + G.right.data);
		System.out.println("Nodes in B: " + countNodes(B));
		System.out.println("Preorder: ");
		preorder(A);
		
		// Reasons
		System.out.println("\nReasons:-");
		System.out.println("We got 5 nodes because if if we consider it a subtree, total nodes are 5(including the root i.e B)");
		System.out.println("Tree is balanced because there is height difference of -1.");
		
	}

}
