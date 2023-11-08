import java.util.Arrays;

public class MergeSortedArray {
	
	public static int[] merge(int[] array1, int[] array2) {
	    
//		int[] mergedArray = new int[array1.length + array2.length];
//	    mergedArray = Arrays.copyOf(array1, array1.length + array2.length);
//	    int index = 0;
//	    
//	    for(int i = array1.length; i < mergedArray.length; i++) {
//	    	mergedArray[i] = array2[index];
//	    	index++;
//	    }
//	    
//	    Arrays.sort(mergedArray);
//	    
//	    return mergedArray;
		
	    final int[] mergedArray = new int[array1.length + array2.length];
	    int j = 0, k = 0;
	    for (int i = 0; i < mergedArray.length; i++) {
	      if (j != array1.length && (k == array2.length || array1[j] < array2[k])) {
	        mergedArray[i] = array1[j];
	        j++;
	      } else {
	        mergedArray[i] = array2[k];
	        k++;
	      }
	    }
	    return mergedArray;
	}
	
}
