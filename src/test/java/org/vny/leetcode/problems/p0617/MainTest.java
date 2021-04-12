package org.vny.leetcode.problems.p0617;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest{

	@Test
	public void test() {
		Main main = new Naive();
		TreeNode t1 = new TreeNode(1);
		t1.left = new TreeNode(3);
		t1.right = new TreeNode(2);
		t1.left.left = new TreeNode(5);

		TreeNode t2 = new TreeNode(2);
		t2.left = new TreeNode(1);
		t2.right = new TreeNode(3);
		t2.left.right = new TreeNode(4);
		t2.right.right = new TreeNode(7);

		TreeNode res = main.mergeTrees(t1, t2);
	}
}
