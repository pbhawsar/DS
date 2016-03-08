package Practice;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
	
	
	public static  List<Integer> factors(int num ){
		List<Integer> list = new ArrayList<Integer>();
		for (int i=2;i<num;i++){
			if(num%i==0){
				list.add(i);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       for(int val : factors(35)){
    	System.out.println(val);   
       }
	}

}
