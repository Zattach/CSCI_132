/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package paintleveloneexamplehelp;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

/**
 *
 * @author Looney
 */

public class CanvasPanel extends JPanel{
    private static CanvasPanel inst;
    BufferedImage grid;
    Graphics2D gc;
    int x = 50;
    int startX = 0; int startY = 0; int width = 0; int height = 0;
    int shape = 0;
   
    public CanvasPanel()
    {
        addMouseListener(new MyMouseListener());
    }
     public static CanvasPanel getInstance()
    {
        if(inst == null)
           inst =  new CanvasPanel();
        return inst;
    }
     public void setShape(int x)
    {shape = x;}
     
     public void paintComponent(Graphics g)
    { 
         super.paintComponent(g);  
         Graphics2D g2 = (Graphics2D)g;
         if(grid == null){
            int w = this.getWidth();
            int h = this.getHeight();
            grid = (BufferedImage)(this.createImage(w,h));
            gc = grid.createGraphics();
         }
         g2.drawImage(grid, null, 0, 0);
         
    }
    
    
    public void draw()
    {
        
        gc.setColor(ColorChooser.getColor()); //add this
        switch(shape)
        {
            case GC.OVAL:
                gc.setColor(Color.red);
                gc.drawOval(startX, startY, width, height);
                break;
            case GC.RECT:
                gc.drawRect(startX, startY, width, height);
                break;
            case GC.FILLOVAL:
                gc.fillOval(startX, startY, width, height);
                break;
            case GC.FILLRECT:
                gc.fillRect(startX, startY, width, height);
                break;
            case GC.LINE:
            	gc.drawLine(startX, startY, width, height);
            default:
                
        }
        repaint();
    }
    
    public void clearButton(){ 
        grid = null;
        repaint();
    }
    
    public class MyMouseListener implements MouseListener{
    
    public void mouseExited(MouseEvent e){ }
    public void mouseEntered(MouseEvent e){}
    public void mouseClicked(MouseEvent e){ 
         
    }
    public void mousePressed(MouseEvent e){
          startX = e.getX();
          startY = e.getY();
         
    }
    public void mouseReleased(MouseEvent e){
        int endX = e.getX();
        int endY = e.getY();
        int temp;
        if(endX < startX)
        {
            if(endY < startY)
            {
                
                width = startX - endX;
                height = startY - endY;
                startX = endX;
                startY = endY;
                
            }
            else{
                width = startX - endX;
                height = endY - startY;
                startX = endX;
                
            }
        }
        else{
            if(endY < startY)
            {
               width = endX - startX;
               height = startY - endY;
               startY = endY;
            }
            else{
                
                width = endX -startX;
                height = endY - startY;
            }
        }
         draw();
   
     }
    }//end of Mouselistener class
}
