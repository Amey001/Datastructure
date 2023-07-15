package hashing;

import java.util.LinkedList;
import java.util.Scanner;


class Hashtable {
	static class Pair {
		private int key;
		private String value;

		public Pair() {
			key = 0;
			value = "";
		}

		public Pair(int key, String value) {
			this.key = key;
			this.value = value;
		}

		@Override
		public String toString() {
			return "Pair [key=" + key + ", value=" + value + "]";
		}

	}

	private static final int SLOTS = 10;
	private LinkedList<Pair> table[];

	public Hashtable() {
		table = new LinkedList[SLOTS];
		for (int i = 0; i < SLOTS; i++) {
			table[i] = new LinkedList<>();
		}
	}

	// Hash function
	public int hash(int key) {
		// will return the slot
		return key % SLOTS;
	}

	// hashtable we cannot have dublicate keys are not allowed
	// if duplicate present then replace..add only if no duplication
	public void put(int key, String value) {
		// find the slot for given key using hash function
		int slot = hash(key);
		// access the bucket(Linked list) in that slot
		LinkedList<Pair> bucket = table[slot];
		// find the element (key-value) in the bucket - linear search
		for (Pair pair : bucket) {
			
			if (key == pair.key) {
				// if key is present then replace the value of the key with new value
				pair.value=value;
			}
		}
		// if key is not present then return add new {key-value} pair in bucket
		Pair pair=new Pair(key, value);
		bucket.add(pair);
		
	}

	public String get(int key) {
		// find the slot for given key using hash function
		int slot = hash(key);
		// access the bucket(Linked list) in that slot
		LinkedList<Pair> bucket = table[slot];
		// find the element (key-value) in the bucket - linear search
		for (Pair pair : bucket) {
			if (key == pair.key) {
				// if key is present then return value
				return pair.value;
			}
		}
		// if key is not present then return null
		return null;
	}
}

public class HashTableMain {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Hashtable hs=new Hashtable();
		hs.put(1, "Amit");
		hs.put(4, "Siddesh");
		hs.put(8, "Abhi");
		hs.put(24, "harsha");
		hs.put(34, "pranavS");
		hs.put(25, "pranavD");
		
		System.out.println(" enter the roll no to search :: ");
		int rollno=sc.nextInt();
		
		String name=hs.get(rollno);
		System.out.println(" name of the roll no "+rollno+" is :: "+name);
		
		sc.close();
	}
}
