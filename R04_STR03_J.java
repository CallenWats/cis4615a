import java.math.BigInteger;

public class R04_STR03_J {

    public static void main(String[] args){
    
        BigInteger x = new BigInteger("530500452766");
        
        System.out.println(x.toString());
        
        byte[] byteArray = x.toByteArray();
        String s = new String(byteArray);
        byteArray = s.getBytes();
        x = new BigInteger(byteArray);
        
        System.out.println(x.toString());
        
    }
 
}
