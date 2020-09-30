package com.java.advance.dataStructure.binaryTree;

public class BinaryTree {

	class Node
	{
		private Node left;
		private Node right;
		int data;
	}
	
	public Node createNewNode(int k)
	{
		Node node = new Node();
		node.left = null;
		node.right = null;
		node.data = k;
		
		return node;
	}
	
	public Node insertBST(Node node, int val)
	{
		if(node == null)
			return createNewNode(val);
		
		if(val < node.data)
		{
			node.left = insertBST(node.left, val);
		}
		else if (val > node.data)
		{
			node.right = insertBST(node.right, val);
		}
		return node;
	}
	
	public void inorderTraversal(Node node)
	{
		if(node == null)
			return;
		inorderTraversal(node.left);
		System.out.print(" "+node.data);
		inorderTraversal(node.right);
	}
	
	public Node deleteNode(Node node, int val)
	{
		if(node == null)
			return node;
		if(val < node.data)
		{
			node.left = deleteNode(node.left, val);
		}
		else if(val > node.data)
		{
			node.right = deleteNode(node.right, val);
		}
		else
		{
			if(node.left == null && node.right == null)
				node = null;
			else if(node.left == null)
			{
				node = node.right;
			}
			else if(node.right == null)
			{
				node = node.left;
			}
			else
			{
				Node temp = minNode(node.right);
				node.data = temp.data;
				node.right = deleteNode(node.right, temp.data);
			}
		}
		return node;
	}
	
	private Node minNode(Node node)
	{
		if(node.left != null)
			return minNode(node.left);
		else
			return node;
	}
	public static void main(String[] args) {

		BinaryTree bt = new BinaryTree();
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
		bt.inorderTraversal(root);
		bt.deleteNode(root, 10);
		System.out.println("\nBinary Tree after deletion: ");
		bt.inorderTraversal(root);
		
	}

}
