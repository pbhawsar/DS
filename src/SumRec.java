
public class SumRec {

	static int total = 0;
	public static int sum(int num){
		
		while (num !=0){
			total = total+num%10; // extreme right
			num=num/10;// right digits
		}
		
		
		return total;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		System.out.println(sum(12345));
		
	}

}
