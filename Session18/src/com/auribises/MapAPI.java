package com.auribises;

import java.util.HashMap;	// Class | HashMap implements Map
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;		// Interface
import java.util.Set;

public class MapAPI {

	public static void main(String[] args) {
		
		//Map<Integer, String> map = new HashMap<Integer, String>();
		//HashMap map = new HashMap();
		// 	   <Key, Value>
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(123, "John");
		map.put(567, "Jennie");
		map.put(765, "Kia");
		map.put(333, "Fionna");
		map.put(176, "Jennie");
		
		map.put(765, "Jim");	// Update Operation
		
		// We define keys ourselves
		// Keys can not be repeated. They are unique.
		// Value for different keys may be same
		// we can create a null key as well which will be only 1
		// we can have null values as well which can be many
		// HashMap works on Hashing Principle and hence data will be added in an unordered way
		
		map.put(null, "Mike");
		map.put(987, null);
		
		// Read Operation
		System.out.println("==map contents==");
		System.out.println(map);
		System.out.println(">> size is: "+map.size());
		// Read Single element
		String name = map.get(176);
		System.out.println(">> name is: "+name);
		

		if(map.containsKey(765)){
			System.out.println(">> 765 key exists in the map");
		}
		
		if(map.containsValue("Jennie")){
			System.out.println(">> Jennie exists in map");
		}
		
		System.out.println(">> map before: "+map);
		map.remove(765);
		System.out.println(">> map after: "+map);
		
		//map.clear();
		
		System.out.println();
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
		System.out.println();
		
		Iterator<Integer> itr = keys.iterator();
		while(itr.hasNext()){
			Integer key = itr.next();
			String value = map.get(key);
			
			System.out.println(key+"\t"+value);
		}
		
		System.out.println();
		
		// Thread-Safe i.e. Synchronized
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(123, "John");
		table.put(567, "Jennie");
		table.put(765, "Kia");
		table.put(333, "Fionna");
		table.put(176, "Jennie");
		
		//table.put(null, "Harry"); // neither null key nor null value is allowed
		//table.put(111, null);
		
		System.out.println(table);
		
	}

}
