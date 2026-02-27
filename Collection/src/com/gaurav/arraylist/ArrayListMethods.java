package com.gaurav.arraylist;

import java.util.ArrayList;

public class ArrayListMethods 
{
	public static void main(String[] args) 
	{
		// Create ArrayList objects
		ArrayList<String> al = new ArrayList<String>();   // Main ArrayList
		ArrayList<String> al2 = new ArrayList<String>();  // Second ArrayList
		
		// add() → Adds elements to the ArrayList
		al.add("Gaurav");
		al.add("Vinod");
		al.add("Bhagyesh");
		al.add("Suraj");
		al.add("Vikas");
		al.add("Abhishek");
		al.add("Vitthal");
		al.add("Akash");
		al.add("Praful");
		al.add("Gaurav"); // Duplicate elements are allowed
		
		// add() elements to second ArrayList
		al2.add("Gaurav");
		al2.add("Vinod");
		al2.add("Bhagyesh");
		al2.add("Suraj");
		al2.add("Vikas");
		
		// get(index) → Returns element at the given index
		System.out.println("get(): " + al.get(0));
		
		// size() → Returns total number of elements
		System.out.println("size(): " + al.size());
		
		// contains() → Checks if element exists
		System.out.println("contains(): " + al.contains("Gaurav"));
		
		// indexOf() → Returns first index of element
		System.out.println("indexOf(): " + al.indexOf("Gaurav"));
		
		// lastIndexOf() → Returns last index of element
		System.out.println("lastIndexOf(): " + al.lastIndexOf("Gaurav"));
		
		// remove(index) → Removes and returns element
		System.out.println("remove(): " + al.remove(0));
		System.out.println(al);
		
		// set(index, element) → Replaces element and returns old value
		System.out.println("set(): " + al.set(0, "Gaurav Patil"));
		System.out.println(al);
		
		// reversed() → Returns reversed view (Java 21+)
		System.out.println("reversed(): " + al.reversed());
		
		// addAll() → Adds all elements of another ArrayList
		al.addAll(al2);
		System.out.println("addAll(): " + al);
		
		// removeAll() → Removes all common elements
		al.removeAll(al2);
		System.out.println("removeAll(): " + al);
		
		// add(index, element) → Inserts element at index
		al.add(1, "Rahul");
		System.out.println("add(index): " + al);
		
		// remove(object) → Removes given object
		al.remove("Rahul");
		System.out.println("remove(object): " + al);
		
		// equals() → Compares two ArrayLists
		System.out.println("equals(): " + al.equals(al2));
		
		// toArray() → Converts ArrayList to Array
		Object[] arr = al.toArray();
		System.out.println("toArray length: " + arr.length);
		
		// retainAll() → Keeps only common elements
		al.retainAll(al2);
		System.out.println("retainAll(): " + al);
		
		// clear() → Removes all elements
		al.clear();
		System.out.println("clear(): " + al);
		
		// isEmpty() → Checks if ArrayList is empty
		System.out.println("isEmpty(): " + al.isEmpty());
	}
}