package review;

public class Q1Reference{
	public static void main(String []args){
		Car tow = new Car("Mater");
		Garage radiatorSprings = new Garage(new Car("McQueen")); 
		Car lizzie = new Car();
		System.out.println(tow.getName()); //Printstatementone
		System.out.println(radiatorSprings.getName()); //printstatementtwo
		System.out.println(lizzie.getName());//printstatementthree
		radiatorSprings.setCar(tow.testQuestion(radiatorSprings,new Garage(new Car("Sally")),lizzie));
		System.out.println(tow.getName());//printstatementten
		System.out.println(radiatorSprings.getName());//printstatementeleven
		System.out.println(lizzie.getName());//printstatementtwelve}}
	}
}