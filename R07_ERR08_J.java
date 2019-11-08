public class R07_ERR08_J {

    /******************************************************************************
     *
     * Compilation:  javac R07_ERR08_J.java
     *  Execution:    java R07_ERR08_J
     * 
     *  Calls the isName function with a string formatted F Lastname as the parameter.
     *  Tested with a valid name and a non-valid name
     * 
     ******************************************************************************/
    
    /*     
    * Rule 07. Exceptional Behavior (ERR)  
    * Corrected code per:     
    * https://wiki.sei.cmu.edu/confluence/display/java/ERR08-J.+Do+not+catch+NullPointerException+or+any+of+its+ancestors    
    *     
    * Rule 07-ERR08-J
    */
    
    public static boolean isName(String s) {
        if (s == null) {
            return false;
        }
        String names[] = s.split(" ");
        
        if (names.length != 2) {
            return false;
        }
        return (names[0].charAt(0) - 'A' >= 0 && names[1].charAt(1) - 'A' >= 0);
}
 
  public static void main(String[] args) {
    
      String name = "C Watson";
      String name2 = "";
      
      boolean flag;
      flag = isName(name);
      
      if(flag){
          System.out.println("Yes");
      }
      else
          System.out.print("No");
      
      flag = isName(name2);
      
      if(flag){
          System.out.println("Yes");
      }
      else
          System.out.print("No");
      
    }
  }
