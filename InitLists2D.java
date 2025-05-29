/*
 * Activity 3.8.1
 */
public class InitLists2D
{
  public static void main(String[] args)
  {
    String[][] board = { {"close", "quarter"},
                        {"moon", "rock"},
                        {"band", "stand"},
                        {"out", "shine"}  }; 
                        
    System.out.println(java.util.Arrays.toString(board[0]));
    System.out.println(java.util.Arrays.toString(board[1]));
    System.out.println(java.util.Arrays.toString(board[2]));
    System.out.println(java.util.Arrays.toString(board[3]));

    System.out.println(java.util.Arrays.toString(board));
}
}
