package CoreJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionsPractise {
	
	public void TestArralist() {
		ArrayList<String> a1= new ArrayList<String>();
		a1.add("Swamy");
		a1.add("LX");
		a1.add("Laxmnarayan");
		a1.add("Pranali");
		System.out.println(a1);
		a1.remove(2);
		System.out.println(a1);
		System.out.println("Contains yes or no "+a1.contains("LX"));
		System.out.println("index of Element"+a1.indexOf("Swamy"));
		a1.clear();
		System.out.println(a1);		
	}
	
	public void TestHastSet() {
		HashSet<String> h1= new HashSet<String>();
		h1.add("Swamy");
		h1.add("LX");
		h1.add("Laxmnarayan");
		h1.add("Pranali");
		h1.add("LX");
		System.out.println(h1);	
		
		Iterator<String> i= h1.iterator();
		i.next();
		System.out.println(i.next());	
		
		//while(i.hasNext()) {
			//System.out.println(i.next());	
		//}
		//
		
	}
	
	
	public void TestHastMap() {
		
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		h1.put(1, "Laxmi");
		h1.put(2, "LX");
		h1.put(3, "Swami");
		h1.put(5, null);
		h1.put(4, "Swami");
		h1.remove(3);
		System.out.println(h1);
		System.out.println(h1.get(3));
		Set s1=h1.entrySet();
		Iterator i1=s1.iterator();
		//System.out.println(i1.next());
		
		while(i1.hasNext())
		{
			Map.Entry mp= (Map.Entry)i1.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}		
	}
	
public void TestHastTable() {
		
		Hashtable<Integer,String> h1=new Hashtable<Integer,String>();
		h1.put(1, "Laxmi");
		h1.put(2, "LX");
		h1.put(3, "Swami");
		h1.put(3, "Narayan");
		h1.put(4, "Swami");
		System.out.println(h1);
		System.out.println(h1.get(3));
		Set s1=h1.entrySet();
		Iterator i1=s1.iterator();
		//System.out.println(i1.next());
		
		while(i1.hasNext())
		{
			Map.Entry mp= (Map.Entry)i1.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}		
	}

static void characterCount(String inputString) {

// Creating a hashmap object.
HashMap<Character, Integer> hash_map = new HashMap<>();
char[] strArray = inputString.toCharArray();


for (char c : strArray) {
if (hash_map.containsKey(c)) {
hash_map.put(c, hash_map.get(c) + 1);
}

else {
hash_map.put(c, 1);
}

}
// Print the hashmap object which gives the number of each character in String.
System.out.println(hash_map);

}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionsPractise t1= new CollectionsPractise();
		//t1.TestArralist();
		//t1.TestHastSet();
		//t1.TestHastMap();
		//t1.TestHastTable();
		characterCount("rahulshettyacademy");
	}

}
