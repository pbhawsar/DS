class Node {

	Node next;
	int val;

	// constructor
	Node(int val) {
		this.val = val;
	}

	public String toString() {
		return "" + val;
	}
}

public class LinkedList {

	static Node head;
	static Node current;

	static int count = 0;

	// function to traverse linkedlist

	public static void traverse() {

		current = head;
		while (current != null) {
			System.out.println("data  is " + current.val);
			current = current.next;
			count++;
		}

	}
	public static void reverse(){
		Node currptr ; 
		Node prevptr;
		Node temp;
		currptr = head;
		prevptr =null;
		while(currptr != null){
			temp = prevptr;
			prevptr=currptr;
			currptr = currptr.next;
			prevptr.next=temp;			
		}
		head=prevptr;
		
		Node current = head;
		while(current!=null){
			System.out.println("data  is " +  current.val);
			current=current.next;
		}
	}
	// function to get nth node 
	
	public static Node getAt(int index){
		
		current = head;
		int i = 0;
		while(i<index-1){
			current = current.next;
			i++;
		}
		System.out.println(current.val);
		return current;
	}
	
	//insert at nth node
	public static void insertAt( int data, int index){
		index--;
		count++;
		Node newnode = new Node(data);
		Node forward = getAt(index+1);
		Node reverse = getAt(index-1);
		for (int i =0; i<index;i++){
			reverse = forward;
			forward = forward.next;			
		}
		reverse.next = newnode;
		newnode.next = forward;
		
	}
	// insert at the first
	public static void insertFirst(int val) {

		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
		} else {

			newNode.next = head;
			head = newNode;

		}
	}

	// insert at the end of list
	public static void insertEnd(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
		} else {

			current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = newNode;

		}
	}
   
	// delete node at a given index
	public static void deleteAt(int index){
		Node current1  = new Node(index-1);
		Node current2 = new Node(index+1);
		current1.next=current2;
	}
	public static void deleteEnd() {

		current = head;

		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;

	}

	// delete at the first
	public static void deleteFirst() {
		Node temp = head;
		head = head.next;
		temp = null;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList.insertFirst(1);
		LinkedList.insertFirst(2);
		LinkedList.insertFirst(3);
		LinkedList.insertFirst(4);
		LinkedList.insertFirst(5);
		// LinkedList.insertFirst(4);
		// LinkedList.deleteFirst();
		// LinkedList.insertEnd(4);
//		LinkedList.deleteEnd();
//		LinkedList.insertAt(7, 2);
		LinkedList.traverse();
//		LinkedList.getAt(2);
		System.out.println("After reverese");
		LinkedList.reverse();
		
	
		

	}

}
