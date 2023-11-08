public class MyLinkedList {
	
	Node head;
	Node tail;
	int length;
	
	MyLinkedList(int value){
		this.head = new Node(value);
		this.tail = this.head;
		length = 1;
	}
	
	public void append(int value) {
		
		Node newNode = new Node(value);
		
		this.tail.next = newNode;
		this.tail = newNode;
		this.length++;
	}
	
	public void prepend(int value) {
		
		Node newNode = new Node(value);
		
		newNode.next = this.head;
		this.head = newNode;
		this.length++;
		
	}
	
	public void insert(int index, int value) {
		
		if(index >= this.length-1)
			append(value);
		else if(index == 0)
			prepend(value);
		else {
			
			Node newNode = new Node(value);
			Node leader = this.traverse(index);
			Node holdingPointer = leader.next;
			leader.next = newNode;
			newNode.next = holdingPointer;
			this.length++;
		}
		
	}
	
	public int remove(int index) {
		int value;
		if(index == 0) {
			value = (int) this.head.value;
			this.head = this.head.next;
			this.length--;
			return value;
		}
		if(index == this.length-1) {
			Node leader = this.traverse(index);
			value = (int) leader.next.value;
			leader.next = null;
			this.length--;
			return value;
		}
		
		Node leader = this.traverse(index);
		Node delNode = leader.next;
		value = (int) delNode.value;
		
		leader.next = delNode.next;
		this.length--;
		
		return value;
	}
	
	public Node traverse(int index) {
		int i=0;
		Node currentNode = this.head;
		
		while(i != index-1) {
			currentNode = currentNode.next;
			i++;
		}
		return currentNode;
	}
	
	public void reverse() {
		if(this.head.next == null)
			return;
		Node first = this.head;
		this.tail = this.head;
		Node second = first.next;
		while(second != null) {
			Node temp = second.next;
			second.next = first;
			first = second;
			second = temp;
		}
		this.head.next = null;
		this.head = first;
			
	}
	
	public int[] printAll() {
		int[] list = new int[this.length];
		int i=0;
		Node currentNode = this.head;
		
		while(currentNode != null) {
			list[i] = (int) currentNode.value;
			currentNode = currentNode.next;
			i++;
		}
		
		return list;
	}
	
}
