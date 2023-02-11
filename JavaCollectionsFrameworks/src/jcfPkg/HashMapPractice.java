package jcfPkg;

import java.util.HashMap;

public class HashMapPractice {

	public static void main(String[] args) {
		
		// create a hashmap
		HashMap<String, Integer> languages = new HashMap<>();
		
		System.out.println("Initial HashMap: " + languages);
		
		// add elements to hashmap
		languages.put("Java", 8);
		languages.put("JavaScript", 1);
		languages.put("Python", 2);
		System.out.println("HashMap: " + languages);
		
		// get() method to get value
		Integer value = languages.get("Java");
		System.out.println("HashMap: " + value);
		
		// return set view of keys
		System.out.println("Keys: " + languages.keySet());
		
		// return set view of values
		System.out.println("Values: " + languages.values());
		
		// return set view of key/value pairs
		System.out.println("EntrySet: " + languages.entrySet());
		
	    // change element with key 2
		
		languages.replace("Python", 3);
		System.out.println("HashMap using replace(): " + languages);
		
		
		//// remove element associated with key JavaScript
		Integer valueJs = languages.remove("JavaScript");
		System.out.println("Updated HashMap: " + languages );
		System.out.println(languages.isEmpty());
		
		
		

	}

}
