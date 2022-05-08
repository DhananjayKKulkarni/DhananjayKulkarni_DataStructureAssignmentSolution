package com.learning.pg.client;

	/*
	 		Question# 2. modify the existing BST and display the node values present in ascending order.
	*/

class Node
{
   int data;
   Node left,right;
   Node(int data)
   {
       this.data=data;
       left=right=null;
   }
}

public class SkewedTree {
	
	Node node;
	Node prev = null;
	Node newRoot = null;
	
	void transformBSTtoSkewedTree(Node root)
	{
		if(root == null)return;
		
		//Navigate to the left leaf
		transformBSTtoSkewedTree(root.left);
		Node rightNode = root.right;
	
		// Create a new head if it is not created 
		if(newRoot == null)
		{
			newRoot = root;
			root.left = null;
			prev = root;
		}
		else{
			//Rotating tree to right
			prev.right = root;
			root.left = null;
			prev = root;
		}
		transformBSTtoSkewedTree(rightNode);
	}
	
	void printSkewedTree(Node root)	{
			
		if(root == null) {					//if root is null then nothing to traverse
			return ;
		}
		System.out.print(root.data + " ");
		printSkewedTree(root.right);   
	}
	
	// main method for the program
	public static void main(String args[])
	{
		SkewedTree binaryTree = new SkewedTree();
		binaryTree.node = new Node(50);
		binaryTree.node.left = new Node(30);
		binaryTree.node.right = new Node(60);
		binaryTree.node.left.left = new Node(10);
		binaryTree.node.right.left= new Node(55);
	    
		binaryTree.transformBSTtoSkewedTree(binaryTree.node);		// Transform BST to skewed tree
	    
		System.out.println("Printing Skewed Tree:");
	    // print the Skewed Tree
	    binaryTree.printSkewedTree(binaryTree.newRoot);
	}
}
