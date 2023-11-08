import java.util.Arrays;
import java.util.Hashtable;

public class SolutionTwoSum {
	public static int[] twoSum(int[] nums, int target) {
        int[] indexes = new int[2];
        Hashtable<Integer,Boolean> rem = new Hashtable<Integer,Boolean>();
		
        for(int i = 0; i < nums.length; i++) {
        	rem.put((target-nums[i]) < 0 ? -(target-nums[i]) : (target-nums[i]), true);
        }
        
        for(int i=0; i < nums.length; i++) {
        	if(rem.containsKey(target-nums[i])) {
        		indexes[1] = i;
        		indexes[0] = Arrays.binarySearch(nums, target-nums[i]);
        	}
        }
        
		return indexes; 
    }
}
