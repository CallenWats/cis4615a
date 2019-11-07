import java.io.File;

public class R02_XP00_J {
    
   /******************************************************************************
     *  Compilation:  javac R02_XP00_J.java
     *  Execution:    java R02_XP00_J
     * 
     *  Calls deleteFile() and checks to see if the file actually was deleted
     *  
     * 
     ******************************************************************************/
    public static void main(String[] args) {
    
        deleteFile();
    }
    
    /*     
    * Rule 02. Expressions (EXP)    
    * Corrected code per:     
    * https://wiki.sei.cmu.edu/confluence/display/java/EXP00-J.+Do+not+ignore+values+returned+by+methods   
    *     
    * Rule 02-XP00-J     
    */

    public static void deleteFile(){
 
        File someFile = new File("someFileName.txt");
        // Do something with someFile
            if (!someFile.delete()) {
                System.out.println("File failed to delete");
        // Handle failure to delete the file
            }
 
    }
    
}
