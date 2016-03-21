package Practice;

public class PalinNumber {

	public static boolean isPalin(int num){
		if(num == reverse(num))
			return true;
		return false;
	}
	
	public static int reverse(int num){
		int temp = 0;
		while(num != 0){
			temp = temp*10+num%10;
		    num = num/10;
		}
		return temp;
	}
	
	public static void main(String [] args){
		System.out.println(isPalin(123));
	}
}
