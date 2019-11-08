public class R01_DCL00_J {

    /******************************************************************************
     *
     * Compilation:  javac R01_DCL00_J.java
     *  Execution:    java R01_DCL00_J
     * 
     *  Gets the balance from the function main. However, balance will load correctly
     *  while balance2, which is created after cycle is created, always shows -10.
     * 
     ******************************************************************************/
    
  /*     
    * Rule 01. Declarations and Initialization (DCL)   
    * Corrected code per:     
    * https://wiki.sei.cmu.edu/confluence/display/java/DCL00-J.+Prevent+class+initialization+cycles    
    *     
    * Rule 01-DCL00-J
    */
    
  private final int balance;
  private final int balance2;
  
  private static final int deposit = (int) (Math.random() * 100); // Random deposit
  
  private static final R01_DCL00_J c = new R01_DCL00_J();  // Inserted after initialization of required fields
  
  private static final int deposit2 = (int) (Math.random() * 100);;
  
  public R01_DCL00_J() {
    balance = deposit - 10; // Subtract processing fee
    balance2 = deposit2 - 10;
  }
 
  public static void main(String[] args) {
    System.out.println("The account balance is: " + c.balance);
    System.out.println("The account balance is: " + c.balance2);
  }
  }
