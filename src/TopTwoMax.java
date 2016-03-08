
public class TopTwoMax {

	
	public static void maxtwo(int[] arr){
		int max1 =0;
		int max2 =0;
		
		for(int val : arr) {
			if(val>max1) {
				max2=max1;
				max1=val;
			} else if(val>max2){
				 max2=val;
				}
			}
         
		System.out.println(max1 + " " + max2);
			
	}
	
	public static void main(String [] args){
		
		int[] arr = new int[]{1,2,3,4,5,5,6};
		maxtwo(arr);
	}
	
}
