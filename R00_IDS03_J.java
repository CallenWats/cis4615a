import java.util.logging.Logger;
import java.util.regex.Pattern;

public class R00_IDS03_J{

    /******************************************************************************
     *  Compilation:  javac R00_IDS03_J.java
     *  Execution:    java R00_IDS03_J
     * 
     *  Calls sanitizeUser() method on the username String with valid and invalid
     *  usernames
     * 
     ******************************************************************************/
    public static void main(String[] args) {
    
    boolean loginSuccessful = false;
    Logger logger = Logger.getLogger(R00_IDS03_J.class.getName());
    String username =   "guest\n" +
                        "May 15, 2011 2:25:52 PM java.util.logging.LogManager$RootLogger log\n" +
                        "SEVERE: User login succeeded for: administrator";
    String username2 = "guest";
        
        
    /*     
    * Rule 00. Input Validation and Data Sanitization (IDS)     
    * Corrected code per:     
    * https://wiki.sei.cmu.edu/confluence/display/java/IDS03-J.+Do+not+log+unsanitized+user+input     
    *     
    * Rule 00-IDS03-J
    */
    
    // Invalid username input
    if (loginSuccessful) {
        logger.severe("User login succeeded for: " + sanitizeUser(username));
    } else {
        logger.severe("User login failed for: " + sanitizeUser(username));
    }
    
    // "Valid" username input
    if (loginSuccessful) {
        logger.severe("User login succeeded for: " + sanitizeUser(username2));
    } else {
        logger.severe("User login failed for: " + sanitizeUser(username2));
    }
        
    }
    
    public static String sanitizeUser(String username) {
        return Pattern.matches("[A-Za-z0-9_]+", username)
            ? username : "unauthorized user";
    }
    
}
