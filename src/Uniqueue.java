/******************************************************************************
* Compilation: javac Uniqueue.java
* Dependencies: SET.java Queue.java
* Aikaterini Kentroti
******************************************************************************/

import java.util.Iterator;

public class Uniqueue<Item extends Comparable<Item>>implements Iterable<Item>{
	
	private Queue<Item>  queue; //instance fields
	private SET<Item> set;
	
	
	public Uniqueue() {      //constructor
		queue=new Queue<Item>();
		set=new SET<Item>();		
	}

	public boolean uniQueueEmpty() {  //returns true if the queue is empty
		return queue.isEmpty();
	}
	
	public int uniQueueSize() {     //returns the size of the queue
		return queue.size();
	}
	
	
	public void enqueue(Item item) {    //item is inserted in the set and finally in the queue, only if the set does not already contain the item 
		if (!isIncluded(item)) {          
			set.add(item);
			queue.enqueue(item);
		}		
	}
	
	public String toString() {
		 return queue.toString();
		 
		 //Answer to the question of Exercise 2:
		 
		//return set.toString();   in order to print the items {item1, item2,...} in ascending order, since an object of the SET.java class represents an ordered set of comparable items.
		 
		//According to exercise 2, the data type Uniqueue is a queue, except that elements identical to existing ones should not be inserted. Therefore, it seems more correct to print the elements
		//with the order they were inserted(return queue.toString();) and not in ascending order.
		 
	}                             
	
	public Item dequeue(Item item) {   //removes and returns the item least recently added in the queue
		return queue.dequeue();
	}
  
	
	public boolean isIncluded(Item item) {   //returns true if the if the set contains the item. 
			return set.contains(item);				
	}

	@Override
	public Iterator<Item> iterator() { //Iterable implemented, in order to use a for-each-loop in the client class
		
		return queue.iterator();
	}

}
