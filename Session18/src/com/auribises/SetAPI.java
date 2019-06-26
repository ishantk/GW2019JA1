package com.auribises;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetAPI {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("John");		//0
		names.add("Fionna");
		names.add("John");
		names.add("Sia");
		names.add("Leo");
		names.add("Dave");
		names.add("Anna");		//n-1
		
		System.out.println(">> names are: "+names);
		
		//Set<String> set = new HashSet<String>();
		//HashSet set = new HashSet();
		//HashSet<String> set = new HashSet<String>();
		TreeSet<String> set = new TreeSet<String>();
		
		set.add("John");		// HashCode-1
		set.add("Fionna");
		set.add("John");
		set.add("Sia");
		set.add("Leo");
		set.add("Dave");
		set.add("Anna");		// HashCode-n
		
		System.out.println(">> set is: "+set);
		
		// List will have duplicacy and Set will have Uniqueness
		// List works on indexing and Set works on Hashing
		
		String name = names.get(1);
		//String name = set.get(); 	// error - we cannot get element from set as we have no index available
		
//		int size = set.size();
//		System.out.println("size of set is:"+size);
		
		System.out.println("size of set is:"+set.size());
		
		set.remove("Sia");
		
		if(set.contains("Anna")){
			System.out.println(">> Anna is in the Set");
		}
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String nm = itr.next();
			System.out.println(">> "+nm);
		}
		
		
	}

}
