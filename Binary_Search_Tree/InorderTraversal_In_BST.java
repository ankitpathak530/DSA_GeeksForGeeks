package GeeksForGeeks.Binary_Search_Tree;

import java.util.ArrayList;



/*
class Node
{
	int val;
	Node left,right;
	Node(int val){
		this.val = val;
	}
}
*/


public class InorderTraversal_In_BST {

	public static void main(String[] args) {
	
	}


	public static ArrayList<Integer> inOrder(Node root) {
	  
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    result = getInorder(root,result);
	   
	  return result;
	}
	public static ArrayList<Integer> getInorder(Node root,ArrayList<Integer> result)
	{
	    
	    if(root == null)
	       return null;
	       
	    getInorder(root.left,result);
	    if(root != null ) 
	     result.add(root.val);
	    getInorder(root.right,result);
	    
	    return result;
	}
}