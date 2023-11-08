
public class MyQueue<T> {

	Node first;
	Node last;
	int length;
	
	MyQueue(T value){
		this.first = new Node(value);
		this.last = first;
		this.length = 1;
	}
	
	public T peek() {
		if(this.length == 0) {
			T value = (T)"";
			return value;
		}
		
		return (T) this.first.value;
	}
	
	public void enqueue(T value) {
		Node newNode = new Node(value);
		
		this.last.next = newNode;
		this.last = newNode;
		this.length++;
	}
	
	public T dequeue() {
		if(this.length == 0) {
			T value = (T)"";
			return value;
		}
		
		T value = (T) this.first.value;
		this.first = this.first.next;
		this.length--;
		
		return value;
		
	}
	
}
