package Practice;

public class PowerOf2orNot {
	
	public static boolean power2(int num){
		int square = 1;
		
		while(num>=square){
			
			if (num == square){
				return true;
			}
			
			square = square *2;
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(power2(1624));
	}

}
