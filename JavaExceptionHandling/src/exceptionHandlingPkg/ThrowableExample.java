package exceptionHandlingPkg;

public class ThrowableExample {

	    public static void main(String[] args)
	        throws Exception
	    {

	        try {

	            testException();
	        }

	        catch (Throwable e) {

	            // Print using tostring()
	            System.out.println("Exception: "
	                            + e.toString());
	        }
	    }

	    // Method which throws Exception
	    public static void testException()
	        throws Exception
	    {
	    	throw new Exception("My Exception");

	        // WHAT YOU NEED to do:  code this method
	    	}

}
