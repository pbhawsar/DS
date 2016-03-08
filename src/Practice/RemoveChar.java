package Practice;

import java.util.Scanner;

public class RemoveChar {
	
	
	public static String removeChar(String str, char ch){
		char [] carray = str.toCharArray();
		int beforeLen= str.length();
		
		for (char c : carray){
			int index = str.indexOf(ch);
			if(index!=-1){
				str = str.substring(0,index)+str.substring(index+1);
			}
		}
		
		int afterLen = str.length();
		if(beforeLen==afterLen){
			System.out.println("char not found !");
		}
		
       return str;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter the word !");
		String str = sc.next();
		System.out.println("enter the char to be removed!");
		char ch = sc.next().charAt(0);
		System.out.println(removeChar(str, ch));
		

	}

}
