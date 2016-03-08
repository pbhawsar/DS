package Practice;

import java.util.HashMap;
import java.util.Map;

public class DupElementArray {
// find a duplicate element and print the number of occurrence
	
	public static void dupArray(int [] arr){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>(arr.length);
		
		for(int val : arr){
			if(map.containsKey(val)){
				map.put(val,map.get(val)+1);
			} else {
				map.put(val, 1);
			}
		}
		
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			System.out.println(entry.getKey()+ ":" +entry.getValue());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = new int[]{1, 2, 3, 3, 4, 5, 6, 6, 6, 7, 0, 9 };
		dupArray(arr);

	}

}
