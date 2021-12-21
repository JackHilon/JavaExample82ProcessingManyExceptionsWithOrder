
package javaexample82processingmanyexceptionswithorder;

import java.util.Arrays;

public class JavaExample82ProcessingManyExceptionsWithOrder {

    // StringIndexOutOfBoundsException and ArrayIndexOutOfBoundsException are 
    // sub-types of IndexOutOfBoundsException
    // **********************************************************************
    // IndexOutOfBoundsException and IllegalArgumentException are 
    // sub-types of RuntimeException
    
    
    public static void main(String[] args) {
        String str = "ABCDE";
        char[] myArray = str.toCharArray();
        
        // create random double
        double d = Math.random();
        
        try{
            
            if(d<0.33)
                System.out.println(str.charAt(5)); // <- throws StringIndexOutOfBoundsException
            
            else 
                if(d<0.66)
                    /*
                    The range to be sorted extends from index fromIndex, inclusive, 
                    to index toIndex, exclusive. 
                    (If fromIndex==toIndex, the range to be sorted is empty.)
                    */
                    Arrays.sort(myArray, 3, 6); // <- throws ArrayIndexOutOfBoundsException
            
            else
                Arrays.sort(myArray, 4, 1);  // <- throws IllegalArgumentException        
        } // end-try
        
        /*
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        */
        
        // IndexOutOfBoundsException must come before RuntimeException
        // because IndexOutOfBoundsException is sub-type of RuntimeException
        catch(IndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        
        catch(RuntimeException e)
        {
           e.printStackTrace();
        }
    }
    
}
