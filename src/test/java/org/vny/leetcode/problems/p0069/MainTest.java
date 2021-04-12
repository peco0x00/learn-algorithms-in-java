package org.vny.leetcode.problems.p0069;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest{

	@Test
	public void test() {
		Main main = new Naive();
		int x1 = 4;
		int res1 = main.mySqrt(x1);
		int ans1 = 2;
		assertEquals(ans1, res1);

		int x2 = 8;
		int res2 = main.mySqrt(x2);
		int ans2 = 2;
		assertEquals(ans2, res2);
	}
}
