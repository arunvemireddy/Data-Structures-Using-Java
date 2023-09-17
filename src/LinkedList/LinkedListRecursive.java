package LinkedList;

import BinarySearchTree.MyBinarySearchTree;

public class LinkedListRecursive {
	
	private Node head;
	
	public void insert(int data) {
		head = insertRec(head,data);
	}
	
	public Node insertRec(Node head, int data) {
		
		if(head == null) {
			head = new Node(data);
		}
		else {
			head.next = insertRec(head.next, data);
		}
		return head;
	}
	
	public void display() {
		Node node = head;
		while(node!=null) {
			System.out.println("element in the node is\s"+node.data);
			node = node.next;
		}
	}
	
	
	public static void main(String[] args) {
		LinkedListRecursive linkedListRecursive = new LinkedListRecursive();
		linkedListRecursive.insert(50);
		linkedListRecursive.insert(30);
		linkedListRecursive.insert(70);
		linkedListRecursive.insert(20);
		linkedListRecursive.insert(40);
		linkedListRecursive.insert(60);
		linkedListRecursive.insert(80);
	
		linkedListRecursive.display();
	}
	
	

}
