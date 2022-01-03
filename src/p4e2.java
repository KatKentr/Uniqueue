
public class p4e2{
	
	public static void main(String[] args) {
		 
		Uniqueue<String> uniqueue=new Uniqueue<String>();
		
		  String[] words = StdIn.readAllStrings();
		  
		  StdOut.println("Size of input file="+words.length);
		  
		  for (int i=0;i<words.length; i++) {
			  
			  uniqueue.enqueue(words[i]);		//adds the strings to uniqueue	  
		  }
		
		  StdOut.println("Uniqueue size="+ uniqueue.uniQueueSize()); //prints the size of the queue
		
		  
		  StdOut.print("The elements in Uniqueue: " +uniqueue.toString()+"\n"); //printing the queue items by using toString()
		 
			 
			
	}
}
