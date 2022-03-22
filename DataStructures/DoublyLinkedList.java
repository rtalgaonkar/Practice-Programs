package DataStructures;

public class DoublyLinkedList {

	Node head;
	
	class Node {
		int data;
		Node prev;
		Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}
	
	public static void main(String[] args) {
		DoublyLinkedList ddl = new DoublyLinkedList();
		ddl.append(6);
		ddl.push(7);
		ddl.push(1);
		ddl.append(4);
		ddl.InsertAfter(ddl.head.next, 8);
	    ddl.InsertBefore(ddl.head.next.next, 5);
        ddl.printlist(ddl.head);
	}

	private void printlist(Node head) {
		Node last = head;
		
		while(last.next != null) {
			System.out.print( last.data + " ");
			last = last.next;
		}
		System.out.print(last.data);
		
	}

	private void InsertBefore(Node next, int i) {
		if(next == null) {
			System.out.println("next cannot be null");
			return;
		}
		Node new_node = new Node(i);
		new_node.next = next;
		new_node.prev = next.prev;
		
		next.prev = new_node;
		if(new_node.prev != null) {
			new_node.prev.next = new_node;
		}
		else {
			head = new_node;
		}
		
	}

	private void InsertAfter(Node prev, int i) {
		Node new_node = new Node(i);
		
		if(prev == null) {
			System.out.println("prev cannot be null");
			return;
		}
		
		new_node.prev = prev;
		new_node.next = prev.next;
		prev.next = new_node;
		
		if(new_node.prev != null) {
			new_node.prev.next = new_node;
		}
		
	}

	private void push(int i) {
		Node new_node = new Node(i);
		new_node.prev = null;
		new_node.next = head;
		
		if(head != null) {
			head.prev = new_node;
			
		}
		head = new_node;
	}

	private void append(int i) {
		Node new_node = new Node(i);
		
		Node prev = head;
		
		if(head == null) {
			head = new_node;
			new_node.prev = null;
			return;
			
		}
		while(prev.next != null) {
			prev = prev.next;
		}
		
		prev.next = new_node;
		new_node.prev = prev;
		new_node.next = null;
		
	}
}
