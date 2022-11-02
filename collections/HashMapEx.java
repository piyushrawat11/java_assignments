package collections;
import java.util.HashMap;
import java.util.Map;
public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Employee>mp=new HashMap<Integer,Employee>();
	
		Employee e1 = new Employee(2,"Raj Malhotra",25000,10);
		
		mp.put(e1,e1.getSalary());

        Employee e = new Employee(1,"Anubhav Sinha",15000,10);

        mp.put(e,e.getSalary());

        mp.add(new Employee(3,"Sangeeta Shah",35000,20));
        mp.add(new Employee(2,"Raj Malhotra",25000,10)); //duplicate
	
	
	
	
	}

}
