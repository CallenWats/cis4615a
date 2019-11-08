public class R07_ERR08_J {
    
    public static boolean isName(String s) {
      try {
        String names[] = s.split(" ");
 
        if (names.length != 2) {
          return false;
        }
        return (Character.isUpperCase(names[0].charAt(0)));
      } catch (NullPointerException e) {
        return false;
      }
    }
 
  public static void main(String[] args) {
    
      String name = "Christopher";
      String name2;
      
      boolean flag;
      flag = isName(name);
      
      if(flag){
          System.out.println("Yes");
      }
      else
          System.out.print("No");
      
  
    }
  }
