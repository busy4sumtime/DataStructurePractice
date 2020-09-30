package com.java.advance.dataStructure.binaryTree;

import java.util.ArrayList;

public class InorderToAllPreOrder {
	
	class BTree
	{
		BTree right = null;
		BTree left = null;
		int data;
		BTree(int item)
		{
			right = null;
			left = null;
			data = item;
		}
	}
	
	void preOrderTraversal(BTree root)
	{
		if(root!=null)
		{
			System.out.print(root.data + " ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
		}
	}
	ArrayList<BTree> getTrees(int[] inOrder, int start, int End)
	{
		ArrayList<BTree> bTreeList = new ArrayList<BTree>();
		return bTreeList;
	}
	public static void main(String[] args)
	{
		int[] inOrder = {4, 5, 7};
	}

}
