package Practice;

public class ReverseString {
	 
	static String result;
	public static String revStr(String str){
		String[] ch = str.split("\\s");
		
		for(int i=ch.length-1;i>=0;i--){
			result=result+ch[i];
		}
		
		return result;
		
	}
	
	// recursive
	public static String recRevStr(String str){
	   
		//base case
		if(str.length()<2){
			return str;
		} 
		return  recRevStr(str.substring(1))+str.charAt(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String str = "This is sparta";
       System.out.println(revStr(str));
	}

}
