import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class R03_NUM03_J {

    public static void main(String[] args) throws IOException {
    
        
        try {
            
            DataInputStream stream = new DataInputStream(new FileInputStream("C:\\Users\\Chris\\Documents\\Security in Computing\\test.txt"));
            int DIS_Int = getInteger(stream);
            System.out.println(Integer.toString(DIS_Int));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public static int getInteger(DataInputStream is) throws IOException {
        return is.readInt(); 
    }
 
}
