package com.auribises;

import java.util.ArrayList;		// class
import java.util.Iterator;		// interface
import java.util.List;			// interface
import java.util.ListIterator; 	// interface
import java.util.Vector;

// In Java each and every class is either Child or Grand Child of Object :)
// Object is Root Class in Java. i.e. Parent to all

class Student{// extends Object{
	int roll;
	String name;
	
	void show(){
		System.out.println(">> "+roll+" | "+name);
	}
	
	public String toString(){
		return ">> "+roll+" | "+name;
	}
}

public class ListAPI {

	public static void main(String[] args) {

		//int i=0;				// Primitive : Hold Value
		//String[] items = null;	// Reference : Hold either null or HashCode
		//String [] items = new String[10];
		// IBU : Initialization Before Use Principle
		//System.out.println("i is: "+i);
		//System.out.println("items is:"+items);
		
		// Arrays:
		// 1. Homogeneous
		// 2. Size cannot be changed
		// 3. Size is FIXED
		
		// Why we need List i.e. Collection
		// 1. So that we can save Homo/Hetro Data
		// 2. We can manipulate Size as per the need at run time
		// eg : shopping cart
		
		// 1. Collection ArrayList Creation
		
		// Ref Var of interface can point to the object which implements it !!
		//List list1 = new ArrayList(); 	// Polymorphic Statement
		ArrayList list1 = new ArrayList();	// Direct Object Construction
		// list1 is known as Hetorgeneous Storage Container
		
		ArrayList<String> list2 = new ArrayList<String>();
		// list2 is known as Homogeneous Storage Container
		
		ArrayList<Student> list3 = new ArrayList<Student>();
		// list3 is known as Homogeneous Storage Container
		
		Student s1 = new Student();
		s1.roll = 1;
		s1.name = "Leo";
		
		Student s2 = new Student();
		s2.roll = 2;
		s2.name = "Mike";
		
		// 2. Add Data in ArrayList
		list1.add("John");		// 0
		list1.add(10);			// 1
		list1.add(2.2);			// 2
		list1.add("Jennie");	// 3
		list1.add('X');			// 4
		list1.add(s1);			// 5
		
		list2.add("John");		// 0
		list2.add("Jennie");	// 1	
		list2.add("Kia");		// 2
		list2.add("Fionna");	// 3
		list2.add("Leo");		// 4
		//list2.add(10); // err
		//list2.add(s2); // err
		
		list3.add(s1);			// 0
		list3.add(s2);			// 1
		//list3.add(10); 	  	// err
		//list3.add("Harry"); 	// err
		
		// 3. Size of List
		System.out.println("list1 size is: "+list1.size());
		System.out.println("list2 size is: "+list2.size());
		System.out.println("list3 size is: "+list3.size());
		
		// 4. View Data in List
		System.out.println("===list1===");
		System.out.println(list1);
		
		System.out.println("===list2===");
		System.out.println(list2);
		
		System.out.println("===list3===");
		System.out.println(list3);
		
		//Object oRef = new String("Hello");
		//oRef = new Student();
		
		System.out.println();
		
		// 5. Read a single value from List
		Object oRef = list1.get(2);
		String name = list2.get(1);
		Student sRef = list3.get(0);
		
		System.out.println(oRef);
		System.out.println(name);
		System.out.println(sRef);
		
		// 6. Add Data in Between
		System.out.println(">> list2 before add is: "+list2);
		list2.add(2, "Mia");
		System.out.println(">> list2 after add is: "+list2);
		
		System.out.println();
		
		// 7. Update Data in List
		list2.set(2, "Mia Watson");
		System.out.println(">> list2 after update is: "+list2+" | "+list2.size());
		
		// 8. Remove Data from List
		list2.remove(2);
		//list2.clear(); // remove all operation i.e. make the list empty
		System.out.println(">> list2 after remove is: "+list2+" | "+list2.size());
		
		if(list2.contains("John")){
			System.out.println("John is in the list");
		}
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Fionna");
		names.add("George");
		names.add("Leo");

		list2.addAll(names);
		System.out.println(">> list2 now is: "+list2);
		System.out.println(">> names is: "+names);
		
		int idx = list2.lastIndexOf("Leo");//list2.indexOf("Leo");
		System.out.println("index of Leo is: "+idx);
		
		// Read All Elements in List
		System.out.println(">>>>> 1. Read using for Loop >>>>>");
		for(int i=0;i<list2.size();i++){
			String nm = list2.get(i);
			System.out.println(">> "+nm);
		}
		
		System.out.println();
		
		for(int i=0;i<list1.size();i++){
			Object o = list1.get(i);
			System.out.println(">> "+o);
		}
		
		System.out.println();
		
		for(int i=0;i<list3.size();i++){
			Student s = list3.get(i);
			System.out.println(">> "+s);
		}
		
		System.out.println(">>>>> 2. Read using enhanced for Loop >>>>>");
		
		for(Object o : list2){
			System.out.println(">> "+o);
		}
		
		System.out.println();
		
		for(String nm : list2){
			System.out.println(">> "+nm);
		}
		
		System.out.println();
		
		for(Student s : list3){
			System.out.println(s);
		}
		
		System.out.println(">>>>> 3. Read using Iterator >>>>>");
		
		Iterator<Object> itr1 = list1.iterator();
		Iterator<String> itr2 = list2.iterator();
		Iterator<Student> itr3 = list3.iterator();
		
		/*
		System.out.println(itr1.next());
		System.out.println(itr1.next());
		
		System.out.println();
		
		System.out.println(itr2.next());
		System.out.println(itr2.next());
		System.out.println(itr2.next());
		
		System.out.println();
		
		System.out.println(itr3.next());
		*/
		
		while(itr1.hasNext()){
			Object o = itr1.next();
			System.out.println(o);
		}
		
		System.out.println(">>>>> 4. Read using ListIterator >>>>>");
		
		System.out.println(">> Before list2: "+list2);
		
		while(itr2.hasNext()){
			String str = itr2.next();
			System.out.println(str);
			
			if(str.equals("Leo")){
				itr2.remove();
			}
		}
		
		System.out.println(">> After list2: "+list2);
		
		
		System.out.println();
		
		ListIterator<String> listItr2 = list2.listIterator();
		
		while(listItr2.hasNext()){
			String str = listItr2.next();
			System.out.println(str);
		}
		System.out.println("---");
		while(listItr2.hasPrevious()){
			String str = listItr2.previous();
			System.out.println(str);
		}
	
		// Vector is Thread-Safe Version of ArrayList i.e. it is by default Synchronized
		Vector<String> vector = new Vector<String>();
		vector.add("Fionna");
		vector.add("George");
		vector.add("Leo");
		
		System.out.println(">> vector is: "+vector);
		
	}

}
