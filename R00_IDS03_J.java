import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
    
    boolean loginSuccessful = false;
    Logger logger = Logger.getLogger(Main.class.getName());
    String username =   "guest\n" +
                        "May 15, 2011 2:25:52 PM java.util.logging.LogManager$RootLogger log\n" +
                        "SEVERE: User login succeeded for: administrator";
    
    if (loginSuccessful) {
        logger.severe("User login succeeded for: " + username);
    } else {
        logger.severe("User login failed for: " + username);
    }
        
    }
    
}
