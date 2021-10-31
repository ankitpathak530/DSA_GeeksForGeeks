package GeeksForGeeks.Binary_Search_Tree;



//  Time Complexity using Recursion :- O(h)
//  Time Complexity using Iterative :- O(h)
    
//  Auxiliary Space Required using Recursion :- O(h)
//  Auxiliary Space Required using Iterative :- O(1)


class Node
{
	int val;
	Node left,right;
	Node(int val){
		this.val = val;
	}
}



public class Search_In_BST {
     public static void main(String...args)
     {
    	 
     }
     
     //Recursive WAy to Search Key      Take more Overhead space
     public static boolean findKey1(Node root,int key )
     {
    	  if(root == null)
    		  return false;
    	  if(root.val == key)
    		  return true;
    	  
    	  else if(root.val > key)
    		  return findKey1(root.left,key);
    	  else
    		  return findKey1(root.right,key);
    		  
     }
     
     //Iterative method 
     public static boolean findKey2(Node root,int key)
     {
    	  while(root != null)
    	  {
    		   if(root.val == key)
    			   return true;
    		   else if(root.val > key)
    			   root = root.left;
    		   else
    			   root = root.right;
    	  }
    	 return false;
     }
     
}


