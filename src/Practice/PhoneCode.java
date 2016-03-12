package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneCode {
      
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		  ArrayList<String> two = new ArrayList<String>();
		  two.add("A");
		  two.add("B");
		  two.add("C");
		  
		  ArrayList<String> three = new ArrayList<String>();
		  three.add("D");
		  three.add("E");
		  three.add("F");
		  
		  ArrayList<String> four = new ArrayList<String>();
		  four.add("G");
		  four.add("H");
		  four.add("I");
		  
		  ArrayList<String> five = new ArrayList<String>();
		  five.add("J");
		  five.add("K");
		  five.add("L");
		  
		  ArrayList<String> six = new ArrayList<String>();
		  six.add("M");
		  six.add("N");
		  six.add("O");
		  
		  ArrayList<String> seven = new ArrayList<String>();
		  seven.add("P");
		  seven.add("Q");
		  seven.add("R");
		  seven.add("S");
		  
		  ArrayList<String> eight = new ArrayList<String>();
		  eight.add("T");
		  eight.add("U");
		  eight.add("V");
		  
		  ArrayList<String> nine = new ArrayList<String>();
		  nine.add("W");
		  nine.add("X");
		  nine.add("Y");
		  nine.add("Z");
		  
		  Map<String, ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
		  map.put("0",new ArrayList<String>(Arrays.asList("0")));
		  map.put("1",new ArrayList<String>(Arrays.asList("1")));
		  map.put("2",two );
		  map.put("3",three);
		  map.put("4",four);
		  map.put("5",five);
		  map.put("6",six);
		  map.put("7",seven);
		  map.put("8",eight);
		  map.put("9",nine);
		  
		  
		  for(Map.Entry<String,ArrayList<String>> entry: map.entrySet() ){
			  System.out.println(entry.getKey() +" "+ entry.getValue() );
		  }
		  
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the number");
		  String val = sc.nextLine();
		  System.out.println(val);
		  String[] str = val.split("");
		  int i=0;
		  while(i<str.length){
			  if(map.containsKey(str[i])){
				  System.out.println(map.get(str[i]));
			  }
			  i++;
		  }
		 
		
	}

}
