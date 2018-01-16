/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadExample.src.threadexample;
import java.util.Scanner;
/**
 *
 * @author Looney
 */
public class ThreadExample {

    ThreadExample()
    {
        Thread1 one = new Thread1();
        Thread2 two = new Thread2();
       //Runnable one = new Thread1();
       //Runnable two = new Thread2();
       Thread t1 = new Thread(one);
       Thread t2 = new Thread(two);
       //Thread1 t1 = new Thread1();
       //Thread2 t2 = new Thread2();
       t1.start();
       t2.start();
       
       Scanner x = new Scanner(System.in);
       int a = x.nextInt();
       
      one.stopNow();
      two.stopNow();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ThreadExample();
        System.out.println("********************Driver Finished***************");
    }
}
