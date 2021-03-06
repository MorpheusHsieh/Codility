package main.MaximizeSumOfTwoDisjoingSubsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class main002
{
	public static void main(String[] args)
	{
		Solution002 sol = new Solution002();
		TestCase002 tc = new TestCase002();
		
		String format1 = "\r\nInput: %s, K = %d, L = %d";
		String format2 = "Output: %d";
		
		for (TestVal002 val : tc.get())
		{
			int[] nums = val.nums;
			int K = val.K;
			int L = val.L;
			String str = Arrays.toString(nums);
			System.out.println(String.format(format1, str, K, L));

			int res = sol.solution(nums, K, L);
			System.out.println(String.format(format2, res));
		}
	}
}

class TestVal002
{
	int[] nums;
	int K;
	int L;
	public TestVal002(int[] nums, int k, int l) 
	{ 
		this.nums = nums; 
		this.K = k;
		this.L = l;
	}
}

class TestCase002
{
	public List<TestVal002> get()
	{
	  ArrayList<TestVal002> list = new ArrayList<TestVal002>();

	  list.add(new TestVal002(new int[] {6,1,4,6,3,2,7,4},3,2)); // 24
	  
	  return list;
	}
}
