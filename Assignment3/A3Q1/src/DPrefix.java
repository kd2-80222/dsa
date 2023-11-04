
public class DPrefix {
	private int arr[];
	private int top;
	private final int SIZE;

	public DPrefix(int size) {
		SIZE = size;
		arr = new int[SIZE];
		top = -1;
	}

	public void push(int data) {
		top++;
		arr[top] = data;
	}

	public int pop() {
		if (!isEmpty()) {
			int data = arr[top];
			top--;
			return data;
		} else {
			return -1; 
		}
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == SIZE - 1;
	}
}
