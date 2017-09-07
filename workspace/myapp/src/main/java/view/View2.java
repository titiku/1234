package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import controll.Action;
import controll.Action2;
import model.Calendar;

public class View2 {

	private JButton save;
	private JTextArea area;
	
	private JFrame frame2;
	JButton cancel;

	public View2() {

		frame2 = new JFrame();
		frame2.setPreferredSize(new Dimension(500, 400));
		frame2.setVisible(true);
		frame2.setLayout(new GridLayout(2, 0, 50, 50));
		area = new JTextArea();
		JScrollPane pane = new JScrollPane(area);
		JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());

		frame2.add(pane);
		frame2.add(panel2);
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		 save = new JButton("Save");
		 cancel = new JButton("Cancel");
		panel2.add(save);
		panel2.add(cancel);
		

		frame2.pack();
	}
	public JButton getCancel() {
		return cancel;
	}
	public JButton getSave() {
		return save;
	}
	public JTextArea getArea() {
		return area;
	}
	public JFrame getFrame2() {
		return frame2;
	}

}
