package Arrays;

public class MyArray {
	private int[] array;
	private int size;
	
	public MyArray(int capacity) {
		array = new int[capacity];
		size = 0;
	}
	
	public void insert(int element) {
		if(size < array.length) {
			array[size] = element;
			System.out.println(element+"\sis inserted at index\s"+size);
			size = size+1;
		}
	}
	
	public void delete(int index) {
		if(index >= 0 && index < size) {
			System.out.println("element is deleted at index\s"+index);
			for(int i = index;i<size-1;i++) {
				array[i] = array[i+1];
			}
//			array[size]=0;
			size = size-1;
		}
	}
	
	public void display(int[] arr) {
		for(int ele:arr) {
			System.out.print(ele+",\s");
		}
	}
	
	public static void main(String[] args) {
		MyArray myArray = new MyArray(4);
		System.out.println("insertion");
		myArray.insert(1);
		myArray.insert(2);
		myArray.insert(3);
		myArray.insert(4);
		System.out.println("deletion");
		myArray.delete(4);
		System.out.print("display \s");
		myArray.display(myArray.array);
		
	}
}
