public class MyStack <T>{
	
	Node top;
	Node bottom;
	int length;
	
	MyStack(T value){
		this.top = new Node(value);
		this.bottom = this.top;
		this.length = 1;
	}
	
	public T peek() {
		if(this.length == 0) {
			T value = (T) "";
			return value;
		}
		return (T) this.top.value;
	}
	
	public void push(T value) {
		Node newNode = new Node(value);
		
		newNode.next = this.top;
		this.top = newNode;
		this.length++;
	}
	
	public T pop() {
		if(this.length == 0) {
			T value = (T) "";
			return value;
		}
		T value = (T) this.top.value;
		if(this.top == this.bottom)
			this.bottom = null;
		this.top = this.top.next;
		this.length--;
		
		return value;
	}
	
}
