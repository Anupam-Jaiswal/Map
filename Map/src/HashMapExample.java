import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample
{
	public static void main(String args[])
	{
		HashMap <Integer,String> hs = new HashMap <Integer,String>();
		hs.put(100,"anupam");
		hs.put(104,"gaurav");
		hs.put(102,"satyam");
		hs.put(103,"mousumi");
		hs.put(101,"amaani");
		
		System.out.println(hs);
		
		// retrieve all keys present in a HashMap?
		
		Set <Integer> s = hs.keySet();//to fetch all the keys 
		System.out.println(s);
		
		
		// retrieve all values present in a HashMap?
		
		Collection <String> c = hs.values();//To fetch all the values
		System.out.println(c);
		
		//retrieve all key-value pairs present in a HashMap?
		
		Set <Entry <Integer,String>> en = hs.entrySet();
		for(Entry <Integer,String> e: en)
		{
			System.out.println(e.getKey()+ " "+e.getValue() );
		}
		
		//add given key-value pair to HashMap if and only if it is not present in the HashMap?
		
		hs.putIfAbsent(102, "jaiswal");
		hs.putIfAbsent(105,"papa");
		System.out.println(hs);
		
		// retrieve a value associated with a given key from the HashMap?
		
		System.out.println(hs.get(102));
		
		// To check whether a particular key/value exist in a HashMap?
		
		System.out.println(hs.containsKey(106));
		System.out.println(hs.containsValue("amaani"));
		
		// find out the number of key-value mappings present in a HashMap?
		
		System.out.println(hs.size());
		
		//remove all key-value pairs from a HashMap?
		
		/*hs.clear();
		System.out.println(hs);*/
		
		//remove a key-value pair from the HashMap?
		
		hs.remove(104);
		System.out.println(hs);
		
		 //remove a key-value pair from a HashMap if and only if the specified key is currently mapped to given value?
		
		hs.remove(101,"amaani");
		hs.remove(102,"sonu");
		System.out.println(hs);
			
		//replace a value associated with a given key in the HashMap?
		
		hs.replace(100, "anupam", "annu");
		System.out.println(hs);
		
		//replace a value associated with the given key if and only if it is currently mapped to given value?
		
		hs.replace(102,"sonu");
		System.out.println(hs);
		
		// synchronized HashMap in java?
		
		Map m = Collections.synchronizedMap(hs);
		System.out.println(m);
		
		
	}
	
}
