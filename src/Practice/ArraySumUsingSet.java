package Practice;

import java.util.HashSet;
import java.util.Set;

public class ArraySumUsingSet {
// print pair in a array to form a given sum.
	
	
	public static void printPairs(int [] arr , int sum){
		
		Set set  = new HashSet();
		
		for (int val : arr ) {
			
			int target = sum - val;
			if(!set.contains(target)){
				set.add(val);
			} else {
				System.out.println("printing pairs "+ val + " " +target);
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		int [] arr = new int[] { 0, 14, 0, 4, 7, 8, 3, 5, 7 };
		int sum = 11;
		
		printPairs(arr, sum);
	}

}
