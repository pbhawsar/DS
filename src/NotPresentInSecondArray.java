import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class NotPresentInSecondArray {

	
	public static Integer[] rem(Integer [] arr1, Integer [] arr2){
		
		
		Set<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> alist = new ArrayList<Integer>();
		int  count = 0;
		
		for (int val : arr2){
			   set.add(val);
			
		}
		
		// we try to add first array into set as well
		
		for(int val: arr1){
			
			if(set.add(val)){
				alist.add(val);
				count++;
			}
		}
		
		return alist.toArray(new Integer[count]);
	}
	
	
public static void main(String[] args){
		
		for(int i : rem(new Integer[]{ 1, 2, 3, 5, 6}, new Integer[] { 1, 2, 4 })){
			System.out.println(i);
		}
	}
	
}
