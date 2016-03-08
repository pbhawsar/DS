import java.util.Scanner;

public class ReverseString {

	public static void revstr(String str) {

		String[] strarr = str.split(" ");
		String[] result = null;

		for (int i = strarr.length - 1; i >=0; i--) {
			   String temp = strarr[i];
			   for (int j=temp.length()-1;j>=0;j--){
				   System.out.print(temp.charAt(j));
				 
			   }
			   System.out.print(" ");
		}
		
	}
	
	
	public static String revrec(String str){
		
		if(str.length()<2){
			return str;
		}
		
		return   revrec(str.substring(1)) +str.charAt(0);
		
	}
	
	
	public static int revnum(int num){
		
		int rev = 0;
		
		while (num!=0){
		
			rev=rev*10+num%10;
			num=num/10;
		
		}
		
		
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Scanner sc = new Scanner(System.in);
//		System.out.println("enter the value");
//		String str = sc.nextLine();
//		revstr(str);
//		System.out.println(revrec(str));
		System.out.println(revnum(1234));

	}
}
