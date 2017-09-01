import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class buttons implements ActionListener {
 public static void main(String[] args) {
	 JFrame frame = new JFrame();
	 JPanel panel = new JPanel();
	JButton Button = new JButton();
	
	new buttons();
}
 public buttons() {
	 JFrame frame = new JFrame();
	 JPanel panel = new JPanel();
	JButton Button = new JButton();
	 frame.add(panel);
		frame.setVisible(true);
		panel.add(Button);
		frame.pack();
		panel.setVisible(true);
		Button.addActionListener(this);
	 
 }
 JFrame frame = new JFrame();
 JPanel panel = new JPanel();
JButton Button = new JButton();
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	System.out.println("don't click me so hard please.");
}
}
