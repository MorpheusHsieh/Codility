package main.Decimal_ZIP_problem;

import main.util.myString;

public class Main
{

  public static void main(String[] args)
  {
    System.out.println("The decimal ZIP problem");
    
    String format = "\r\nA: %d" 
                  + "\r\nB: %d" 
                  + "\r\n\r\nThe decimal ZIP is %d"
                  + "\r\n\r\n" + myString.repeatString(30, "-");
    
    Solution sol = new Solution001();
    
    int[][] testcase = getTestCase(); 
    for (int[] nums : testcase)
    {
      int A = nums[0];
      int B = nums[1];
      int C = sol.solution(A, B);

      System.out.println(String.format(format, A, B, C));
    }
  }
  
  private static int[][] getTestCase()
  {
    int[][] testcase = 
    { 
        {12,56},         // Expected: 1526
        {56,12},         // Expected: 5162
        {12345,678},     // Expected: 16273845
        {123,67890},     // Expected: 16273890
        {1234,0},        // Expected: 10234
        {12345,678},     // Expected: 16273845
        {12345,67890},   // Expected: -1
        {1234567890,1},  // Expected: -1
        {123456,123456}  // Expected: -1
    };
    return testcase;
  }
}
