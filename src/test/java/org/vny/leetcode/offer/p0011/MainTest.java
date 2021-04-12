package org.vny.leetcode.offer.p0011;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest{

	@Test
	public void test() {
		Main main = new Naive();
		int[] nums = {3, 4, 5, 1, 2};
		int res = main.minArray(nums);
		int ans = 1;
		assertEquals(ans, res);
	}
}
