package Stack;

public class MyStack {
	
	private int maxSize;
	private int top;
	private int[] stackArray;
	
	public MyStack(int size) {
		maxSize = size;
		stackArray = new int[size];
		top = -1; // initialize top to -1 to indicate stack is empty
	}
	
	public void push(int element) {
		if(isFull()) {
			System.out.println("Stack is Full, cannot push element\s"+element);
		}else {
			stackArray[++top]=element;
			System.out.println(element+"\sis pushed to stack");
		}
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("stack is empty cannot pop");
			return -1;
		}else {
			System.out.println(stackArray[top]+"\s is removed from stack");
			return stackArray[top--];
		}	
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty");
		}else {
			System.out.println("top element in stack is\s"+stackArray[top]);
		}
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("stack is empty, nothing to display");
		}else {
			System.out.println("Stack elements (top to bottom)");
			for(int i = top;i>=0;i--) {
				System.out.println(stackArray[i]);
			}
		}
		System.out.println();
	}
	
	public Boolean isFull() {
		return top == maxSize-1;
	}
	
	public Boolean isEmpty() {
		return top == -1;
	}
	
	public static void main(String[] args) {
		MyStack myStack = new MyStack(5);
		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.display();
		myStack.pop();
		myStack.peek();
		myStack.display();
	}

}
