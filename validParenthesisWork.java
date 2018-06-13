package stackImplement;



public class validParenthesisWork {
	private int size;
	public int tos;
	private char[] data;

	validParenthesisWork(int n) {
		this.tos = -1;
		this.size = 0;
		this.data = new char[n];

	}

	void push(char ch) throws Exception {
		if (isFull()) {
			throw new Exception("Stack is Full.");
		}
		this.tos++;
		this.data[tos] = ch;
		this.size++;

	}

	char pop() throws Exception {
		if (isEmpty()) {
			throw new Exception("Stack is Empty.");
		}
		char epop = this.data[tos];
		tos--;
		size--;
		return epop;

	}

	boolean isFull() {
		return this.tos == this.data.length - 1;
	}

	boolean isEmpty() {
		return this.tos == -1;
	}

	int size() {
		return this.data.length;
	}
	char top() {
		return this.data[tos];
	}

}
