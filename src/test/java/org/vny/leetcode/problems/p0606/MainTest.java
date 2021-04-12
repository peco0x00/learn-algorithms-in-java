package org.vny.leetcode.problems.p0606;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest{

	@Test
	public void test() {
		// Main main = new Naive();
		// Main main = new Naive01();
		Main main = new Naive02();
		TreeNode root1 = new TreeNode(1);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(3);
		root1.left.left = new TreeNode(4);
		String res1 = main.tree2str(root1);
		String ans1 = "1(2(4))(3)";
		assertEquals(ans1, res1);

		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(3);
		root2.left.right = new TreeNode(4);
		String res2 = main.tree2str(root2);
		String ans2 = "1(2()(4))(3)";
		assertEquals(ans2, res2);
	}
}
