package LinkedList;


public class MyLinkedList {
	
	private Node head;
	
	public void insert(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node n = head;
			while(n.next!=null) {
				n = n.next;
			}
			n.next=newNode;
		}
	}
	
	public void display() {
		Node node = head;
		while(node!=null) {
			System.out.println("element in the node is\s"+node.data);
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		myLinkedList.insert(50);
		myLinkedList.insert(30);
		myLinkedList.insert(70);
		myLinkedList.insert(20);
		myLinkedList.insert(40);
		myLinkedList.insert(60);
		myLinkedList.insert(80);
		myLinkedList.display();
	}

}
