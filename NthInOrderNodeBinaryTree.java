package com.java.advance.dataStructure.binaryTree;

public class NthInOrderNodeBinaryTree {

	class Node {
		Node right;
		Node left;
		int data;
	}
	int counter = 0;
	public Node createNewNode(int data)
	{
		Node node = new Node();
		node.right = null;
		node.left = null;
		node.data = data;
		return node;
	}
	
	public Node insertBinaryTree(Node root, int data)
	{
		if(root == null)
		{
			return createNewNode(data);
		}
		if(data > root.data)
		{
			root.right = insertBinaryTree(root.right, data);
		}
		else if (data < root.data)
		{
			root.left = insertBinaryTree(root.left, data);
		}
		return root;
	}
	
	public void inorderTraversal(Node root)
	{
		if(root == null)
			return;
		inorderTraversal(root.left);
		System.out.print(root.data+ " ");
		inorderTraversal(root.right);
	}
	
	public void nthInorderNode(int k, Node root)
	{
		if(root == null)
		{
			return;
		}
		nthInorderNode(k, root.left);
		counter++;
		if(counter == k)
		{
			System.out.println("\nnth Node: "+root.data);
			return;
		}
		nthInorderNode(k, root.right);
		
	}
	public static void main(String[] args) {

		Node root = null;
		NthInOrderNodeBinaryTree nth = new NthInOrderNodeBinaryTree();
		root = nth.insertBinaryTree(root, 10);
		root = nth.insertBinaryTree(root, 20);
		root = nth.insertBinaryTree(root, 30);
		root = nth.insertBinaryTree(root, 10);
		root = nth.insertBinaryTree(root, 40);
		root = nth.insertBinaryTree(root, 50);
		
		nth.inorderTraversal(root);
		nth.nthInorderNode(4, root);
	}

}
