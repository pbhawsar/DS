package Practice;

public class SumNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
       int number = 12345;
		while (number != 0){
			 sum = sum+number%10;
			 number=number/10;
		}
		System.out.println(sum);
	}

}
