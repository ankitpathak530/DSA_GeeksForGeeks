package GeeksForGeeks.Binary_Search_Tree;


/* Floor:- We search for given key in tree if found we return the node 
 *                                             if not found we return largest element in tree that is less than key.
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

public class Floor_In_BST {
     public static void main(String... args)
     {
    	 
     }
     public static Node getFloor(Node root,int key)
     {
    	  Node res = null;
    	 
    	  while(root != null)
    	  {
    		         	  
        	  if(root.val == key)
        		  break;
        	  
        	  else if(key > root.val) {
        		  root = getFloor(root.right,key);
        	  }
        	  else
        	  {
        		   res = root;
        		   root = getFloor(root.left,key);
        	  }
    	  }
    	return res;
     }
}

