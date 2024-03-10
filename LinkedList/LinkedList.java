package LinkedList;

class Node {
	int val;
	Node next;
	Node(int val){
		this.val = val;
		this.next = null;
	}
}
public class LinkedList{

	Node head;
	
	LinkedList(){
		this.head = null;
	}
	
	boolean isEmpty(){
		boolean b = false;
		if(head == null) {
			b = true;
		}
		return b;
	}
	void insert_at_first(int val) {
		Node newNode = new Node(val);

		newNode.next = head;
		head = newNode;
		
	}
	
	void insert_at_last(int val) {
		Node newNode = new Node(val);
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
	}
	void insert_after(int elem,int val) {
		Node newNode = new Node(val);
		if (isEmpty()) {
			return;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				if(temp.val == elem) {
					newNode.next = temp.next;
					temp.next = newNode;
					break;
				}
				temp = temp.next;
			}
			if(temp.next == null && temp.val == elem) {
				newNode.next = temp.next;
				temp.next = newNode;
			}
		}
	}
	void delete_first() {
		if(isEmpty() == false) {
			if(head.next == null) {
				head = null;
			}
			else {
				head = head.next;	
			}
		}
	}
	void delete_last() {
		if(isEmpty() == false) {
			if(head.next == null) {
				head = null;
			}
			else {
			   Node	temp = head;
			   while(temp.next.next != null) {
					temp = temp.next;
				}
			   temp.next = null;
			}
		}
	}
	void printList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.val+" --> ");
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.insert_at_first(23);
		ll.insert_at_first(25);
		ll.insert_at_first(68);
		ll.insert_at_last(56);
		ll.insert_at_last(72);
		ll.insert_after(72, 102);
		ll.delete_first();
		ll.delete_last();
		ll.printList();
	}

}

