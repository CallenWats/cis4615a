public class R49_MSC01_J {

    public static void main(String[] args){
        
       /******************************************************************************
     *
     * Compilation:  javac R49_MSC01_J.java
     *  Execution:    java R49_MSC01_J
     * 
     *  Runs a while loop that will continuously run until x reaches 5, but
     *  it will be put to sleep for 1000 milliseconds after each loop to simulate
     *  allowing other threads to run.
     * 
     ******************************************************************************/
    
    public static final int DURATION=1000; // In milliseconds
    
    public static void main(String[] args) throws InterruptedException{
        
        /*     
    * Rule 49. Miscellaneous (MSC)    
    * Corrected code per:     
    * https://wiki.sei.cmu.edu/confluence/display/java/MSC01-J.+Do+not+use+an+empty+infinite+loop    
    *     
    * Rule 49-MSC01-J
    */
        int x = 0;
        
        while(true){
        
        System.out.println(Integer.toString(x));
        x = x + 1;
        
        // Useful Operations
        if(x == 5)
            break;
        Thread.sleep(DURATION);
        }
    }
    
}
