package org.vny.leetcode.problems.p1022;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest{

	@Test
	public void test() {
		// Main main = new Naive();
		// Main main = new Naive01();
		Main main = new Naive02();

		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(0);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(0);
		root.left.right = new TreeNode(1);
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(1);
		int res = main.sumRootToLeaf(root);
		int ans = 22;
		assertEquals(ans, res);
	}
}
