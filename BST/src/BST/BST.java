package BST;
public class BST {
	public static boolean searchInBST(BinaryTreeNode<Integer> root, int k) {
		if(root==null)
        return false;
    
    if(root.data== k)
        return true;

   
    if(root.data > k){
    return searchInBST(root.left , k);}
       
        
    if( root.data < k ){
    return searchInBST(root.right , k);}
        else{
            return false;
        }
        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
}
