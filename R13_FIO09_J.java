public class R13_FIO09_J {

   /******************************************************************************
     *
     * Compilation:  javac R13_FIO09_J.java
     *  Execution:    java R13_FIO09_J
     * 
     *  Checks the range of two values, one that won't throw an exception and one 
     *  that will. The exception is caught and the values are written out.
     * 
     ******************************************************************************/
    public static void main(String[] args)
                          throws NumberFormatException, IOException {
    // Perform range checking 
    int value = Integer.valueOf(256);
    int value2 = Integer.valueOf(1);
        try{
            if (value < 0 || value > 255) {
                throw new ArithmeticException("Value is out of range");
            }
            if (value2 < 0 || value2 > 255) {
                throw new ArithmeticException("Value is out of range");
            }
        }
        catch(ArithmeticException e){
            System.out.println("Exception Caught\n");
        }
   
    System.out.write(value);
    System.out.write(value2);
    System.out.flush();
  
    }
 
}
