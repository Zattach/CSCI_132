import java.util.Scanner;

/*
 * @author k15t539
 */

public class LinkedList {
	
	private Node first;
	private Node last;
	
	LinkedList(){
		first = last = null;
	}
	
	//determines what the user will do
	public void run(){
		int var = 0;
		do{
			menu();
			Scanner get = new Scanner(System.in);
			var = get.nextInt();
			switch(var){
			case 1: System.out.println("Please enter a Name");
			Scanner name = new Scanner(System.in);
			String newN = name.next();
			System.out.println("Please enter an ID");
			Scanner id = new Scanner(System.in);
			String newI = id.next();
			add(new Node(new Student(newN, newI)));
			break;
			case 2: print();
			break;
			case 3: System.out.println("What Name would you like to search for?");
			Scanner nameIn = new Scanner(System.in);
			String search = nameIn.next();
			search(search);
			break;
			case 4: System.out.println("What Name would you like to remove?");
			Scanner old = new Scanner(System.in);
			String rem = old.next();
			remove(rem);
			break;
			case 5: clear();
			break;
			case -1: System.out.println("Goodbye");
			break;
			default: System.out.println("Try again");
			break;
			}
		}while(var != -1);
	}
	
	//prints options for the user
	public void menu(){
		System.out.println("What would you like to do");
		System.out.println("Press 1 to add an item");
		System.out.println("Press 2 to print the list");
		System.out.println("Press 3 to search the list");
		System.out.println("Press 4 to delete an item");
		System.out.println("Press 5 to clear the whole list");
		System.out.println("Press -1 to exit");
	}
	
	//clears the entire list
	public void clear(){
		first = null;
		last = null;
	}

	//searches for a specific name and tells if it is a part of the list or not
	public boolean search(String input){
		Node iter = first;
		Node lag = first;
		while(iter != null){
			if(input.equals(iter.getName())){
				System.out.println(iter.getName() + " was found!");
				System.out.println();
				return true;
			}else{
				lag = iter;
				iter = iter.getNext();
			}
		}
		System.out.println("That name was not found");
		System.out.println();
		return false;
	}
	
	//adds a new node and creates a new student object to add to the list
	public void add(Node input){
		if(first == null){
			first = input;
			last = first;
		}else{
			last.setNext(input);
			last = last.getNext();
		}
	}
	
	//prints the entire list
	public void print(){
		Node iter = first;
		while(iter != null){
			System.out.println(iter.getName() + ", " + iter.getID());
			iter = iter.getNext();
		}
		System.out.println();
	}
	
	//removes a node and a student object from the list
	public boolean remove(String input){
		Node iter = first;
		Node lag = first;
		while(iter != null){
			if(input.equals(iter.getName())){
				if(iter == first){
					first = first.getNext();
				}else{
					lag.setNext(iter.getNext());
					iter.setNext(null);
					return true;
				}
			}else{
				lag = iter;
				iter = iter.getNext();
			}
		}
		return false;
	}
}
