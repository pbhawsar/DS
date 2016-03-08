package Practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDupChar {

 static Map<Character,Integer>  map = new LinkedHashMap<Character,Integer>();
	
    public static void removeDup(String str){
          char[] ch = str.toCharArray();
          for(char c : ch){
        	  if(map.containsKey(c)){
        		  map.put(c,map.get(c)+1);
        	  }else{
        		  map.put(c, 1);
        	  }
          }
          
          
          for(Map.Entry<Character,Integer> entry : map.entrySet()){
        	  System.out.println("value is "+entry.getKey() + "times" +entry.getValue());
          }
           
    }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       removeDup("Pranay");
	}

}
