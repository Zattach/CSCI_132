/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintleveloneexamplehelp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


/**
 *
 * @author Looney
 */
public class ButtonPanel extends JPanel implements ActionListener{
    private static ButtonPanel inst;
    public static JColorChooser newcolor;
   
    
    ButtonPanel()
    {
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(Color.GRAY);
        JButton oval = new JButton("Oval");
        JButton rect = new JButton("Rectangle");
        JButton foval = new JButton("FillOval");
        JButton frect = new JButton("FillRectangle");
        JButton nline = new JButton("Line");
        JButton clear = new JButton("Clear");
        JButton color = new JButton("Set Color"); // add this
        oval.addActionListener(this);
        rect.addActionListener(this);
        foval.addActionListener(this);
        frect.addActionListener(this);
        nline.addActionListener(this);
        clear.addActionListener(this);
        color.addActionListener(this); // add this 
        add(oval);
        add(rect);
        add(foval);
        add(frect);
        add(nline);
        add(clear);
        add(color);		// add this 
    }
    
    public static ButtonPanel getInstance()
    {
        if(inst == null)
           inst =  new ButtonPanel();
        return inst;
    }
       public void actionPerformed(ActionEvent ae)
     {
         String button = ae.getActionCommand();
         if(button.equals("Oval"))
         {
             CanvasPanel.getInstance().setShape(GC.OVAL);
         }
         else if(button.equals("Rectangle"))
         {
             CanvasPanel.getInstance().setShape(GC.RECT);
         }
          else if(button.equals("FillOval"))
         {
             CanvasPanel.getInstance().setShape(GC.FILLOVAL);
         }
          else if(button.equals("FillRectangle"))
         {
             CanvasPanel.getInstance().setShape(GC.FILLRECT);
         }
          else if(button.equals("Line"))
          {
        	  CanvasPanel.getInstance().setShape(GC.LINE);
          }
          else if(button.equals("Clear"))
          {
              CanvasPanel.getInstance().clearButton();
          }
          else if(button.equals("Set Color")) // add this
          {
        	  ColorChooser.createGUI();
          }
         
     }  
}
