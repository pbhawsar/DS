package Practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class BinarytoHexMap {
	
	static File file  = new File("BinaryToHex");
	
	static Map<String,String>  map = new LinkedHashMap<String,String>();
	
	public static String search(String val){
		
		for(Map.Entry<String,String> entry:map.entrySet()){
			if(entry.getKey().equals(val)){
				return map.get(entry.getKey());
			}
			
		}
		
		return "";
	}
	
	
	public static void main(String[] args) {

		// TODO Auto-generated method stub\
		
		
		try {
			Scanner input  = new Scanner(file);
			while (input.hasNextLine()){
				String str = input.nextLine();
				String [] info  = str.split("\\s+");
				
				String key =  String.valueOf(info[0]);
				
				String val =   String.valueOf(info[1]);
				
				map.put(key, val);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
		String bin = "011110101010";
		char [] ch = bin.toCharArray();
		String result = "";
		int j = 0;
		int i = 4;
		for(int k =0;k<(ch.length/4);k++){
			String val = bin.substring(j,i);
			String resval = search(val);
			result = result+resval;
			j=j+4;
			i=i+4;
		}
     
		System.out.println(result);
	}

}
