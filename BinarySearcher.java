import java.util.ArrayList;
/**
   A class for executing binary searches through an array.
*/
public class BinarySearcher
{
   /**
      Constructs a BinarySearcher.
      @param anArray a sorted array of integers
   */
   public BinarySearcher(ArrayList<Integer> anArray)
   {
      a = anArray;
   }

   /**
      Finds a value in a sorted array, using the binary
      search algorithm.
      @param v the value to search
      @return the index at which the value occurs, or -1
      if it does not occur in the array
   */
   public int search(int v)
   {
      int low = 0;
      int high = a.size() - 1;
      while (low <= high)
      {
         int mid = (low + high) / 2;

         if (a.get(mid) == v)
            return mid;
         else if (a.get(mid) < v )
            low = mid + 1;
         else
            high = mid - 1;
      }
      return (-low - 1);
	}
   private ArrayList<Integer> a;
}

