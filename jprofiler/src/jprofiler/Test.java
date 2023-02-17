package jprofiler;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		//create collections object
		CollectionMethods x =  new CollectionMethods();
		//calling ArrayList method
		ArrayList<Integer> arryList = x.popArrayList();
		//calling LinkedList method
		x.popLinkedList();
		//calling hash table method
		x.popHashTable();
		
	}

}
