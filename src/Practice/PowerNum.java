package Practice;

public class PowerNum {

	
	public static double pow(int base , int pow){
		double temp = 1;
		for(int i=0 ;i<pow;i++){
			
			temp = temp*base;
			
		}
		return temp;
	}
	
	public static double recpow(int base , int pow){
		
		if(pow == 1) {
			return base;
		}
		return base*recpow(base,pow-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.println(recpow(2,3));
	}

}
