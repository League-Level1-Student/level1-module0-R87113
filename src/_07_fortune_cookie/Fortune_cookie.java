package _07_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
 
	

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
	public void actionPerformed(ßßßßActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
