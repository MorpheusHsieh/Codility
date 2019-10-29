package main.MonkeyJumpCrossRiver;

import java.util.Arrays;

//import java.util.HashSet;
//import java.util.Set;

public class Solution 
{
  public int solution(int[] A, int D) 
  {
    int N = A.length;
//    System.out.println("\r\n"+D+", "+Arrays.toString(A));
    
    boolean stones[] = new boolean[N+2];
    Arrays.fill(stones, false);
    stones[0] = true;
    stones[N+1] = true;
    
    for (int i=0; i<=N; i++) 
    {
      for (int j=0; j<N; j++) {
        if (A[j] == i) { stones[j+1] = true; }
      }
//      System.out.println(i+": "+Arrays.toString(stones));

      boolean isCrossRiver = checkCrossRiver(stones, D);
//      System.out.println(isCrossRiver);
      
      if (isCrossRiver) return i;
    }
    return -1;
  }
  
  private boolean checkCrossRiver(boolean[] stones, int D)
  {
    boolean isJump = stones[0];
    
    int i = 0; 
    int len = stones.length; 
    while (i < len-1 && isJump == true) 
    {
      isJump = false;
      for (int j=D; j>0; j--) 
      {
        int idx = (i+j < len-1) ? (i+j) : (len-1);
        isJump = (isJump || stones[idx]); 
        if (isJump) {
//          System.out.print(idx + ", ");
          i = idx;
          break;
        }
      }
    }
    
    return isJump;
  }
}

