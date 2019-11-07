import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class R03_NUM03_J {

    public static void main(String[] args) throws IOException {
    
    /******************************************************************************
     *  Compilation:  javac R03_NUM03_J.java
     *  Execution:    java R03_NUM03_J
     * 
     *  Calls getInteger on a datainputstream object that was created from a
     *  hardcoded file source and prints the result.
     *  
     * 
     ******************************************************************************/
    public static void main(String[] args) throws IOException {
    
        
        try {
            
            // Note: I used a hardcoded file source for the input stream.
            DataInputStream stream = new DataInputStream(new FileInputStream("C:\\Users\\Chris\\Documents\\Security in Computing\\test.txt"));
            long DIS_Int = getInteger(stream);
            System.out.println(Long.toString(DIS_Int));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    /*     
    * Rule 03. Numeric Types and Operations (NUM)    
    * Corrected code per:     
    * https://wiki.sei.cmu.edu/confluence/display/java/NUM03-J.+Use+integer+types+that+can+fully+represent+the+possible+range+of++unsigned+data    
    *     
    * Rule 03-NUM03-J
    */
        
    }
    
    public static long getInteger(DataInputStream is) throws IOException {
        return is.readInt() & 0xFFFFFFFFL; // Mask with 32 one-bits
    }
 
}
