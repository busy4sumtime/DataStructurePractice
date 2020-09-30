package com.java.advance.dataStructure.binaryTree;

import java.util.HashMap;

public class PrintPostUsingInAndPre {

	int preIndex = 0;
	void printPOrder(int[] in, int[] pre, int inStart, 
			int inEnd, HashMap<Integer, Integer> hMap)
	{
		if(inStart > inEnd)
			return;
		int inIndex = hMap.get(pre[preIndex++]);
		printPOrder(in, pre, inStart, inIndex-1, hMap);
		printPOrder(in, pre, inIndex+1, inEnd, hMap);
		System.out.print(in[inIndex] + " ");
		
	}
	void printPostOrder(int[] in, int[] pre)
	{
		int inSize = in.length;
		HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
		for(int i = 0; i < inSize; i++)
			hMap.put(in[i], i);
		System.out.print("Post Order: ");
		printPOrder(in, pre, 0, inSize-1, hMap);
	}
	public static void main(String[] args) {
		
		int[] in = {4, 2, 5, 1, 3, 6};
		int[] pre = {1, 2, 4, 5, 3, 6};
		
		PrintPostUsingInAndPre printPost = new PrintPostUsingInAndPre();
		printPost.printPostOrder(in, pre);

	}

}
