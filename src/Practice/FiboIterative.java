package Practice;

public class FiboIterative {

	
	public static int[] fibo(int limit){
		int[] result = new int[limit];
		
	       result[0]=0;
	       result[1]=1;
	       
	       for(int i =2;i<limit;i++){
	    	   result[i]=result[i-2]+result[i-1];
	       }
		
		return result;
		
	}
	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		int [] arr = fibo(10);
		for(int i=0;i<10;i++){
			System.out.println(arr[i]);
		}
	
	}

}
