package org.vny.leetcode.offer.p0028;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest{

	@Test
	public void test() {
		Main main = new Naive();
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(2);
		root1.left.left = new TreeNode(3);
		root1.left.right = new TreeNode(4);
		root1.right.left = new TreeNode(4);
		root1.right.right = new TreeNode(3);
		boolean res1 = main.isSymmetric(root1);
		boolean ans1 = true;
		assertEquals(ans1, res1);

		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(2);
		root2.left.right = new TreeNode(3);
		root2.right.right = new TreeNode(3);
		boolean res2 = main.isSymmetric(root2);
		boolean ans2 = false;
		assertEquals(ans2, res2);
	}
}
