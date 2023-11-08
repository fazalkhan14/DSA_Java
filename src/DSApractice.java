import java.util.*;


public class DSApractice {

	public static void main(String[] args) {

//		MyArray animals = new MyArray();
//		
//		animals.push("Horse");
//		animals.push("Goat");
//		animals.push("Cat");
//		animals.push("Dog");
		
//		for(int i=0 ; i<animals.length; i++) {
//			System.out.println(animals.data[i]);
//		}
		
//		animals.pop();
//		animals.pop();
//		animals.pop();
//		animals.pop();
//		animals.pop();
		
//		animals.delete(0);
//		
//		for(int i=0 ; i<animals.length; i++) {
//			System.out.println(animals.data[i]);
//		}
				
		//System.out.println(ReverseString.reverse("Fazal why are you here?"));
		//System.out.println(ReverseString.reverseWithReelJava("You are just killing the vibe bruh"));
		//System.out.println(ReverseString.recursiveReversal("Just go dude."));
				
//		int[] res = MergeSortedArray.merge(new int[]{10,11,34,41}, new int[] {12,15,37,49});
//		
//		for(int val : res) {
//			System.out.println(val);
//		}
		
//		int res[] = SolutionTwoSum.twoSum(new int[] {3,3},6);
//		for(int val : res) {
//		System.out.println(val);
		
//		System.out.println(SolutionMixSubArray.maxSubArray(new int[] {1}));
		
		//System.out.println(FirstRecurringCharacter.FirstRecurringChar(new int[] {2,5,2,5,3,1,4,6}));
	
//		MyLinkedList ll = new MyLinkedList(10);
//		
//		ll.append(5);
//		ll.append(16);
//		
//		//ll.prepend(31);
//		
//		ll.insert(2, 8);
		
//		ll.remove(2);
//		ll.remove(0);
//		ll.remove(2);
		
//		ll.reverse();
//		
//		for(int ele : ll.printAll()) {
//			System.out.println(ele);
//		}
//		
//		MyDoublyLinkedList dl = new MyDoublyLinkedList(10);
//		
//		dl.append(5);
//		dl.append(16);
//		
//		dl.prepend(4);
//		dl.prepend(2);
//		
//		dl.insert(2, 12);
//		
//		dl.remove(2);
//		dl.remove(0);
//		dl.remove(3);
		
//		for(int ele : dl.printAll()) {
//			System.out.println(ele);
//		}
		
//		MyStack browse = new MyStack("Google");
//		
//		browse.push("Udemy");
//		browse.push("Discord");
//		browse.pop();
//		browse.pop();
//		browse.pop();
//		
//		System.out.println(browse.peek());
		
//		MyQueue movie = new MyQueue("Fazal");
//		
//		movie.enqueue("Sallu");
//		movie.enqueue("Ismail");
//		
//		movie.dequeue();
//		movie.dequeue();
//		movie.dequeue();
//		
//		System.out.println(movie.peek());
		
		//Binary Search Tree
		
//		MyBinaryTree bt = new MyBinaryTree();
//		
//		bt.insert(80);
//		bt.insert(78);
//		bt.insert(83);
//		bt.insert(76);
//		bt.insert(81);
//		
//		//System.out.println(bt.lookup(8));;
//		
//		bt.remove(83);
		
//		MyGraph g = new MyGraph();
//		g.addVertex(0);
//		g.addVertex(1);
//		g.addVertex(2);
//		g.addVertex(3);
//		g.addVertex(4);
//		g.addVertex(5);
//		g.addVertex(6);
//		
//		g.addEdge(0, 1);
//		g.addEdge(0, 2);
//		g.addEdge(1, 3);
//		g.addEdge(2, 1);
//		g.addEdge(3, 4);
//		g.addEdge(4, 2);
//		g.addEdge(5, 4);
//		g.addEdge(6, 5);
//		
//		g.showConnections();
		
		//RecursionAlgo rec = new RecursionAlgo();
		//System.out.println(rec.findFactorialIterative(5));
		//System.out.println(rec.findFibonacciRecursive(5));
		
//		ArrayList<Integer> arr = new ArrayList<>();
//		arr.add(2);
//		arr.add(63);
//		arr.add(34);
//		arr.add(2);
//		arr.add(1);
//		arr.add(7);
//		arr.add(8);
//		
//		System.out.println(arr.toString()+"\n");
//		Collections.sort(arr);
//		System.out.println(arr.toString());
		
		SortingAlgo bs = new SortingAlgo();
		
		for(int val: bs.mergeSort(new int[] {3,6,2,68,1,7,21})) {
			System.out.println(val);
		}
		
	}
	
	public static void extras() {
		//System.out.println("Hello");
		
//		String[] array1 = {"a","b","c","d"};
//		String[] array2 = {"e","f","g","c"};
		
//		Stack<String> stk = new Stack<String>();  
//		
//		stk.push("hi");
//		stk.push("hello");
//		stk.push("hey");
//		
//		System.out.println(stk);
//		
//		stk.pop();
//		
//		System.out.println(stk);
		
//		ArrayList<Object> allTypes = new ArrayList<Object>();
//		
//		allTypes.add("hi");
//		allTypes.add(1);
//		allTypes.add(true);
//		
//		for(Object val : allTypes) {
//			System.out.println(val);
//		}
		
		//System.out.println((containsCommonItems(array1,array2)));
	}
	
	public static boolean containsCommonItems(String[] arr1,String[] arr2) {
		
		HashMap<String,Boolean> rec = new HashMap<String,Boolean>();
		
		for(int i=0; i < arr1.length; i++) {
			rec.put(arr1[i], true);
		}
		
//		for(Map.Entry<String,Boolean> val : rec.entrySet()) {
//			System.out.println(val.getKey() + " " + val.getValue());
//		}
		
		for(int i=0; i < arr2.length; i++) {
			if(rec.get(arr2[i]) != null) {
				System.out.println(arr2[i]);
				return rec.get(arr2[i]);
			}
		}
		
		return false;
	}

}


