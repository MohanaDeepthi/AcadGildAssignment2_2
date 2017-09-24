package Assignment2_2;

/*
 * a program to print the following pattern:

	a
   a b a
 a b c b a
   a b a
     a
 */
//class name
public class Assignment2_2 {
	
	public static void main(String args[]){
		//logic to print pattern
		 int c = 0;
		 //looping to print 5 rows
	      while ( c != 5){
	    	  
	    	  if(c==0||c==4){
	    		  //loop to print spaces
	    		  for(int i=0;i<4;i++){
	    			  System.out.print(" ");
	    		  }
	    		  //print a
	    		  System.out.println("a");
	    	  }//close of else if
	    	  else if(c==1||c==3){
	    		  //for loop to print spaces
	    		  for(int i=0;i<2;i++){
	    			  System.out.print(" ");  
	    		  }//close of for loop
	    		  System.out.println("a"+" "+"b"+" "+"a");
	    		  
	    	  }//close of else if
	    	  else if(c==2){
	    		  System.out.println("a"+" "+"b"+" "+"c"+" "+"b"+" "+"a");
	    		  
	    	  }//close of else if
	    	  c++;//increment c value
	      }//end of while loop
	}//end of main
//end of the code
}
