import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class FifthHighest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limi");
		int limit = sc.nextInt();

		int[] arr = new int[limit];
		for (int i = 0; i < limit; i++) {
			arr[i] = sc.nextInt();
		}

		// for(int result: arr){
		// System.out.println(result);
		// }

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		

//		for (int result : arr) {
//			System.out.println(result);
//		}
   System.out.println(arr[4]);
	}

}
