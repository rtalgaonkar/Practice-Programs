package StringPrograms;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapTest {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(1);
		Employee e2 = new Employee(2);
		
		e1.setName("Rajul");
		e2.setName("Ruchit");
		
		Map<Employee, String> empMap = new HashMap<Employee, String>();
		empMap.put(e1,e1.getName());
		
		Map<Employee, String> conEmp = new ConcurrentHashMap<Employee, String>();
	
	}

	
}

class Employee {
	private Integer empId;
	private String name;
	
	public Employee(Integer empId) {
		this.empId = empId;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
