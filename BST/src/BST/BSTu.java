package BST;

public class BSTu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  BST b= new BST();
	        b.insert(5);
	        b.insert(2);
	        b.insert(7);
	        b.insert(1);
	        b.insert(3);
	        b.insert(6);
	        b.insert(8);

	        b.printTree();

	        System.out.println(b.isPresent(5));
	        b.deleteData(5);
	        System.out.println(b.isPresent(5));

	        b.printTree();
	        b.deleteData(2);
	        System.out.println(b.isPresent(2));
	        b.printTree();


	}

}
