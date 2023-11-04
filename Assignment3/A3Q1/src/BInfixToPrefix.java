
public class BInfixToPrefix {
	 private String arr[];
	    private int top;
	    private final int SIZE;

	    public BInfixToPrefix(int size) {
	        SIZE = size;
	        arr = new String[SIZE];
	        top = -1;
	    }

	    public void push(String data) {
	        if (!isFull()) {
	            top++;
	            arr[top] = data;
	        }
	    }

	    public String pop() {
	        if (!isEmpty()) {
	            String data = arr[top];
	            top--;
	            return data;
	        }
	        return null; 
	    }

	    public String peek() {
	        if (!isEmpty()) {
	            return arr[top];
	        }
	        return null; 
	    }

	    public boolean isEmpty() {
	        return top == -1;
	    }

	    public boolean isFull() {
	        return top == SIZE - 1;
	    }
}
