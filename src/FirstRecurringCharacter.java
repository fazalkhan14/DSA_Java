import java.util.HashMap;

public class FirstRecurringCharacter {
	
	public static String FirstRecurringChar(int[] list) {
		HashMap<Integer,Boolean> contains = new HashMap<Integer,Boolean>();
		
		//Solution 1 -
//		for(int i=0; i<list.length; i++) {
//			if(contains.containsKey(list[i])) {
//				return Integer.toString(list[i]);
//			}
//			else {
//				contains.put(list[i], true);
//			}
//		}
		
		//Solution 2-
		
		int currentDistance = 0;
		int prevDistance = 0;
		int prevItem = 0;
		boolean flag = false;
		
		for(int i=0; i<list.length; i++) {
			for(int j = i + 1; j<list.length; j++) {
				if(list[i] == list[j]) {
					currentDistance = j - i;	
					flag = true;
					break;
				}	
				
			}
			if(prevDistance != 0 && prevDistance > currentDistance) {
				return Integer.toString(list[i]);
			}
			if(flag) {
				prevItem = list[i];
			}
			prevDistance = currentDistance;
		}
		
		return prevItem == 0 ? null : Integer.toString(prevItem);
	}

}
