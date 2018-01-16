
public class BinarySearchTree {
	private Node root;
	
	BinarySearchTree(){
		root = null;
	}
	
	public void insert(String city){
		Node current = new Node(city);
		if (root == null){
			root = current;
		} else {
			insertAux(root, current);
		}
	}
	
	private void insertAux(Node parent, Node current){
		if (current.getCity().compareTo(parent.getCity()) < 0){
			if (parent.getLeft() == null){
				parent.setLeft(current);
			} else {
				insertAux(parent.getLeft(), current);
			}
		} else {
			if (parent.getRight() == null){
				parent.setRight(current);
			} else {
				insertAux(parent.getRight(), current);
			}
		}
	}
	
	public void inorder(){
		if (isEmpty()){
			System.out.println("The tree is empty");
		} else {
			System.out.println("Here is your new tree");
			inorderAux(root);
		}
		System.out.println("--------------------");
	}
	
	private void inorderAux(Node current){
		if (current != null){
			inorderAux(current.getLeft());
			System.out.println(current.getCity());
			inorderAux(current.getRight());
		}
	}
	
	private boolean isEmpty(){
		return (root == null);
	}

}
