import java.util.Arrays;

public class MyArray {
	
	int length;
	int capacity;
	Object[] data;
	
	MyArray(){
		length = 0;
		capacity = 1;
		data = new Object[1];
	}
	
	public Object get(int index) {
		return data[index];
	}
	
	public int push(Object item) {
		
		if(capacity == length) {
			data = Arrays.copyOf(data, capacity * 2);
			capacity*=2;
		}
		
		data[length] = item;
		length++;
		return length;
	}
	
	public Object pop() {
		Object item = data[length];
		data[length-1] = null;
		length--;
		return item;
	}
	
	public Object delete(int index) {
		Object item = data[index];
		shiftItems(index);
		return item;
	}
	
	public void shiftItems(int index) {
		for(int i = index; i<length-1 ; i++) {
			data[i] = data[i+1];
		}
		data[length-1] = null;
		length--;
	}
	
}
