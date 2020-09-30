package com.java.advance.dataStructure.binaryTree;

import java.util.Stack;

public class InorderWithoutRecursion {
	
	class Node {
		Node right;
		Node left;
		int data;
	}

	public Node createNewNode(int k)
	{
		Node node = new Node();
		node.right = null;
		node.left = null;
		node.data = k;
		
		return node;
	}
	
	public Node insertBST(Node root, int k)
	{
		if(root == null)
		{
			root = createNewNode(k);
			return root;
		}
		if(k > root.data)
		{
			root.right = insertBST(root.right, k);
		}
		else if(k < root.data)
		{
			root.left = insertBST(root.left, k);
		}
		return root;
	}
	
	public void inorderWithoutRecursionUsingStack(Node root)
	{
		// Create Empty Stack
		Stack<Node> s = new Stack<Node>();
		Node current = root;
		if(root == null)
			return; // If tree is Empty then return
		while(current != null || !(s.isEmpty()))
		{
			while(current != null)
			{
				s.push(current);
				current = current.left;
			}
			// Value of current is NULL
			current = s.pop();
			System.out.print(" "+current.data);
			current = current.right;
		}
	}
	public static void main(String[] args) {

		InorderWithoutRecursion bt = new InorderWithoutRecursion();
		Node root = null;
		root = bt.insertBST(root, 10);
		root = bt.insertBST(root, 6);
		root = bt.insertBST(root, 15);
		root = bt.insertBST(root, 8);
		root = bt.insertBST(root, 11);
		root = bt.insertBST(root, 17);
		root = bt.insertBST(root, 20);
		root = bt.insertBST(root, 2);
		root = bt.insertBST(root, 7);
		root = bt.insertBST(root, 9);
		root = bt.insertBST(root, 19);
		
		System.out.println("Binary Tree: ");
		bt.inorderWithoutRecursionUsingStack(root);
	}

}
