
public class linkedList {
	private class Node {
		private int data;
		private Node next;
	}

	private Node head = null;
	private Node tail = null;
	private int size = 0;

	public int getFirst() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}
		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}
		return this.tail.data;
	}

	public int getAt(int idx) throws Exception {
		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}
		Node temp = this.head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp.data;

	}
	private Node getNode(int idx) throws Exception {
		if(idx < 0 || idx > this.size - 1) {
			throw new Exception("Invalid index.");
		}
		if (this.size == 0) {
			throw new Exception("LL is Empty");
		}
		Node temp = this.head;
		for (int i = 1; i <= idx; i++) {
			temp = temp.next;
		}
		return temp;

	}

	public void addLast(int item) {
		// 1. create a new Node
		Node nn = new Node();
		if (size == 0) {
			this.head = nn;
			this.tail = nn;
			nn.data = item;
			this.tail.next = null;
			this.size++;
		} else {

			this.tail.next = nn;
			nn.data = item;

			this.tail = nn;
			this.size++;
		}

	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data+ " ");
			temp = temp.next;
		}
	}
	public void addAtFirst(int item) {
		Node nn = new Node();
		nn.next = this.head;
		this.head = nn;
		nn.data = item;
		this.size++;
		
	}
	public void addAt(int idx , int item)throws Exception{
		if(idx < 0) {
			throw new Exception("Invalid index.");
		}
		
		if(this.size == 0) {
			addAtFirst(item);
			this.size++;
		}
		else if(idx == this.size) {
			addLast(item);
			this.size++;
		}
		else {
			Node nn = new Node();
			Node nm1 = getNode(idx - 1);
			Node np1 = getNode(idx);
			//Node tmp = nm1;
			nn.data = item;
			nm1.next = nn;
			nn.next = np1;
			this.size++;
			
			
		}
		
	}
	public int removeLast()throws Exception{
		if(this.size == 0) {
			throw new Exception("LL is Empty");
		}
		else {
			int disp = this.tail.data;
			Node nm1 = getNode(this.size - 2);
			this.tail = nm1;
			this.tail.next = null;
			this.size--;
			return disp;
		}
	}
	public int removeFirst()throws Exception{
		if(this.size == 0) {
			throw new Exception("LL is Empty");
		}
		if(this.size == 1) {
			int disp = this.head.data;
			this.head = null;
			this.tail = null;
			this.size--;
			return disp;
		}else {
		int disp = this.head.data;
		this.head = this.head.next;
		this.size--;
		return disp;
		}
		
		
		
	}
	public int removeAt(int idx)throws Exception {
		if(idx < 0 || idx > this.size - 1) {
			throw new Exception("Invalid index.");
		}
		if(this.size == 1) {
			return removeFirst();
			}
		else if(idx == this.size - 1) {
			return removeLast();
		}
		else {
			int disp = getNode(idx).data;
			Node nm1 = getNode(idx - 1);
			Node np1 = getNode(idx + 1);
			nm1.next = np1;
			this.size--;
			return disp;
		}
	}
	

}
