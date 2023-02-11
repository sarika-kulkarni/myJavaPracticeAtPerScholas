package exceptionHandlingPkg;

//A Java program to demonstrate that invoking a method
//on null causes NullPointerException

// WHAT YOU NEED to do:
// Please re-write code  to avoid NullPointerException
//
import java.io.*;

class NullPtrExcept
{
    public static void main (String[] args)
    {
        // Initializing String variable with null value
        String ptr = null;

        try
        {

            if (ptr != null && ptr.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught" + e);
        }
    }
}