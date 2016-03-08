import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;


public class GroceryList {

	
	public static void purchaseHistory() throws FileNotFoundException{
		
		
			File file = new File("test");
			HashMap<String,Float> hm1 = new HashMap<String,Float>();
			//HashMap used to store customer name and total cost
			HashMap<String,Float> hm2 = new HashMap<String,Float>();
			//HashMap used to store category name and total cost
			
		
				Scanner input = new Scanner(file);
				// scanner used to read file
				while(input.hasNextLine()){
					String str = input.nextLine();
					System.out.println(str);
					String[] info = str.split("[|]");
					String name = info[0];
					String type = info[1];
					Float cost = Float.parseFloat(info[3]);
					if(hm1.get(name)==null){
						hm1.put(name,cost);
						hm2.put(name+"-"+type,cost);
					}else if(hm1.containsKey(name)==true){
						hm1.put(name, hm1.get(name)+cost);
						if(hm2.containsKey(name+"-"+type)==true){
							hm2.put(name+"-"+type,hm2.get(name+"-"+type)+cost);
						}else{
							hm2.put(name+"-"+type, cost);
						}
					}
				}
				//printing total revenue by customer with  tax component
				System.out.println();
				System.out.println("Total revenue by customer: ");
				for(String name:hm1.keySet()){
					System.out.println(name+": "+hm1.get(name));
					double value =(hm1.get(name)*9.25/100);
					System.out.println("tax component is : "+value);
					
				}
				//printing spending as per category by each customer with tax component
				System.out.println();
				for(String name:hm1.keySet()){
					System.out.println("\n Purchase by: "+name);
					for(String nametype:hm2.keySet()){
						String[] name1=nametype.split("[-]");
						if(name.equals(name1[0])){
							double value = (hm2.get(nametype)*9.25/100);
							System.out.println("\t"+name1[1]+": "+hm2.get(nametype) + "\t tax component: "+value);
						}
					}
				}
			
	}
	public static void main(String[] args) throws FileNotFoundException{
		purchaseHistory();
	}
	
}
