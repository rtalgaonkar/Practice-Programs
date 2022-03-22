package DataStructures;

import java.util.HashSet;
import java.util.Set;

public class LinkedListedClosedLoop {

	static Node head;
	
	static class Node {
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		LinkedListedClosedLoop loop = new LinkedListedClosedLoop();
		
		loop.push(20);
		loop.push(4);
		loop.push(15);
		loop.push(10);
		System.out.println("head" + head.data);
		loop.head.next.next.next.next = loop.head;
		
		if(removeLoop(head)) {
			System.out.println("loop removed");
			loop.printList(head);
		}
		else {
			System.out.println("loop doesnt exist");
		}
	}

	private void printList(Node head) {
		//System.out.println("head: " + head.next.data);
		Node last = head;
		while(last.next != null) {
			System.out.print(last.data + " -> ");
			last = last.next;
		}
		System.out.print(last.data);
		
	}

	private static boolean removeLoop(Node head) {
		Set<Node> unique = new HashSet<Node>();
		Node last = head;
		unique.add(head);
		while(last.next != null) {
			if(unique.add(last.next)) {
				last = last.next;
			}
			else {
				last.next =null;
				return true; 
			}
		}
		return false;
	}


	private void push(int i) {
		Node new_node = new Node(i);
		
		new_node.next = head;
		
		head = new_node;
		printList(head);
		System.out.println();
	}
}
