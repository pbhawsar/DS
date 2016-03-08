package Practice;

public class Anagram {
    
	
	
	public boolean isAnagram(String str1, String str2){
		
		char[] ch = str1.toCharArray();
		
		for(char c : ch){
			int index = str2.indexOf(c);
			if(index != -1){
				str2 = str2.substring(0,index)+str2.substring(index+1);
			} else {
				return false;
			}
		}
		
		return str2.isEmpty();
		
	}
	

	
	public static void main(String args[]){
	
		Anagram a = new Anagram();
		System.out.println(a.isAnagram("army","mary"));
		System.out.println(a.isAnagram("arsfmy","mary"));
		
	}
	
}
