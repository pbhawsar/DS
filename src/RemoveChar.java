import java.util.HashSet;
import java.util.Set;

public class RemoveChar {

	public static void removedup(String str) {

		String res = "";
		Set set = new HashSet();

		char[] ch = str.toCharArray();

		for (char c : ch) {
			if (set.add(c)) {

				res = res + c;

			}
		}

		System.out.println(res);

	}

	public static void powernum(int base, int val) {

		int pow = 1;
		for (int i = 0; i < val; i++) {
			pow = pow * base;
		}
		System.out.println(pow);
	}

	public static int powerrec(int base, int p) {

		if (p == 1)
			return base;

		return base * powerrec(base, p - 1);

	}

	public static String rmchar(String str, char c) {

		String res = "";
		for (int i = 0; i < str.length(); i++) {

			if (str.charAt(i) != c) {
				res = res + str.charAt(i);
			} 
		}
		return res;
	}
    
	public static void dict(String str){
		
		for (int i=0;i<str.length();i++){
			    for (int j=i;j<str.length();j++){
			    	System.out.println(str.substring(i,j));
			    }
		}
	}
	
	public static boolean pow2(int num){
		
		int sqr = 1;
		
		while (num>=sqr){
			  
			     if(sqr==num){
return true;
			     } else {
			    	 sqr=sqr*2;
			     }
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// String str = "pranay" ;
		// removedup(str);
		// powernum(2, 3);
//		System.out.println(rmchar("pranay", 'a'));
		String str = "abcdef";
		dict(str);
//		System.out.println(pow2(1028));
		
	}

}
