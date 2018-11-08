import java.util.*;

/**
   This program tests the binary search algorithm with arraylists.
*/
public class BinaryArrayList
{
   public static void main(String[] args)
   {
      ArrayList<Integer> a =  new ArrayList<Integer>();
      BinarySearcher searcher = new BinarySearcher(a);
      ArrayUtil utility = new ArrayUtil();
      Scanner in = new Scanner(System.in);

	  for(int i = 0; i < 10; i++)
	  {
		  System.out.print("Please enter a number for the arraylist: ");
		  int num = in.nextInt();
		  int pos = searcher.search(num);
		  if (pos < 0)
		  	a.add(-pos - 1, num);
		  else if (pos < a.size())
		  {
		  	System.out.print("Number found. ");
		  	i--;
	  	  }
		  else
		  	a.add(num);
	  }
	  utility.print(a);
	}
}
