import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

public class Collect {
	HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
	TreeMap<Integer, String> employeeTreeMap = new TreeMap<Integer, String>();
	Set<String> employeeNameSet = new HashSet<String>(); 

	
	public Collect (HashMap<Integer, String> employeeMap)
	{
		this.employeeMap = employeeMap;
		employeeTreeMap.putAll(employeeMap);
	
		
	}
	public HashMap<Integer, String> getHashMap()
	{
		return employeeMap;
	}
	public void addToHashMap(String name, int ID )
	{
		employeeMap.putIfAbsent(ID, name);
		employeeTreeMap.putIfAbsent(ID, name);
	}
	
	//Show how you would use Set to find the unique elements in a List.
	
	
	//Show an example of HashMap and a TreeMap, and explain the difference
	//The difference between a HashMap and a TreeMap is that a TreeMap is sorted because of its inheritance from SortedMap
	
	//Which should you use (HashMap or TreeMap), if you have to guarantee the order of key, value pairs?
	//You would use a treeMap because a hashMap is never in order, and always random
	
	
	
	

}
