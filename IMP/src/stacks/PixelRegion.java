package stacks;

public class PixelRegion {
	int x, y, counter;
	
	PixelRegion(int y, int x){
		this.x = x;
		this.y = y;
		counter = 0;
	}
	
	public int getCount(){
		return counter;
	}
	
	public void updateCount(){
		counter++;
	}
	
	public int getY(){
		return y;
	}
	
	public int getX(){
		return x;
	}
}
