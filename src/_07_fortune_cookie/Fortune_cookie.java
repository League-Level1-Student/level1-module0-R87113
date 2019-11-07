package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
 
	

public class Fortune_cookie implements ActionListener{
    public void showButton() {
        System.out.println("Button clicked");
  
    JFrame Frame = new JFrame();
    Frame.setVisible(true);
    JButton button = new JButton();
    Frame.add(button);
    Frame.pack();
    button.addActionListener(this);
}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int rand = new Random().nextInt(5);
	if(rand == 1) {
		JOptionPane.showMessageDialog(null, "You were born at a very early age");
	}
	if(rand == 2) {
		JOptionPane.showMessageDialog(null, "You will breathe within the next year");
	}
	if(rand == 3) {
		JOptionPane.showMessageDialog(null, "You have existed for as long as you have lived");
	}
	if(rand == 4) {
		JOptionPane.showMessageDialog(null, "You can see if you can read this");
	}
	}
    }
