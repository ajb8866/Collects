import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		HashMap<String, Integer> employeeMap = new HashMap<String, Integer>();
		Collect company1 = new Collect(employeeMap);
		System.out.println(company1.getHashMap());

	}

}
