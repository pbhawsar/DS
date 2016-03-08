import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SingleKeyMultiValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		// create a map to store value
		HashMap<String,List<String>> mp = new HashMap<String,List<String>>(); 
		
		// create a list to store each value for a single key
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Apple");
		list1.add("Aeroplane");
		
		List<String> list2 = new ArrayList<String>();
		list2.add("Banana");
		list2.add("Boulder");
		
		List<String> list3 = new ArrayList<String>();
		list3.add("Cat");
		list3.add("Cucumber");
		
		//populate the hashmap
		
		mp.put("A",list1);
		mp.put("B",list2);
		mp.put("C",list3);
		
		for(Map.Entry<String, List<String>> entry : mp.entrySet()){
			String key = entry.getKey();
			List<String> value = entry.getValue();
			System.out.print("key is " + key);
			System.out.println(" value is "+ value);
		}
	   
		
		
		
		
	}

}
