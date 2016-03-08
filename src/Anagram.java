
public class Anagram {
	
	
	public static boolean anagram(String str1, String str2){
		
		char[] ch  = str2.toCharArray();
		
		for (char c: ch){
			int index = str1.indexOf(c);
			   if (index != -1){
				   str1=str1.substring(0,index)+str1.substring(index+1);
			   }
			  return false;
		}
		
		return str1.isEmpty();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1 = "mary";
		String str2 = "army";
		
		
		
		
	}

}
