package main.MonkeyJumpCrossRiver;

public class TestCase03 implements TestCase 
{
  @Override
  public int getD() {
    return 3;
  }

  @Override
  public int[] getCase() {
    return new int[] { 1, 2, 3, 4, -1, -1, -1 };
  }
  
  @Override
  public int getReturn() {
    return -1;
  }
}
