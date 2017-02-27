package com.barnandas.leetcode;

public class Problem_110 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	
	public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }    
        return Math.max(height(root.left), height(root.right)) + 1;
    } 
    
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        if (Math.abs(height(root.left) - height(root.right)) > 1) {
            return false;
        } else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
