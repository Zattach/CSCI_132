/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package csci132_framemousebutton;

import java.awt.Color;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Ben Seal and Zach Domke
 */
public class ButtonPanel extends JPanel implements ActionListener {

    public static ButtonPanel inst;
    private JButton frect;
    private JButton erect;
    private JButton foval;
    private JButton eoval;
    private JButton nline;
    private JButton clear;
    public static String state;

    ButtonPanel()
    {
        setBackground(Color.GRAY);
        frect = new JButton("Filled Rectangle");
        frect.addActionListener(this);
        add(frect);
        erect = new JButton("Empty Rectangle");
        erect.addActionListener(this);
        add(erect);
        foval = new JButton("Filled Oval");
        foval.addActionListener(this);
        add(foval);
        eoval = new JButton("Empty Oval");
        eoval.addActionListener(this);
        add(eoval);
        nline = new JButton("Line");
        nline.addActionListener(this);
        add(nline);
        clear = new JButton("Clear");
        clear.addActionListener(this);
        add(clear);
    }
     public static ButtonPanel getInstance()
    {
        if(inst == null)
           inst =  new ButtonPanel();
        return inst;
    }

     public static String setState(String inState){
    	 state = inState;
    	 return state;
     }
     
     public void actionPerformed(ActionEvent ae)
     {
         System.out.println(ae.getActionCommand());
         setState(ae.getActionCommand());
         MousePanel.getState(state);
         MousePanel.getInstance().repaint();
     }
     
}
