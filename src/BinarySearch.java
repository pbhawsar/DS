
public class BinarySearch {
	
	
	public static void bsearch( int k, int lb,int ub, int [] arr){
		
		int pos = (lb+ub)/2;
		
		while((arr[pos]!=k)&&(lb<=ub)){
			   
			   if(arr[pos]<k){
				   lb=pos+1;
			   } else {
				   ub=pos-1;
			   }
			   pos=(ub+lb)/2;
		}
		
		if(lb<=ub){
			System.out.println("found");
		}
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
	int [] arr = new int []{13, 24, 34, 46, 52, 63, 77, 89, 91, 100 };
	int key = 77;
       
	bsearch(key, 0, 9, arr);
	}

}
