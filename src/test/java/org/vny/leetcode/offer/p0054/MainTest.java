package org.vny.leetcode.offer.p0054;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {

	@Test
	public void test() {
		// Main main = new Naive();
		Main main = new Naive01();
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.right = new TreeNode(4);
		root.left.right = new TreeNode(2);
		int k = 1;
		int res = main.kthLargest(root, k);
		int ans = 4;
		assertEquals(ans, res);
	}
}
