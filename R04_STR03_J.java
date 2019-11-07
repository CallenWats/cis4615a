import java.math.BigInteger;

public class R04_STR03_J {

    public static void main(String[] args){
    
        /******************************************************************************
     *  Compilation:  javac R04_STR03_J.java
     *  Execution:    java R04_STR03_J
     * 
     *  Converts BigInteger x to a string->byte[]->string->BigInteger.
     *  Displays the before and after to prove that both iterations of x are the same
     * 
     ******************************************************************************/
    public static void main(String[] args){
    
        BigInteger x = new BigInteger("530500452766");
        
        System.out.println(x.toString());
        
        /*     
        * Rule 04. Characters and Strings (STR)    
        * Corrected code per:     
        * https://wiki.sei.cmu.edu/confluence/display/java/STR03-J.+Do+not+encode+noncharacter+data+as+a+string    
        *     
        * Rule 04-STR03-J
        */
        
        String s = x.toString();  // Valid character data
        byte[] byteArray = s.getBytes();
        String ns = new String(byteArray); 
        x = new BigInteger(ns);
        
        System.out.println(x.toString());
        
    }
 
}
