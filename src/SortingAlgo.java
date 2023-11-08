
public class SortingAlgo {

	//3,6,2,68,1,7,21
	public int[] bubbleSort(int[] arr) {
		int i=0;
		int counter=0;
		
		while(counter < arr.length-1) {
			if(arr[i] > arr[i+1]) {
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				counter--;
			}
			else
				counter++;
			if(i == arr.length-2)
				i =0;
			else
				i++;
		}
		
		return arr;
	}
	
	public int[] selectionSort(int[] arr) {
		int smallestNum = arr[0], smallestNumIndex=0;
		
		for(int i=0; i<arr.length-1;i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[j] < smallestNum) {
					smallestNum = arr[j];
					smallestNumIndex = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[smallestNumIndex];
			arr[smallestNumIndex] = temp;
			smallestNum = arr[i+1];
		}
		
		return arr;
	}
	
	public int[] insertionSort(int[] arr) {
		
		int i=1;
		while(i < arr.length) {
			if(arr[i] < arr[i-1]) {
				int itemToBeShifted = arr[i];
				int index = findRightIndex(arr, itemToBeShifted, i);
				
				arr = shiftArr(arr,index,i);
				
				arr[index] = itemToBeShifted;
			}
			i++;
		}
				
		return arr;
	}
	
	public int findRightIndex(int[] arr, int number, int i) {
		int index = 0;
		
		while(index < i) {
			if(arr[index] < number && arr[index+1] > number) {
				return index+1;
			}
			index++;
		}
		index = 0;
		return index;
	}
	
	public int[] shiftArr(int[] arr,int startIndex, int endIndex) {
		
		for(int i=endIndex; i>startIndex; i--) {
			arr[i] = arr[i-1];
		}
		
		return arr;
	}
	
	public int[] mergeSort(int[] arr) {
			
			if(arr.length == 1)
				return arr;
			
			int[] left = new int[arr.length/2];
			int rightArrSize = (arr.length%2) == 0 ? (arr.length/2) : (arr.length) - (arr.length/2);
			int[] right = new int[rightArrSize];
			
			for(int i=0; i<arr.length/2; i++) {
				left[i] = arr[i];
			}
			
			for(int i=0,j=(arr.length/2); i<=arr.length/2 && j<arr.length; i++,j++) {
				right[i] = arr[j];
			}
			
			return merge(mergeSort(left),mergeSort(right));
	}

	public int[] merge(int[] left, int[] right) {
		
		int[] res = new int[left.length+right.length];
		int index = 0, resLength = left.length+right.length, i=0, j=0;
		
		while(index < resLength) {
			if(i == left.length && j < right.length) {
				res[index] = right[j];
				index++;
				j++;
			}
			else if(j == right.length && i < left.length) {
				res[index] = left[i];
				index++;
				i++;
			}
			else if(right[j] < left[i]) {
				res[index] = right[j];
				index++;
				j++;
			}
			else {
				res[index] = left[i];
				index++;
				i++;
			}
		}
		
		return res;		
	}
	
}