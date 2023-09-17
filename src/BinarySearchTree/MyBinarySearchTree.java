package BinarySearchTree;

public class MyBinarySearchTree {
	
	private Node root;
	
	private void insert(int data) {
		root = insertRec(root, data);
	}
	
	public Node insertRec(Node root,int data) {
		if(root == null) {
			root = new Node(data);
			return root;
		}
		if(data<root.data) {
			root.left = insertRec(root.left, data);
		}else if(data>root.data) {
			root.right = insertRec(root.right,data);
		}
		return root;
	}
	
	public void inorder() {
        inorderRec(root);
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }
	
	public static void main(String[] args) {
		MyBinarySearchTree bst = new MyBinarySearchTree();
		bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);
		
		bst.inorder();
	}

}
