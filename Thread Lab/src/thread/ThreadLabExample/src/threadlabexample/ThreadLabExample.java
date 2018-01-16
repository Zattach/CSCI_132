/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package thread.ThreadLabExample.src.threadlabexample;

import java.awt.BorderLayout;
import javax.swing.*;

/**
 *
 * @author Zach
 */

public class ThreadLabExample extends JFrame {
    CanvasPanel cp;
    
    ThreadLabExample()
    {
        super("Thread Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 500);
        cp = new CanvasPanel();
        getContentPane().add(cp, BorderLayout.CENTER);
        setVisible(true);
        animate();
    }
    public void animate()
    {
    	Animator a = new Animator(cp);
        Thread t = new Thread(a);
        t.start();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new ThreadLabExample();
    }
    
    
}
