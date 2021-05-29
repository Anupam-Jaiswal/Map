import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExample
{
	public static void main(String args[])
	{
		TreeMap <Integer, String> t = new TreeMap<Integer, String> ();
		t.put(110,"anupam");
		t.put(105,"monu");
		t.put(102,"sonu");
		t.put(106,"suraj");
		t.put(109,"moucho");
		t.put(107,"doli");
		t.put(104,"juli");
		t.put(103,"kanisk");
		t.put(101,"aanu");
		t.put(108,"prithvai");
		t.put(111,"over");
		
		System.out.println(t);
		
		SortedMap <Integer,String> sm = t.subMap(102,108);
		//System.out.println(sm);
		TreeMap <Integer, String> t2 = new TreeMap<Integer, String> (sm);
		System.out.println(sm);
		
		SortedMap <Integer, String> sm2 = t.tailMap(105);
		System.out.println(sm2);
		
		TreeMap <Integer, String> t3 = new TreeMap <Integer, String> (t.headMap(108));
		System.out.println(t3);
	}
}
