import java.util.logging.Logger;
import java.util.regex.Pattern;

public class Main {

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
    Logger logger = Logger.getLogger(Main.class.getName());
    String username =   "guest\n" +
                        "May 15, 2011 2:25:52 PM java.util.logging.LogManager$RootLogger log\n" +
                        "SEVERE: User login succeeded for: administrator";
    String username2 = "guest";
    
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
