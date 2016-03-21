package LinkedList;


class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return " " + data;
	}
}

public class LinkedListDemo {

	Node head = null;

	// method to add from front
	public void addFront(int data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;
	}

	// method to add from end
	public void addLast(int data) {
		Node current = head;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
		} else {
			while (current.next != null) {
				current = current.next;

			}
			current.next = newNode;
		}
	}

	// method to get nth node at a index
	public Node getAt(int index) {
		Node current = head;
		int i = 0;
		while (i < index - 1) {
			current = current.next;
			i++;
		}
		return current;
	}

	// insert at given index
	public void insertAt(int index, int data) {
		index--;
		Node newNode = new Node(data);
		Node forward = getAt(index + 1);
		Node reverse = getAt(index - 1);
		for (int i = 0; i < index; i++) {
			reverse = forward;
			forward = forward.next;
		}
		reverse.next = newNode;
		newNode.next = forward;
	}

	// deleteAt
	public void deleteAt(int index) {
		Node current1 = getAt(index - 1);
		Node current2 = getAt(index + 1);
		current1.next = current2;
	}

	// method from delete front
	public void deleteFront() {
		head = head.next;
	}

	// method to delete last
	public void deleteLast() {
		Node current = head;
		while (current.next.next != null) {
			current = current.next;
		}
		current.next = null;
	}
	
	// Method to reverse LinkedList
	
	public void reverse(){
		Node curr;
		Node prev;
		Node temp;
		
		curr = head;
		prev = null;
		
		while(curr!=null){
			temp = prev;
			prev = curr;
			curr = curr.next;
			prev.next = temp;
		}
		head = prev;
		Node current = head;
		while(current!=null){
			System.out.print(">"+current.data);
			current =current.next;
		}
		
	}
	
	// method to see if the linked list contains loop
	// move fast 2 node at a time and slow 1 node at a time if fast and slow meets then its cyclic
	//fast!= null && fast.next != null
	public boolean isCyclic(){
		Node fast = head;
		Node slow = head;
		
		while(fast!=null && fast.next!=null){
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast == slow) {
				return true;
			}
		}
		return false;
	}
	
	// method to get nth node from end of the list
	/**
	 * The key to this algorithm is to set two pointers p1 and p2 apart by n-1 nodes 
	 * initially so we want p2 to point to the (n-1)th node from the start of the list 
	 * then we move p2 till it reaches the last node of the list. 
	 * Once p2 reaches end of the list p1 will be pointing to the nth node from the end of the list.
	 */
	
	public Node getNthNode(int n){
		// if list is empty 
		if(head == null && n<1){
			return null;
		}
		
		// make pnts p1 and p2 point to head
		Node p1 = head;
		Node p2 = head;
		for(int i = 0;i<n-1;++i ){
			   // while moving p2 check if it becomes NULL, that is if it reaches the end
			   // of the list. That would mean the list has less than n nodes, so its not 
			   // possible to find nth from last, so return NULL.
			   if (p2 == null) {
			       return null; 
			   }
			   // move p2 forward.
			   p2 = p2.next;
		}
		
		// at this point p2 is (n-1) nodes ahead of p1. Now keep moving both forward
		  // till p2 reaches the last node in the list.
		
		while(p2!=null){
			p1=p1.next;
			p2=p2.next;
		}
		
		// at this point p2 has reached the last node in the list and p1 will be
		   // pointing to the nth node from the last..so return it.
		 
		return p1;
	}
	

	// method to print
	public void print() {
		Node current = head;
		while (current != null) {
			System.out.print(">" + current.data);
			current = current.next;
		}
	}
	
	// method to pring the middle of linked list
	  void printMiddle()
	    {
	        Node slow_ptr = head;
	        Node fast_ptr = head;
	        if (head != null)
	        {
	            while (fast_ptr != null && fast_ptr.next != null)
	            {
	                fast_ptr = fast_ptr.next.next;
	                slow_ptr = slow_ptr.next;
	            }
	            System.out.println("The middle element is [" +
	                                slow_ptr.data + "] \n");
	        }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDemo ldemo = new LinkedListDemo();
//		 ldemo.addFront(1);
//		 ldemo.addFront(2);
//		 ldemo.addFront(3);
		ldemo.addLast(1);
		ldemo.addLast(2);
		ldemo.addLast(3);
		ldemo.addLast(4);
		ldemo.addLast(5);
		

		
		// ldemo.deleteFront();
		// System.out.println(ldemo.getAt(2));
		// ldemo.deleteLast();
		ldemo.print();
//		System.out.println(ldemo.isCyclic());
		System.out.println(ldemo.getNthNode(3));
//		ldemo.reverse();
	}

}
