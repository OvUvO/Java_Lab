package com.nice.haha;

import javax.swing.*;

public class eventH {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Example");
            JButton button = new JButton("Click Me");

            button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button Clicked!"));

            frame.add(button);
            frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }

}

class Student extends eventH {
	
	public Student(){
		
		
	}
}


