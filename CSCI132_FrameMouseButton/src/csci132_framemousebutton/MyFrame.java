package csci132_framemousebutton;



import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JFrame;

/**
 *
 * @author Ben Seal and Zach Domke
 */
public class MyFrame extends JFrame {

     public static MyFrame inst;

    MyFrame( )
    {
        super("Zach & Ben Paint Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        
        c.add(ButtonPanel.getInstance(), BorderLayout.SOUTH);
        getContentPane().add(MousePanel.getInstance(), BorderLayout.CENTER);
        setSize(1000, 800);
        setVisible(true);
    }
    public static MyFrame getInstance()
    {
        if(inst == null)
           inst = new MyFrame();
       
         return inst;
    }
}
