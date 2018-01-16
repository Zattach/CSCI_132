/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintleveloneexamplehelp;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author Looney
 */
 public class MyFrame extends JFrame {

     public static MyFrame inst;
     private CanvasPanel cp;
     private ButtonPanel bp;
     private MenuBar mb;
     
    MyFrame( )
    {
        super("Paint Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cp = CanvasPanel.getInstance();
        bp = ButtonPanel.getInstance();
        mb = MenuBar.getInstance();
        
        getContentPane().add(cp, BorderLayout.CENTER);
        getContentPane().add(bp, BorderLayout.WEST);
        getContentPane().add(mb, BorderLayout.NORTH);
        setSize(500,500);
        setLocation(100,100);
        setVisible(true);
    }
    public static MyFrame getInstance()
    {
        if(inst == null)
           inst = new MyFrame();
         return inst;
    }

}  

