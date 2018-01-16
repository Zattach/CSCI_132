package review;

public class Mariners extends Baseball{
	protected String name;
	private int strikes;
	public Mariners(){
		System.out.println("Mariners");
		}
	public Mariners(int a){
		System.out.println("Mariners #2");
		}
	private int returnStrikes(){
		return strikes;
		}
	public void setStrikes(int in){
		strikes = in;
		}
	}