package GeeksForGeeks.Binary_Search_Tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

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


public class Leveled_Order_BST {

	public static void main(String[] args) {
		 //call levelOrder(Node) method of Test class
	}
}



class Test22{
	static ArrayList<Integer> levelOrder(Node Node) {
        ArrayList<Integer> rs = new ArrayList<Integer>();
        
        Queue<Node> mq = new ArrayDeque<Node>();
        mq.add(Node);
        
        while(mq.size() > 0)
        {
            int level = mq.size();
            
            for(int i=0; i<level; i++)
            {
              //Remove Print add child
               Node node2 = mq.remove();
               rs.add(node2.val);
            
               if(node2.left != null)
                  mq.add(node2.left);
               
               if(node2.right != null)
                  mq.add(node2.right);
            }
        }
        return rs;
   }
}