/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadExample.src.threadexample;

/**
 *
 * @author Looney
 */
public class Thread2 implements Runnable
{
    boolean flag = true;
    int count = 0;
    Thread2()
    {
    }
    
    public void run()
    {
         do{
             count++;
             System.out.println("\t\tSecond Thread: " + count);
             try{Thread.sleep(80);}catch(InterruptedException ex){}
         }while(flag);
         System.out.println("\t\tThread 2 stopped");
    }
    
    public void stopNow()
    {
        flag = false;
    }
    
}
