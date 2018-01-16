/*
 * @author k15t539
 */

public class Student {
	private String name;
	private String id;
	
	//creates new student object
	Student(String name, String id){
		this.name = name;
		this.id = id;
	}
	
	//allows methods to get the name of the student
	public String getName(){
		return name;
	}
	
	//allows methods to get the id of the student
	public String getID(){
		return id;
	}
}
