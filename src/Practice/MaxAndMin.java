package Practice;

public class MaxAndMin {



	public static void topTwo(int[] arr){
		
		int max1 = arr[0];
		int max2 = arr[0];
		
		for(int num : arr){
			
			if(num>max1){
				max2=max1;
				max1=num;
				
			} else if(num>max2){
				max2=num;
			}
			
		}
		System.out.println("max1 "+max1+" max2 "+max2);
	}
	
	 public static void main(String[] args){
		 int[] arr = new int[]{1,2,3,4,5,6};
		 topTwo(arr);
	 }

}
