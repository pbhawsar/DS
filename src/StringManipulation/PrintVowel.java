package StringManipulation;

public class PrintVowel {
	
	
	public static void countVowel(String str){
		
		if (str.isEmpty()){
			return;
		}
		String vowel = new String("aeiouAEIOU");
		int vowelCount= 0;
		int consonantCount = 0;
		
		char[] ch = str.toCharArray();
		for(char c : ch){
			int unicode = (int)c;
			
			// check if string contains only character
			if( (unicode <= 90 && unicode >= 65 ) || (unicode <= 122 && unicode >= 97 ) ) {
                 if(vowel.contains(c+"")){
                	 vowelCount++;
                 } else {
                	 consonantCount++;
                 }
				
			} else {
				continue;
			}
			
		}
		System.out.println("Count of vowel "+vowelCount);
		System.out.println("Count of consonants "+consonantCount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		countVowel("pranay");

	}

}
