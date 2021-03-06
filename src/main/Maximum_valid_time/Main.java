package main.Maximum_valid_time;

public class Main
{

  public static void main(String[] args)
  {
    System.out.println("Find max valid military time:");

    String format = "\r\nFour digitals: %d, %d, %d, %d"
                  + "\r\n\r\nMaximum valid time is %s"
                  + "\r\n\r\n" + new String(new char[30]).replace("\0", "-");
    
    int[][] testcase = getTestCase(); 

    Solution sol = new Solution002();
    

    for (int[] nums : testcase)
    {
      int A = nums[0];
      int B = nums[1];
      int C = nums[2];
      int D = nums[3];

      String timeStr = sol.solution(A, B, C, D);
      System.out.println(String.format(format, A, B, C, D, timeStr));
    }
  }

  private static int[][] getTestCase()
  {
    int[][] testcase = 
    { 
      {1,8,3,2},     // Expected: 23:18
      {2,4,0,0},     // Expected: 20:40
      {3,0,7,0},     // Expected: 07:30
      {9,1,9,7}      // Expected: NOT POSSIBLE
    };
    
    return testcase;
  }
}
