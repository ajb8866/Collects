import java.util.HashMap;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
		LinkedList<String> deparment = new LinkedList<String>();

		employeeMap.put(10002,"Paul Rugh");
		employeeMap.put(10042,"Mary Rugh");
		employeeMap.put(14042,"Mary Lone");
		employeeMap.put(14445,"Susan Thyme");
		employeeMap.put(64555,"Kevin Baker");
		
		deparment.add("Marketing");
		deparment.add("Accounting");
		deparment.add("Accounting");
		deparment.add("Sales");
		deparment.add("HR");

		
		Collect company1 = new Collect(employeeMap, deparment);
	
		System.out.println(company1.getHashMap());

	}

}
