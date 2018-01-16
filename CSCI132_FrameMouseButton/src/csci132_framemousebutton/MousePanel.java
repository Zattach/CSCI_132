/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package csci132_framemousebutton;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JPanel;
import java.awt.event.*;
import java.util.Random;

/**
 *
 * @author Ben Seal and Zach Domke
 */
public class MousePanel extends JPanel implements MouseListener{

    public static MousePanel inst;
    public static String flag;
    
    MousePanel()
    {
        setBackground(Color.WHITE);
        addMouseListener(this);
    }
    public static MousePanel getInstance()
    {
        if(inst == null)
            inst =  new MousePanel();
         return inst;
        
    }
    
    public static void getState(String inflag)
    {
    	flag = inflag;
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        System.out.println("called");
        Graphics2D g2 = (Graphics2D)g;
        Random x = new Random(System.currentTimeMillis());
        int x1 = x.nextInt(500);
        int y1 = x.nextInt(500);
        int x2 = x.nextInt(500);
        int y2 = x.nextInt(500);
        
        switch (flag){
        case "Line" : g2.drawLine(x1, y1, x2, y2);
        break;
        case "Empty Rectangle" : g2.drawRect(x1, y1, x2, y2);
        break;
        case "Filled Rectangle" : g2.drawRect(x1, y1, x2, y2);
        			 g2.fillRect(x1, y1, x2, y2);
        break;
        case "Empty Oval" : g2.drawOval(x1, y1, x2, y2);
        break;
        case "Filled Oval" : g2.drawOval(x1, y1, x2, y2);
        			 g2.fillOval(x1, y1, x2, y2);
        break;
        case "Clear" : g2.dispose();
        break;
        default : System.out.println("Try Again");
		MyFrame.getInstance();
        break;
        } 
    }

    public void mouseExited(MouseEvent e){ }
    public void mouseEntered(MouseEvent e){}
    public void mouseClicked(MouseEvent e){ 
         System.out.println("yelp");
         repaint();
    }
    public void mousePressed(MouseEvent e){}
    public void mouseReleased(MouseEvent e){}

}
