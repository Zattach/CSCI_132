package paintleveloneexamplehelp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MenuBar extends JMenuBar implements ActionListener{
	private static MenuBar inst;
	private static JFrame aboutFrame;
	
	JMenu file, view, help;
	JMenuItem save, exit, about;
	
	MenuBar(){
		file = new JMenu("File");
		view = new JMenu("View");
		help = new JMenu("Help");
		save = new JMenuItem("Save");
		exit = new JMenuItem("Exit");
		about = new JMenuItem("About");
		save.addActionListener(this);
		exit.addActionListener(this);
		about.addActionListener(this);
		add(file);
		add(view);
		file.add(save);
		file.add(exit);
		add(help);
		help.add(about);
		
	}
	
	public void actionPerformed(ActionEvent ae)
    {
		String button = ae.getActionCommand();
        if(button.equals("Save")){
        } else if(button.equals("Exit")){
        	System.exit(0);
        } else if(button.equals("About")){
        	aboutFrame = new JFrame("About");
        	aboutFrame.setSize(300,200);
        	aboutFrame.setLocation(600,300);
        	aboutFrame.setVisible(true);
        }
    }
	
	public static MenuBar getInstance()
    {
        if(inst == null)
           inst =  new MenuBar();
        return inst;
    }
}
