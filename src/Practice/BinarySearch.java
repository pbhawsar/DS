package Practice;

public class BinarySearch {

	public static int bsearch(int [] arr,int key){
		
		int start = 0;
		int end = arr.length -1;
		
		while (start<=end){
			int mid = (start+end)/2;
			
			if(key  == arr[mid]){
				return mid;
			} else if(key<arr[mid]){
				 end =mid-1;
			}else {
				start=mid+1;
			}
		
		}
		return -1;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
		System.out.println(bsearch(arr, 12));
		
	}

}
