package org.vny.leetcode.problems.p0112;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest{

	@Test
	public void test() {
		// Main main = new Solution01();
		Main main = new Solution02();
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.right = new TreeNode(1);
		int target = 22;
		boolean res = main.hasPathSum(root, target);
		boolean ans = true;
		assertEquals(ans, res);
	}
}
