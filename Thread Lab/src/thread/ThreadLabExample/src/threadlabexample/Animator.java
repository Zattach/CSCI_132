package thread.ThreadLabExample.src.threadlabexample;

public class Animator implements Runnable {
	CanvasPanel canvas;
	Animator(CanvasPanel cp){
		canvas = cp;
	}
	
	public void run(){
		boolean flag = true;
		do{
			canvas.animate();
			try{Thread.sleep(1000/24);}catch(InterruptedException ex){}
		}while(flag);
	}

}
