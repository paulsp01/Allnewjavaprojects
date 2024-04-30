package BinaryTreeNode;

public class takeInputLevelWise {
	 public static BinaryTreeNode<Integer> takeinputLevelWise(){
         Scanner s= new Scanner(System.in);
         int rootData= s.nextInt();

         if(rootData==-1) return null;

         BinaryTreeNode<Integer> root= new BinaryTreeNode<Integer>(rootData);
         Queue<BinaryTreeNode<Integer>> pendingChildren= new LinkedList<BinaryTreeNode<Integer>>();
         pendingChildren.add(root);

         while(!pendingChildren.isEmpty()){
             BinaryTreeNode<Integer> front= pendingChildren.poll();
             System.out.println("Enter left child of "+ front.data);
             int left= s.nextInt();
             if(left!=-1){
                     BinaryTreeNode<Integer> leftChild= new BinaryTreeNode<Integer>(left);
                     front.left= leftChild;
                     pendingChildren.add(leftChild)
             }

             System.out.println("Enter right child of "+ front.data);
             int right= s.nextInt();
             if(right!=-1){
                     BinaryTreeNode<Integer> rightChild= new BinaryTreeNode<Integer>(right);
                     front.right= rightChild;
                     pendingChildren.add(rightChild)
             }
         }
         return root;
     }



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
