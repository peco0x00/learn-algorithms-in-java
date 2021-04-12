package org.vny.leetcode.offer.p0055;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest{

	@Test
	public void test() {
		// Main main = new Naive();
		// Main main = new Naive01();
		Main main = new Solution01();
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		boolean res = main.isBalanced(root);
		boolean ans = true;
		assertEquals(ans, res);
	}
}
