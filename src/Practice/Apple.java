package Practice;

/*
 * 1) If two objects are equal, then they must have the same hash code.
   2) If two objects have the same hash code, they may or may not be equal.
   
   http://www.javaworld.com/article/2074996/hashcode-and-equals-method-in-java-object---a-pragmatic-concept.html
 */
import java.util.HashMap;

public class Apple {
	private String color;
 
	public Apple(String color) {
		this.color = color;
	}
 // overriding equals method
	@Override
	public boolean equals(Object obj) {
		if(obj==null) return false;
		if (!(obj instanceof Apple))
			return false;	
		if (obj == this)
			return true;
		return this.color.equals(((Apple) obj).color);
	}
 
	
	// override hashcode method
	
	public int hashcode(){
		return this.color.hashCode();
		
	}
	public static void main(String[] args) {
		Apple a1 = new Apple("green");
		Apple a2 = new Apple("red");
 
		//hashMap stores apple type and its quantity
		HashMap<Apple, Integer> m = new HashMap<Apple, Integer>();
		m.put(a1, 10);
		m.put(a2, 20);
		System.out.println(m.get(new Apple("green")));
	}
}