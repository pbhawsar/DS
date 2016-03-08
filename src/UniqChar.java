import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class UniqChar {
	
	// val as  val and count as 
	public static void uniqchar(String str){
		
		Map<Character,Integer> mp  = new HashMap<Character,Integer>();
		
		char [] ch = str.toCharArray();
		
		for (char c : ch){
			
			 if(mp.containsKey(c)){
				   mp.put(c,mp.get(c)+ 1);
			 } else {
				 mp.put(c, 1);
			 }
			
		}
	
		Set set = mp.entrySet();
		Iterator i = set.iterator();
		
		while (i.hasNext()){
     
			Map.Entry me = (Map.Entry)i.next();
			
		System.out.print(me.getKey() +  " ");
		System.out.println(me.getValue());
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		uniqchar("swiss");
	}

}
