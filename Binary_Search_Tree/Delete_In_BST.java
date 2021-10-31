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


public class Delete_In_BST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Predecessor we are finding max value that is less than root
	public static int max(Node root)
	{
		if(root.right != null)
			return max(root.right);
		else
		   return  root.val;
	}/*
	Same top method can be done in iterative way
	public static int max(Node root)
	{
	    while(root != null && root.right != null)
	        root = root.right;
	    
	    return  root.data;
	}*/
	
	
	

	
	/*
	    Successor we are finding next greater value than that of root
		public static int max(Node root)
		{
			if(root.left != null)
				return max(root.left);
			else
			   return  root.val;
		}/*
		Same top method can be done in iterative way
		public static int max(Node root)
		{
		    while(root != null && root.left != null)
		        root = root.left;
		    
		    return  root.data;
		}
	*/
	
	
	
	public static Node deleteBST(Node root,int val)
	{ 
		 if(root == null)
			 return null;
		
		 if(val < root.val)
		 {
			 root.left = deleteBST(root.left,val);
		 }
		 else if(val > root.val)
		 {
			 root.right = deleteBST(root.right,val);
		 }
		 else  // If root.val == value to be deleted
		 {
			 // If root contains both left and right child
			 if(root.left != null && root.right != null)
			 {
			       int lmax = max(root.left);
			       root.val = lmax;
			       root.left = deleteBST(root.left,lmax);
			       return root;          
			 }
			 else if(root.left != null)
			 {
				return root.left;
			 }
			 else if(root.right != null)
			 {
				return root.right;
			 }
			 else
			 {
				 return null;
			 }
		}
	  return root; 
	}
	

}
