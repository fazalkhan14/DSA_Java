
public class SolutionMixSubArray {
	
	public static int maxSubArray(int[] array) {
		//[-2,1,-3,4,-1,2,1,-5,4]

		//6
		
		int maxVal = 0,sum = 0,i = 0;
		
		while(i < array.length) {
			sum += array[i];
			if(sum > maxVal) {
				maxVal = sum;
			}
			else {
				if(sum < 0) {
					sum = 0;
				}
			}
			i++;
		}
		
		
		return maxVal;
	}
	
}
