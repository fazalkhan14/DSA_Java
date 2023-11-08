
public class MyDoublyLinkedList {
	
	DoublyNode head;
	DoublyNode tail;
	int length;
	
	MyDoublyLinkedList(int value){
		this.head = new DoublyNode(value);
		this.tail = this.head;
		this.length++;
	}
	
	public void append(int value) {
		DoublyNode newNode = new DoublyNode(value);
		DoublyNode temp = this.tail;
		this.tail.next = newNode;
		newNode.prev = temp;
		this.tail = newNode;
		length++;
	}
	
	public void prepend(int value) {
		DoublyNode newNode = new DoublyNode(value);
		this.head.prev = newNode;
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
			
			DoublyNode newNode = new DoublyNode(value);
			DoublyNode leader = traverse(index);
			DoublyNode holdingPointer = leader.next;
			newNode.next = holdingPointer;
			newNode.prev = leader;
			leader.next = newNode;
			holdingPointer.prev = newNode;
			this.length++;
			
		}
	}
	
	public int remove(int index) {
		int value;
		if(index == 0) {
			value = this.head.value;
			this.head = this.head.next;
			this.head.prev = null;
			this.length--;
			return value;
		}
		else if(index == this.length-1) {
			value = this.tail.value;
			this.tail = this.tail.prev;
			this.tail.next = null;
			this.length--;
			return value;
		}
		else {
			
			DoublyNode leader = this.traverse(index);
			value = leader.next.value;
			DoublyNode delNode = leader.next;
			delNode.next.prev = null;
			leader.next = delNode.next;
			delNode.next.prev = leader;
			this.length--;
		}
		return value;
	}
	
	public DoublyNode traverse(int index) {
		DoublyNode currentNode = this.head;
		int i = 0;
		while(i < index-1) {
			currentNode = currentNode.next;
			i++;
		}
		return currentNode;
	}
	
	public int[] printAll() {
		int[] list = new int[this.length];
		int i=0;
		DoublyNode currentNode = this.head;
		
		while(currentNode != null) {
			list[i] = currentNode.value;
			currentNode = currentNode.next;
			i++;
		}
		
		return list;
	}

}
