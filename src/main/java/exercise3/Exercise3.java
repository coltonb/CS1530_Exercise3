package exercise3;

public class Exercise3 {
  public static void main(String args[]) {
    // Check for appropriate number of arguments
    if (args == null || args.length != 1) {
      System.out.println("Invalid number of arguments.\nExercise3 <integer>");
      System.exit(1);
    }

    int val = 1; 

    // Check for inappropriate argument
    try {
      val = Integer.parseInt(args[0]);
    } catch (Exception e) {
      System.out.println("Invalid argument.\nExercise3 <integer>");
      System.exit(1);
    }

    int tri = tri(val);
    int lazy = lazy(val);

    System.out.println("Tri(" + val + ") = " + tri);
    System.out.println("Lazy(" + val + ") = " + lazy);
  }

  public static int tri(int val) {
    int result = 0;
    for (int i = 1; i <= val; i++) {
      result += i;
    }
    return result;
  }

  public static int lazy(int val) {
    int result = ((val * val) + val + 2) / 2;
    return result;
  }
}