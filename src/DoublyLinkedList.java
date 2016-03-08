class NodeD {

	int val;
	public NodeD next;
	public NodeD prev;

	public NodeD(int val, NodeD next, NodeD prev) {
		this.val = val;
		this.next = next;
		this.prev = prev;
	}

	public String toString() {
		return "" + val;
	}
}

public class DoublyLinkedList {

	public static NodeD head;
	public static NodeD tail;
	public static NodeD current;

	// method to traverse the list forward

	public static void iterateForward() {
		System.out.println("iterating forward..");
		current = head;

		while (current != null) {
			System.out.println("current val is " + current.val);
			current = current.next;
		}
	}

	// method to add first

	public static void addFirst(int val) {

		NodeD newnode = new NodeD(val, head, null);

		if (head != null) {
			head.prev = newnode;
		}
		head = newnode;
		if (tail == null) {
			tail = newnode;
		}

	}

	/**
	 * adds element at the end of the linked list
	 * 
	 * @param element
	 */
	public static void addLast(int val) {

		NodeD tmp = new NodeD(val, null, tail);
		if (tail != null) {
			tail.next = tmp;
		}
		tail = tmp;
		if (head == null) {
			head = tmp;
		}

	}
    
   /**
    * this method walks backward through the linked list
    */
   public static void iterateBackward(){
        
       System.out.println("iterating backword..");
       NodeD tmp = tail;
       while(tmp != null){
           System.out.println(tmp.val);
           tmp = tmp.prev;
       }
   }
    
   /**
    * this method removes element from the start of the linked list
    * @return
    */
   public static void removeFirst() {
       
       NodeD tmp = head;
       head = head.next;
       head.prev = null;
  
       System.out.println("deleted: "+tmp.val);
     
   }
    
   /**
    * this method removes element from the end of the linked list
    * @return
    */
   public static void removeLast() {
       NodeD tmp = tail;
       tail = tail.prev;
       tail.next = null;
       System.out.println("deleted: "+tmp.val);
      
   }
    
	public static void main(String a[]){
        
      
        DoublyLinkedList.addFirst(10);
        DoublyLinkedList.addFirst(34);
        DoublyLinkedList.addLast(56);
        DoublyLinkedList.addLast(36);
        DoublyLinkedList.iterateForward();
        DoublyLinkedList.removeFirst();
        DoublyLinkedList.removeLast();
        DoublyLinkedList.iterateBackward();
    }
}

