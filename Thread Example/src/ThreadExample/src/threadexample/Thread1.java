/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadExample.src.threadexample;

/**
 *
 * @author Looney
 */
public class Thread1 implements Runnable
{
    boolean flag = true;
    int count = 0;
    Thread1()
    {
    }
    
    public void run()
    {
         do{
             count++;
             System.out.println("First Thread: " + count);
             try{Thread.sleep(20);}catch(InterruptedException ex){}
         }while(flag);
         
         System.out.println("Thread 1 stopped");
    }
    
    public void stopNow()
    {
        flag = false;
    }
}
