package main.CountVisibleNodesInBinaryTree;

public class Main {

  public static void main(String[] args)
  {
    System.out.println("Count Visible Nodes In Binary Tree\r\n");
    
    Solution sol = new Solution();
    String format = "A[] = %s, return %d\r\n";
    
    TestCase tc = new TestCase01();
    Tree T = tc.getCase();
    int res = sol.solution(T);
    System.out.println(String.format(format, TreeUtils.toList(T), res));
    
    tc = new TestCase02();
    T = tc.getCase();
    res = sol.solution(T);
    System.out.println(String.format(format, TreeUtils.toList(T), res));
  }
}
