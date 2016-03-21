package Practice;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NotPresentInSecondArray {
	
	// find element not present in second array
	
	public static Integer[] find(int [] arr1, int [] arr2){
		// add second arr2 in set
		List<Integer> list = new ArrayList<Integer>();
		int dup = 0;
		Set<Integer> set = new HashSet<Integer>();
		for(int val : arr2){
			set.add(val);
		}
		
		// add arr1 
		
		for(int val : arr1){
			 if(set.add(val)){
				 list.add(val);
				 dup++;
			 }
		}
		
		return list.toArray(new Integer [dup]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr1 =  new int[]{1, 2, 3, 5, 6};
		int [] arr2 = new int[]{ 1, 2, 4 };
		
		for (int val: find(arr1,arr2)){
			System.out.println(val);
		}

	}

}
