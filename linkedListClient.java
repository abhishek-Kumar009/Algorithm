
public class linkedListClient {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		linkedList ll = new linkedList();
		ll.addLast(10);
		ll.addLast(20);
		ll.addLast(30);
		ll.addLast(40);
		ll.addLast(56);
		ll.addLast(44);
		System.out.println(".................................");
		System.out.println();
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(".................................");
		ll.display();
		System.out.println();
		System.out.println("..................................");
		ll.addAtFirst(90);
		System.out.println();
		ll.display();
		ll.addAt(3 , 45);
		System.out.println();
		System.out.println("...................................");
		System.out.println();
		ll.display();
		System.out.println();
		ll.removeLast();
		System.out.println();
		System.out.println("...................................");
		System.out.println();
		ll.display();
		ll.removeFirst();
		System.out.println();
		System.out.println("...................................");
		System.out.println();
		ll.display();
		ll.removeAt(2);
		System.out.println();
		System.out.println("...................................");
		ll.display();
		ll.removeAt(4);
		System.out.println();
		System.out.println("...................................");
		ll.display();
		

	}

}
