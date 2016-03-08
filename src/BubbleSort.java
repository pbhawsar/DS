
public class BubbleSort {

	
	public static int[] bsort(int[] arr){
		
		boolean flag = true;
		int temp = 0;
		while(flag){
			for(int i=0;i<arr.length-1;i++){
				 if(arr[i]>arr[i+1]){
					 temp = arr[i];
					 arr[i]=arr[i+1];
					 arr[i+1]=temp;
					 flag =true;
				 }
			}
		}
		
		return arr;
	}
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = new int[]{84,69,76,86,94,91};
	}

}
