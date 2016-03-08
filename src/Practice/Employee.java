package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparable<Employee> {

	int id;

	public Employee(int id) {
		this.id = id;
	}

	@Override
	public String toString(){
		return " "+id;
	}
	

	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		int id1 = this.id;
		int id2 = o.id;
		
		if(id1<id2)
			return -1;
	    if(id1>id2)
	    	return +1;
	    else 
	    	return 0;
		
	}
	
	public static void main(String [] args){
		List t = new ArrayList<Employee>();
		Employee e1  = new Employee(100);
		Employee e2  = new Employee(200);
		Employee e3 = new Employee(300);
		t.add(e2);
		t.add(e1);
		t.add(e3);
		System.out.println("List");
		Collections.sort(t,new MyComparator());
		System.out.println(t);
		
	}
}

class MyComparator implements Comparator<Employee> {
	@Override
	public int compare(Employee obj1 , Employee obj2){
		 Integer i1 = obj1.id;
		 Integer i2 = obj2.id;
		 
		 return i2.compareTo(i1);
		
		
	}
}



