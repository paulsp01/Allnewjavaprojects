package BST;

import java.util.ArrayList;
import java.util.Scanner;

public class nodeToRootPath {
public static ArrayList<Integer> nodeTopath(BinaryTreeNode<Integer> root,int x){
	if(root==null) {
		return null;
	}
	if(root.data==x) {
		ArrayList<Integer> output=new ArrayList<>();
		output.add(root.data);
		return output;
	}
	ArrayList<Integer> leftOut=nodeTopath(root.left,x);
	if(leftOut!=null) {
		leftOut.add(root.data);
		return leftOut;
	}
	ArrayList<Integer> rightOut=nodeTopath(root.right,x);
	if(rightOut!=null) {
		rightOut.add(root.data);
		return rightOut;
	}
	return null;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
