package jprofiler;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class CollectionMethods {
	Random rand = new Random();
	
	//array list method
	public ArrayList<Integer> popArrayList() {
		ArrayList<Integer> arrylist = new ArrayList<Integer>();
		System.out.println("populating arraylist...");
		
		//new method for populating list
		populate(arrylist);
		
		//old manual way of populating arraylist with random ints
		//for(int i = 0; i < 2000000; i++) {
			
			//setting up way to get a random int
			//int randInt = rand.nextInt(11);
			
			//arrylist.add(randInt);
		//}
		System.out.println("Done. New arraylist size: " + arrylist.size());
		
		System.out.println("Now clearing arraylist...");
		
		//removing all ints from arrylist
		arrylist.clear();
		System.out.println("Done. Current arraylist size: " + arrylist.size());
		return arrylist;
	}
	
	//linked list method
	public void popLinkedList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println("populating linkedlist...");
		
		//new method to populate list
		populate(list);
		
		
		//populating with random ints
		//for(int i = 0; i < 2000000; i++ ) {
		//	int randomInt = rand.nextInt(11);
		//	list.add(randomInt);
		//}
		System.out.println("Done. New linkedlist size: " + list.size());
		
		System.out.println("Now clearning linkedlist...");
		
		//removing all ints from arrylist
		list.clear();
		System.out.println("Done. Current linkedlist size: " + list.size());
	}
	
	//hash table method
	public void popHashTable() {
		HashMap<Integer, Integer> table = new HashMap<Integer, Integer>();
		System.out.println("populating hashmap...");
		
		//populating hashmap with rando ints
		for(int i = 0; i < 2000000; i++) {
			int randoNum = rand.nextInt(2099999999);
			int randoNum2 = rand.nextInt(2000000000);
			//System.out.println(randoNum);
			if(table.containsKey(randoNum)) {
				i++;
				if(table.get(randoNum) == randoNum2) {
					i++;
				}
			}
			table.put(randoNum, randoNum2);
		}
		System.out.println("Done. New hashmap size: " + table.size());
		
		System.out.println("Now clearing out hashmap...");
		
		//removing all key/value pairs from hashmap
		table.clear();
		System.out.println("Done. Current hashmap size: " + table.size());
	}
	
	public static void populate(List list) {
		for(int i = 0; i < 2000000; i++) {	
			//setting up way to get a random int
			Random rand = new Random();
			int randInt = rand.nextInt(11);
			list.add(randInt);
		}
	}
}
