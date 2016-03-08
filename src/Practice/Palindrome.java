package Practice;

public class Palindrome {
// check if the string is palindro or not and array as well.
	
	
	
	public static boolean palin(String str){
		
		for(int i=0,j=str.length()-1;i<=j;i++,j--){
			if(str.charAt(i)!=str.charAt(j)) return false;
		}
		
//		for(int i=arr.length-1,j=0;i>=j;i--,j++){
//			 if(arr[i] ==arr[j]){
//				
//			 } else {
//				 return false;
//			 }
//		}
		return true;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int [] arr = new int[]{1,2,5,2,1};
       String str1 = "aewiwea";
       System.out.println(palin(str1));
	}

}
