/*
 * @author k15t539
 */

public class Driver {

	public static void main(String[] args){
		
		//sets default list
		LinkedList list = new LinkedList();
		String [] names = {"Hunter", "Marge", "Homer", "Bart", "Lisa"};
		String [] ids = {"14678", "82689", "92003", "12468", "47421"};
		
		for(int i=0; i<names.length; i++){
			String j = names[i];
			String k = ids[i];
			list.add(new Node(new Student(j, k)));
		}
		
		//runs switch statement in LinkedList
		list.run();
	}
}