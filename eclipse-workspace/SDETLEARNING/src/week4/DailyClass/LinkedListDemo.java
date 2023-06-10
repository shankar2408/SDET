package week4.DailyClass;



public class LinkedListDemo {
	
	public static void main(String[] args) {
		LearnLinkedList list = new LearnLinkedList();
		list.insertFirst(3);
		list.insertFirst(4);
		list.insertFirst(5);
		list.insertFirst(6);
		list.insertLast(7);
		list.insert(2, 2);
		list.display();
		System.out.println(list.deleteFirst());
		list.display();
		System.out.println(list.deleteLast());
		list.display();
		System.out.println(list.delete(2));
		list.display();
		System.out.println(list.find(5));
		list.display();
	}

}
