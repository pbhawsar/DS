package Practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDupElArray {
	
	
	 static  Set<Integer> set  = new HashSet<Integer>();
	 static  ArrayList<Integer> list = new ArrayList<Integer>();
	  
	  public static  Integer[] removeDup(Integer[] arr){
		  int count = 0;
		  
		  for (int val : arr){
			  if(set.add(val)){
				  list.add(val);
				  count++;
			  }
		  }
		  
		  return list.toArray(new Integer[count]);
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Integer [] arr = new Integer[]{1,2,3,4,5,2,4,6,7,8,8,7};
      for(int val : removeDup(arr)){
    	  System.out.println(val);
      }
      
	}

}
