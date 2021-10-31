package GeeksForGeeks.Binary_Search_Tree;

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


public class Insert_In_BST {

	public static void main(String[] args) {

	}
	
	//Recursive way to insert in BST
	public static Node insertBST2(Node root,int x)
	{
		if(root == null)
			return new Node(x);
		
		if(root.val > x)
			root.left = insertBST2(root.left,x);
		else if(root.val < x)
			root.right = insertBST2(root.right,x);
		
		return root;			
	}
	
	//Iterative way to insert in BST
	public static Node insertInBST1(Node root,int val)
	{
		Node parent = null,current = root;
		Node temp = new Node(val); 
		
		 while(current != null)
		 {
			 parent = current;
			 
			 if(current.val > val)
				 current = current.left;
			 else if(root.val < val)
				 current = current.right;
			 else
				 return root;
		 }
		 if(parent == null)
			 return temp;
		 else if(parent.val > val)
			 parent.left = temp;
		 else
			 parent.right = temp;
	
		 return root;
	}
}

