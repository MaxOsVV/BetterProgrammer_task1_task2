package task1;

public class BetterProgrammerTask {

	public static int countWords(String s) {
		
	    /*
	      Please implement this method to
	      return the word count in a given String.
	      Assume that the parameter String can only contain spaces and alphanumeric characters.
	     */
		
		char[] t;
    	t = s.toCharArray();
    	
    	// Calculate the number of words in String s.
    	int count = 0;
    	boolean catch_word = false;
    	for( int i = 0; i < t.length; i++ ){
    		if ( Character.isWhitespace( t[i] ) ){ 
    			
    			if( catch_word == true ){
    				catch_word = false;
    			}
    				
    		}else{	
    			if( catch_word == false ){
    				catch_word = true;
    				count++;		
    			}		
    		}
    	}
    	return count;
	}
	
	// Small test.
	public static void main(String[] args) {
		System.out.println( BetterProgrammerTask.countWords( " 23 ref34 9j9   9 " ) );
	}
}
