public class R05_OBJ03_J {
  
  /******************************************************************************
     *
     * Compilation:  javac R05_OBJ03_J.java
     *  Execution:    java R05_OBJ03_J
     * 
     *  Calls addToList() and adds a given string to the list. Loops through a for
     *  loop 10 times adding numbers and a single instance with a word.
     * 
     ******************************************************************************/
    
  
  /*     
    * Rule 05. Object Orientation (OBJ)    
    * Corrected code per:     
    * https://wiki.sei.cmu.edu/confluence/display/java/OBJ03-J.+Prevent+heap+pollution    
    *     
    * Rule 05-OBJ03-J
    */
    private static void addToList(List<String> list, String str) {
    list.add(str);     // No warning generated
  }
 
  public static void main(String[] args) {
    List<String> list = new ArrayList<String> ();
    for(int x = 0; x < 10; x++){
        addToList(list, Integer.toString(x));
    }
    for(int x = 0; x < 10; x++){
    System.out.println(list.get(x));
  
    }
  }
    
}
