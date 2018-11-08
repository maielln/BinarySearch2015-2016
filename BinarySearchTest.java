import java.util.Arrays;
import javax.swing.JOptionPane;

/**
   This program tests the binary search algorithm.
*/
public class BinarySearchTest
{
   public static void main(String[] args)
   {
      // construct random array

      int[] a = ArrayUtil.randomIntArray(20, 100);
      Arrays.sort(a);
      ArrayUtil.print(a);
      BinarySearcher searcher = new BinarySearcher(a);

      boolean done = false;
      while (!done)
      {
         String input = JOptionPane.showInputDialog(
            "Enter number to search for, Cancel to quit:");
         if (input == null)
            done = true;
         else
         {
            int n = Integer.parseInt(input);
            int pos = searcher.search(n);
            if(pos < 0)
            	System.out.println(n + " should be placed at position " + (-pos - 1));
            else
            	System.out.println("Found in position " + pos);
         }
      }
      System.exit(0);
   }
}
