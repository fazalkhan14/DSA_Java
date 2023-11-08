import java.util.*;
import java.util.Map.Entry;

public class MyGraph {
	
	int numberOfNodes;
	HashMap<Integer, ArrayList<Integer>> adjacentList;

	MyGraph(){
		this.numberOfNodes = 0;
		this.adjacentList = new HashMap<Integer, ArrayList<Integer>>();
	}
	
	public void addVertex(int node) {
		
		if(!this.adjacentList.containsKey(node)) {
			this.adjacentList.put(node, new ArrayList<Integer>());
			this.numberOfNodes++;
		}
		
	}
	
	public void addEdge(int node1, int node2) {
		
		if(this.adjacentList.containsKey(node1)){
			this.adjacentList.get(node1).add(node2);
			this.adjacentList.get(node2).add(node1);
		}
		else {
			System.out.println("Please add the vertex "+node1+" to the graph");
		}
	}
	
	public void showConnections(){
		
		for(Entry<Integer, ArrayList<Integer>> val : this.adjacentList.entrySet()) {
			System.out.println(val);
		}
		
	}
	
}
