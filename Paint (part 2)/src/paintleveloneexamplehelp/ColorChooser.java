package paintleveloneexamplehelp;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class ColorChooser extends JPanel implements ChangeListener{  // add everything
	private JColorChooser var;
	public static Color newColor;
	
	public ColorChooser(){
		super(new BorderLayout());
		var = new JColorChooser();
		var.getSelectionModel().addChangeListener(this);
		var.setBorder(BorderFactory.createTitledBorder("Colors"));
		
		add(var, BorderLayout.PAGE_END);
	}
	
	public void stateChanged(ChangeEvent e){
		newColor = var.getColor();
		
	}
	
	public static void createGUI(){
		JFrame frame = new JFrame("Select A Color");
		JComponent newPane = new ColorChooser();
		newPane.setOpaque(true);
		frame.setContentPane(newPane);

    	frame.setLocation(600,300);
		frame.pack();
		frame.setVisible(true);
	}
	public static Color getColor(){
		return newColor;
	}
}
