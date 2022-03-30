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
	
	
	public static ArrayList<Integer> getInorder(Node root)
	{
		ArrayList<Integer> result = new ArrayList<Integer>();
		Stack<Node> stack = new Stack<Node>();
		
		Node temp = root;
		
		while(true)
		{
			if(temp != null)
			{
				 stack.push(temp);
			    	 temp = temp.left;
			}
			else
			{
				if(stack.isEmpty())
					break;
			        temp = stack.pop();
				result.add(temp.data);
				temp = temp.right;
			}
		}
		return result;
	}
		
	
	
	
}
