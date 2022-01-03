

public class Uniqueue<Item extends Comparable<Item>>{
	
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
		 
		//return set.toString();   In order to print the the elements in ascending order, since an object of the SET.java class represents an ordered set of comparable items.
	}
	
	public Item dequeue(Item item) {   //removes and returns the item least recently added in the queue
		return queue.dequeue();
	}
  
	public void addInSet(Item item) {  //adds items to the set
		
		set.add(item);
			
	}
	
	public boolean isIncluded(Item item) {   //returns true if the if the set contains the item. 
			return set.contains(item);				
	}

}
