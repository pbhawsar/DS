package Practice;

public class LargestAndSmallest {

	
	public static void largetSmallest(int [] arr){
		
		int max =arr[0];
		int min =arr[0];
		
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			} else if (arr[i]<min){
				min=arr[i];
			}
		}
		
		System.out.println("Max " + max + "Min "+min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr = new int[]{1,2,3,8,6,13,5,9,13};
      largetSmallest(arr);
	}

}
