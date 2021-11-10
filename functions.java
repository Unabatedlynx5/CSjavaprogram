

class functions {
    public static void clearConsole() {
      System.out.print("\033[H\033[2J");  
      System.out.flush();  
      System.out.print("\n\n\n");
  }  
    public static void end(){
      System.out.print("\n\n\n");
    }
  }