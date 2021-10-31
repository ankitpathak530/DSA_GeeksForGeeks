package GeeksForGeeks.Binary_Search_Tree;


/* Ceil:- We search for given element in tree if found we return the node 
 *                                             if not found we return next greater element in tree.
 * Time Complexity is O(h)
 * 
class Node
{
	int val;
	Node left,right;
	Node(int val){
		this.val = val;
	}
}
*/


public class Ceil_In_BST {
   public static void main(String...args)
   {
	   
   }
   
   public static Node getCeil(Node root, int key)
   {
	    Node res = null;
	    
	    while(root != null)
	    {
	    	 if(root.val == key)
	    		 return root;
	    	 
	    	 else if(key > root.val)
	    	 {
	    		 root = getCeil(root.right,key);
	    	 }
	    	 else {
	    		 res = root;
	    		 root = getCeil(root.left,key);
	    	 }
	    }
	   return res; 
   }
} 
