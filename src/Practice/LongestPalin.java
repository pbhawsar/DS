package Practice;

public class LongestPalin {
	
	
	public static String longestPalindrome(String str){
		
		String longestPalin = null;
		int maxPalinLen = 0;
		int lenstr = str.length();
		
		for(int i = 0 ; i<lenstr; i++){
			for(int j=i+1;j<lenstr;j++){
				int lensub = j-i;
				String curr = str.substring(i,j+1);
				if(isPalin(curr)){
					if(lensub>maxPalinLen){
						longestPalin=curr;
						maxPalinLen=lensub;
					}
				}
				
			}
		}
		
		return longestPalin;
		
	}
	
	public static boolean isPalin(String substr){
		for(int i=0,j=substr.length()-1;i<=j;i++,j--){
			if(substr.charAt(i)!= substr.charAt(j)){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("12145445499"));
	    System.out.println(longestPalindrome("1223213"));
	    System.out.println(longestPalindrome("abb"));

	}

}
