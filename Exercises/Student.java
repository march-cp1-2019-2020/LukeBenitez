package forClass;						//Luke Benitez

public class Student extends Person {

	public void setClassification(int grade)
	{
	     if(grade == 1) {
	     System.out.println("Freshman");
	     } else {
	    	 if(grade == 2) {
	    		 System.out.println("Sophmore");
	     } else {
	         if(grade == 3) {
	        	 System.out.println("Junior");
	     } else {
	    	 if(grade == 4) {
	    		 System.out.println("Senior");
	     } else {
	    	 if(grade > 4) {
	    		 System.out.println("Please try again");
	    	 }
	    	 } 
	    	 
	     }
	     }
	     }
}
}