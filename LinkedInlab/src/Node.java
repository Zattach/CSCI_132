/*
 * @author k15t539
 */

public class Node {
	private Node next;
	private Student objectData;
	
	//converts student object to a node allowing for easier access for other methods
	public Node(Student s){
		objectData = s;
		next = null;
	}
	
	//sets the next node that a method will look at
	public void setNext(Node n){
		next = n;
	}
	
	//moves the focus of a method to the next node
	public Node getNext(){
		return next;
	}
	
	//gets the name of the student listed in the node
	public String getName(){
		return objectData.getName(); 
	}
	
	// gets the id of the student listed in the node
	public String getID(){
		return objectData.getID();
	}
}
