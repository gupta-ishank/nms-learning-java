import java.awt.*;
import java.awt.Button ;
import java.awt.color.*;
import java.awt.FlowLayout ;
import java.awt.Frame ;
import java.awt.event.*;


public class AWT_C extends Frame implements ActionListener {
	
	Button b ,c ;
	AWT_C() {
	 setSize(400,400);
	 setLayout(new FlowLayout());
	 setVisible(true);
	 
	 b = new Button("Red");
	 b.addActionListener(this);
	 add(b) ;
	 c= new Button("Blue");
	 add(c);
	 c.addActionListener(this);
	 
	 addWindowListener(new WindowAdapter() {
		 public void windowClosing(WindowEvent we) {
			 System.exit(0);
			 
		 }
	 });
	 
	}
	
	public static void main(String args[]) {
		AWT_C a = new AWT_C () ;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==b) {
			setBackground(Color.red);
			b.setBackground(Color.red);
			b.setForeground(Color.blue);
			
		}
		
		else if(e.getSource()== c) {
			setBackground(Color.blue);
			c.setBackground(Color.blue);
			c.setForeground(Color.red);
		}
 
	}

}
