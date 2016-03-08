import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


public class RemoveDupArr {

	
	public static Integer[] removedup(Integer[] arr){
		
		Set set = new HashSet();
		ArrayList<Integer> alist= new ArrayList<Integer>();
		int count =0;
		
		for( int val : arr){
			if(set.add(val)){
				alist.add(val);
				count++;
			}
			
		}
		
		
		return alist.toArray(new Integer [count]);
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
	   Integer[] arr = new Integer[]{1,2,3,4,5,2,4,6,7,8,8,7};
		
		for(int res : removedup(arr)){
			System.out.print(res);
			System.out.print(" ");
		}
	}

}
