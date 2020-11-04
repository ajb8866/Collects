import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeMap;

public class Collect {
	HashMap<Integer, String> employeeMap = new HashMap<Integer, String>();
	TreeMap<Integer, String> employeeTreeMap = new TreeMap<Integer, String>();
	LinkedList<String> deparment = new LinkedList<String>();
	Set<String> employeeDeparment = new HashSet<String>(); 

	
	public Collect (HashMap<Integer, String> employeeMap,LinkedList<String> deparment3)
	{
		this.employeeMap = employeeMap;
		employeeTreeMap.putAll(employeeMap);
		this.deparment = deparment3;
		for(int x = 0; x < deparment3.size(); ++x)
		{
			employeeDeparment.add(deparment3.get(x));
		}
	
		
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
	
	public void addToLinkedList(String name )
	{
		deparment.add(name);
		employeeDeparment.add(name);
	}
	public boolean containsName(String key)
	{
		
		return employeeDeparment.contains(key);
	}
	
	//Show how you would use Set to find the unique elements in a List.
	
	
	//Show an example of HashMap and a TreeMap, and explain the difference
	//The difference between a HashMap and a TreeMap is that a TreeMap is sorted because of its inheritance from SortedMap
	
	//Which should you use (HashMap or TreeMap), if you have to guarantee the order of key, value pairs?
	//You would use a treeMap because a hashMap is never in order, and always random
	
	
	
	

}
