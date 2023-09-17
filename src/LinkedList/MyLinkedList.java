package LinkedList;


public class MyLinkedList {
	
	private Node head;
	
	public void insert(int data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
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
		while(node.next!=null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	public static void main(String[] args) {
		MyLinkedList myLinkedList = new MyLinkedList();
		for(int i =1;i<5;i++) {
			myLinkedList.insert(i);
		}
		myLinkedList.display();
	}

}
