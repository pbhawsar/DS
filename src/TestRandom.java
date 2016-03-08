import java.util.Date;
import java.util.Random;


public class TestRandom {
	
	
	public static void rand(){
		int randval=0;
		Random randGen = new Random(3);
		for(int i =0;i<5;i++){
			 randval = randGen.nextInt(5);
			 System.out.println(randval);
		}

	}
	
	public static void main(String[] args){
		rand();
	}
}
