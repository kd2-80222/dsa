
public class AInfixToPostfix {
	 private String arr[];
	    private int top;
	    private final int SIZE;

	    public AInfixToPostfix(int size) {
	        SIZE = size;
	        arr = new String[SIZE];
	        top = -1;
	    }

	    public void push(String data) {
	        top++;
	        arr[top] = data;
	    }

	    public String pop() {
	        String data = arr[top];
	        top--;
	        return data;
	    }

	    public String peek() {
	        return arr[top];
	    }

	    public boolean isEmpty() {
	        return top == -1;
	    }

	    public boolean isFull() {
	        return top == SIZE - 1;
	    }
}
