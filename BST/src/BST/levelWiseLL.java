package BST;

import java.util.LinkedList;
import java.util.*;

public class levelWiseLL {
	public static ArrayList<LinkedListNode<Integer>> constructLinkedListForEachLevel(BinartTreeNode<Integer> root){
		if(root==null) {
			return null;
		}
		Queue<BinartTreeNode<Integer>>pending=new LinkedList <BinartTreeNode<Integer>>();
		pending.add(root);
		
		
		int clr=1;
		int nlc=0;
		
		 LinkedListNode<Integer> ch=null;
		 LinkedListNode<Integer> ct=null;
		 ArrayList< LinkedListNode<Integer>> output= new ArrayList<>();
		 
		 while(!pending.isEmpty()) {
			 BinartTreeNode<Integer> cn;
			 cn=pending.remove();
			 LinkedListNode<Integer> newNode=new LinkedListNode<>(cn.data);
			 if(ch==null) {
				 ch=newNode;
				 ct=newNode;
			 }else {
				 ct.next=newNode;
				 ct=newNode;
			 }
			 if(cn.left!=null) {
				 pending.add(cn.left);
				 nlc++;
			 }
			 if(cn.right!=null) {
				 pending.add(cn.right);
				 nlc++;
			 }
			 clr--;
			 if(clr==0) {
				 output.add(ch);
				 ch=null;
				 ct=null;
				 clr=nlc;
				 nlc=0;
			 }
			 
	}
		 return output;
	
	 }
	 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
