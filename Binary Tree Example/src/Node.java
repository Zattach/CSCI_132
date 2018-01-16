
public class Node {
	private String city;
	private Node leftChild;
	private Node rightChild;
	
	Node (String city){
		this.city = city;
		leftChild = null;
		rightChild = null;
	}
	
	public String getCity(){
		return city;
	}
	
	public Node getLeft(){
		return leftChild;
	}
	
	public Node getRight(){
		return rightChild;
	}
	
	public void setLeft(Node city){
		leftChild = city;
	}
	public void setRight(Node city){
		rightChild = city;
	}

}
