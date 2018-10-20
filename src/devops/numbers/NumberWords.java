package devops.numbers;

public class NumberWords {

	public String toWords( int number ) {
		String result = "" ;
		
		if (number < 0) {
			result = "Number out of range";
		}
		else {
		    result = String.valueOf( number );
		}
		return result.trim() ;	
	}

}
