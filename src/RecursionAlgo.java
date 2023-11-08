
public class RecursionAlgo {

	public int findFactorialIterative(int num) {
		int sum = 1;
		
		for(int i = num; i > 0; i--) {
			sum = sum * i;
		}
		
		return sum;
	}
	
	public int findFactorialRecursive(int num) {
		if(num == 2)
			return 2;
		
		return num * findFactorialRecursive(num - 1);
	}
	
	
	//Fibonacci
	//0,1,1,2,3,5,8,13,21.....
	public int findFibonacciIterative(int number) {
		int val = 0,s1=0,s2=1;
		
		for(int i=0; i<number-1;i++) {
			val = s1+s2;
			s1 = s2;
			s2 = val;
		}
		
		return val;
	}
	
	public int findFibonacciRecursive(int n) {
		
		if(n < 2) {
			return n;
		}
		
		return findFibonacciRecursive(n-2) + findFibonacciRecursive(n - 1);
	}
	
}
