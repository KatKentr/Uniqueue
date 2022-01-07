/******************************************************************************
* Compilation: javac P4e2.java
* Execution: java p4e2<mobyDick.txt>out-p4e2_mobyDick.txt, java p4e2<tinyTale.txt >out-p4e2_tinyTale.txt
* Dependencies: StdIn.java StdOut.java Uniqueue.java
* Data files: mobyDick.txt, tinyTale.txt
* Aikaterini Kentroti
******************************************************************************/
public class p4e2{
	
	public static void main(String[] args) {
		 
		Uniqueue<String> uniqueue=new Uniqueue<String>();
		
		  String[] words = StdIn.readAllStrings();
		  
		  StdOut.println("Size of input file="+words.length);
		  
		  for (int i=0;i<words.length; i++) {
			  
			  uniqueue.enqueue(words[i]);		//adds the strings to uniqueue	  
		  }
		
		  StdOut.println("Uniqueue size="+ uniqueue.uniQueueSize()); //prints the size of the queue
		
		 
		  for (String s : uniqueue){   //printing the items in uniqueue
			   StdOut.print(s + "\n"); 
	    }       	 
			
	}
}
