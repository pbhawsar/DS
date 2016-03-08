package Practice;

import java.util.HashSet;
import java.util.Set;

public class RemoveDupString {
	
	
	static String result = "";
	static Set<Character> set  = new HashSet<Character>();
	
	public static String removeDupChar(String str){
	     char[] ch = str.toCharArray();
		
	     for(char c : ch){
	    	 if(set.add(c)){
	    		 result+=c;
	    	 }
	     }
		
	     return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(removeDupChar("pranay"));
	
	}

}
