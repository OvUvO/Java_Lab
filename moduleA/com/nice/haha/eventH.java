package com.nice.haha;

import javax.swing.*;
import java.awt.*;

public class eventH {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Example");
            JButton button = new JButton("Click Me");

            // 事件监听器
            button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button Clicked!"));

            frame.add(button);
            frame.setSize(300, 200);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }

}


