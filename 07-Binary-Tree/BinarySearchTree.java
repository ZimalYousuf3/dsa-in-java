
public class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}


public class BST {
	Node root;

	public BST() {
		this.root = null;
	}

	// Inserting node (compares from root)
	Node insert(Node node, int value) {
		
		if (node == null) {
			return new Node(value);
		}
		
		if (value < node.data) {
			node.left = insert(node.left, value);
		}
		
		else if (value > node.data) {
			node.right = insert(node.right, value);
		}
		
		return node;
	}
  
	// called in main
	void insert(int value) {
		root = insert(root, value);
	}
	
	// Searching a value (compares from root)
	boolean search (Node node, int value) {
		
		if (node == null) {
			return false;
		}
		
		else if (value == node.data) {
			return true;
		}
		
		else if (value < node.data) {
			return search(node.left, value);
		}
		
		return search(node.right, value);	
	}

  // called in main
	boolean search (int value) {
		return search(root, value);
	}

  // Deleting a Node
    Node deleteNode(Node node, int value) {
		
		if (node == null) {
			return null;
		}
		
		if (value < node.data) {
			node.left = deleteNode(node.left, value);
		}
		
		else if (value > node.data) {
			node.right = deleteNode(node.right, value);
		}
		
		else {
			
			// Case-1: No children (Leaf Node)
			if (node.left == null && node.right == null) {
				return null;
			}
			
			// Case-2: Only Right Child
			else if (node.left == null) {
				return node.right;
			}
			
			// Case-3: Only Left Child
			else if (node.right == null) {
				return node.left;
			}
			
			// Case-4: Two Children
			else {
				
				Node successor = findMin(node.left);
				node.data = successor.data;
				node.left = deleteNode(node.left, successor.data);
			}
		}
		return node;
	}
	
	void deleteNode(int value) {
		root = deleteNode(root, value);
	}
	
	// Find minimum value
	Node findMin(Node node) {
		
		while (node.left != null) {
			node = node.left;
		}
		return node;
	}
	
}
}

public class Main {

	public static void main(String[] args) {
		
		BST tree = new BST ();
		
		// Inserting nodes
		tree.insert(50);
		tree.insert(30);
		tree.insert(70);
		tree.insert(20);
		tree.insert(40);
		tree.insert(60);
		tree.insert(80);
		
		// Inserting message
		System.out.println(" Tree created successfully. ");
		
		// Searching a value
		System.out.println(" Search 60: " + (tree.search(60)? "Found": "Not found"));
		System.out.println(" Search 99: " + (tree.search(99)? "Found": "Not found"));
	}

}

