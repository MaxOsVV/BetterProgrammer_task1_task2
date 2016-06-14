package task2;

public class BetterProgrammerTask {

    public static String capitalizeFirstLetters(String s) {
        /*
          Please implement this method to
          capitalize all first letters of the words in the given String.
          All other symbols shall remain intact. If a word starts not with a letter, it shall remain intact too.
          Assume that the parameter String can only contain spaces and alphanumeric characters.

          NOTE: please keep in mind that the words can be divided by single or multiple spaces.
          The spaced also can be found at the beginning or the end of the parameter string,
          and you need to preserve them.
         */
    	
    	char[] t;
    	t = s.toCharArray();
    	String s2="";
    	String s3= "";
    	boolean upper = false;
    	for(int i =0; i < t.length; i++){
    		if ( Character.isWhitespace( t[i] ) ){ upper = false; s2 = s2 + t[i]; }else{
    			if(upper == false){
    				s3 = s3 + t[i];
    				s2 = s2 + s3.toUpperCase();
    				s3 ="";
    				upper = true;
    				}else{
    					s2 = s2 + t[i];	
    				}
    		}
    	}
    	return s2;
    }
    
    // Small Test
	public static void main(String[] args) {
		System.out.println( BetterProgrammerTask.capitalizeFirstLetters("  a1sd g  fg hh ") );
	}
	
}
