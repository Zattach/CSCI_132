package review;

/*** The CarClass**/
public class Car{
	private String name;
	public Car(String n){
		name =n;
		}
	public Car(){
		name ="Generic";
		}
	public String getName(){
		return name;
		}
	public void changeName(String x){
		name = x;
		}
	public Car testQuestion(Garage one, Garage two, Car three){
		Car four =two.getCar();
		four.changeName("Doc");
		one.setCar(four);
		System.out.println(one.getName());//printstatementfour
		System.out.println(two.getName());//printstatementfive
		System.out.println(four.getName());//printstatementsix
		three.changeName("Mack");
		one.setCar(three);
		two = one;
		System.out.println(one.getName());//printstatementseven
		System.out.println(two.getName());//printstatementeight
		System.out.println(four.getName());//printstatementnine
		return two.getCar();
	}
}