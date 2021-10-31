package GeeksForGeeks.Binary_Search_Tree;


/* Floor:- We search for given element in tree if found we return the node 
 *                                             if not found we return largest number in tree that is less than element.
 * 
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
     public static Node returnFloor(Node root,int key)
     {
    	  Node res = null;
    	 
    	  while(root != null)
    	  {
    		         	  
        	  if(root.val == key)
        		  break;
        	  
        	  else if(key > root.val) {
        		  root = returnFloor(root.right,key);
        	  }
        	  else
        	  {
        		   res = root;
        		   root = returnFloor(root.left,key);
        	  }
    	  }
    	return res;
     }
}

