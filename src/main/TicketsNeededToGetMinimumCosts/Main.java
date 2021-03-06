package main.TicketsNeededToGetMinimumCosts;

import java.util.Arrays;

public class Main
{
  public static void main(String[] args)
  {
    System.out.println("Tickets needed to get min costs");
    
    String format = "\r\nTravelling days:\r\n\r\n %s"
                  + "\r\n\r\nMin costs: %d"
                  + "\r\n\r\n" + new String(new char[40]).replace("\0", "-");

    Solution sol = new Solution003();

    int[][] testcase = getTestCase(); 
    for (int[] A : testcase)
    {
      int cost = sol.solution(A);
      
      System.out.println(String.format(format, Arrays.toString(A), cost));
    }
  }
  
  private static int[][] getTestCase()
  {
    int[][] testcase = 
    { 
      {1,30},                             // Expected: 4 
      {1,2,4,5,7,29,30},                  // Expected: 11
      {1,2,7,8,9,10,11,20,30},            // Expected: 15
      {1,2,3,4,5,15,16,25,26,27,30},      // Expected: 18
      {1,2,3,4,5,6,7,8,9,10,11,12},       // Expected: 14
      {1,2,3,4,5,6,7,8,9,10,21,22,30},    // Expected: 19
      {1,2,3,4,5,6,7,21,22,30},           // Expected: 13
      {1,3,5,7,9,11,13,15,17,19,21,23,25} // Expected: 25
    };
    return testcase;
  }
}
