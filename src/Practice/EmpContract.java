package Practice;

import java.util.HashSet;
import java.util.Set;
// example to show the java hashcode and equals contract
public class EmpContract {

	
	// member variable 
	private int age;
	
	// constructor
	public EmpContract(int age){
		this.age=age;
	}
	
	@Override
	//hashcode method
	public int hashCode(){
		return age;
	}

	@Override
	// equals method
	public boolean equals(Object obj){
		boolean flag = false;
		EmpContract emp = (EmpContract)obj;
		if(emp.age==age)
			flag=true;
		return flag;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    EmpContract emp1  = new EmpContract(23);
    EmpContract emp2 = new EmpContract(24);
    EmpContract emp3 = new EmpContract(25);
    EmpContract emp4 = new EmpContract(26);
    
    Set<EmpContract> set = new HashSet<EmpContract>();
    set.add(emp1);
    set.add(emp2);
    set.add(emp3);
    set.add(emp4);
    
    System.out.println(set.size());
    System.out.println(set.contains(emp2));
    
  
	}

}
