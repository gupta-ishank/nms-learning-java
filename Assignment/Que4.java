package Assignment;

import javax.swing.JButton;

public class Que4 {
	public static void main( String arg[] ) {
		JButton button = new JButton() ;
		String name = button.getClass().getName() ;
		System.out.println( name.substring(12) ) ;
		name = button.getClass().getSuperclass().getName();
		System.out.println( name.substring(12) ) ;
	}
}
