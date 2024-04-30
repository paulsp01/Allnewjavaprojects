package BST;

import java.util.ArrayList;

public class FindPathInBST {
	public static ArrayList<Integer> nodeTopath(BinaryTreeNode<Integer> root,int x){
		if(root==null) {
			return null;
		}
		if(root.data==x) {
			ArrayList<Integer> output=new ArrayList<>();
			output.add(root.data);
			return output;
		}
		else if(x<root.data) {
			ArrayList<Integer> l=nodeTopath(root.left,x);
			if(l!=null) {
			
			l.add(root.data);
			}
			return l;
		}else {
			ArrayList<Integer> r=nodeTopath(root.right,x);
			if(r!=null) {
			r.add(root.data);
			}
			return r;
		}
		
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
