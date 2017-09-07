package ku.sci.cs.myapp;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import controll.JdbcSQLiteConnection;
import model.Calendar;
import view.View;
import view.View2;
import view.View3;

public class Action implements ActionListener {
	private View view;
	private Calendar cal;
	JdbcSQLiteConnection db;
	public Action(View view, Calendar cal,JdbcSQLiteConnection db) {
		this.view = view;
		this.cal = cal;
		this.db=db;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src.equals(view.getBtnNote())){

			if (cal.getListtime().size()>0){
			view.getFrame().remove(view.getBtnNote());
			view.getFrame().add(view.getCombotime());
			view.getCombotime().addActionListener(this);
			view.getFrame().repaint();
			}else{
				JOptionPane.showMessageDialog(null, "Find note not found");
			}
			
		}
		
		if (view.getComboBox().getSelectedItem().equals("January")) {
			view.getPanel().removeAll();

			for (int i = 1; i < 32; i++) {

				view.getPanel().add(view.getListday().get(i - 1));
			}
			view.getDay1().setText("Sunday");
			view.getDay2().setText("Monday");
			view.getDay3().setText("Tuesday");
			view.getDay4().setText("Wednesday");
			view.getDay5().setText("Thursday");
			view.getDay6().setText("Friday");
			view.getDay7().setText("Saturday");

			view.getPanel().updateUI();

		}
		if (view.getComboBox().getSelectedItem().equals("February")) {
			view.getPanel().removeAll();
			ArrayList<JButton> listday = new ArrayList<>();
			for (int i = 1; i < 32; i++) {
				if (i <= 28) {
					view.getPanel().add(view.getListday().get(i - 1));
				} else {
					view.getPanel().add(new JLabel(""));
				}
			}
			view.getDay1().setText("Wednesday");
			view.getDay2().setText("Thursday");
			view.getDay3().setText("Friday");
			view.getDay4().setText("Saturday");
			view.getDay5().setText("Sunday");
			view.getDay6().setText("Monday");
			view.getDay7().setText("Tuesday");

			view.getPanel().updateUI();

		}
		if (view.getComboBox().getSelectedItem().equals("March")) {
			view.getPanel().removeAll();
			ArrayList<JButton> listday = new ArrayList<>();
			for (int i = 1; i < 32; i++) {
				view.getPanel().add(view.getListday().get(i - 1));
			}
			view.getDay1().setText("Wednesday");
			view.getDay2().setText("Thursday");
			view.getDay3().setText("Friday");
			view.getDay4().setText("Saturday");
			view.getDay5().setText("Sunday");
			view.getDay6().setText("Monday");
			view.getDay7().setText("Tuesday");
			view.getPanel().updateUI();

		}
		if (view.getComboBox().getSelectedItem().equals("April")) {
			view.getPanel().removeAll();
			ArrayList<JButton> listday = new ArrayList<>();
			for (int i = 1; i < 32; i++) {
				if (i <= 30) {
					view.getPanel().add(view.getListday().get(i - 1));
				} else {
					view.getPanel().add(new JLabel(""));
				}
			}
			view.getDay1().setText("Saturday");
			view.getDay2().setText("Sunday");
			view.getDay3().setText("Monday");
			view.getDay4().setText("Tuesday");
			view.getDay5().setText("Wednesday");
			view.getDay6().setText("Thursday");
			view.getDay7().setText("Friday");

			view.getPanel().updateUI();

		}
		if (view.getComboBox().getSelectedItem().equals("May")) {
			view.getPanel().removeAll();
			ArrayList<JButton> listday = new ArrayList<>();
			for (int i = 1; i < 32; i++) {
				view.getPanel().add(view.getListday().get(i - 1));
			}
			view.getDay1().setText("Monday");
			view.getDay2().setText("Tuesday");
			view.getDay3().setText("Wednesday");
			view.getDay4().setText("Thursday");
			view.getDay5().setText("Friday");
			view.getDay6().setText("Saturday");
			view.getDay7().setText("Sunday");

			view.getPanel().updateUI();

		}
		if (view.getComboBox().getSelectedItem().equals("June")) {
			view.getPanel().removeAll();
			ArrayList<JButton> listday = new ArrayList<>();
			for (int i = 1; i < 32; i++) {
				if (i <= 30) {
					view.getPanel().add(view.getListday().get(i - 1));
				} else {
					view.getPanel().add(new JLabel(""));
				}
			}
			view.getDay1().setText("Thursday");
			view.getDay2().setText("Friday");
			view.getDay3().setText("Saturday");
			view.getDay4().setText("Sunday");
			view.getDay5().setText("Monday");
			view.getDay6().setText("Tuesday");
			view.getDay7().setText("Wednesday");

			view.getPanel().updateUI();

		}
		if (view.getComboBox().getSelectedItem().equals("July")) {
			view.getPanel().removeAll();
			ArrayList<JButton> listday = new ArrayList<>();
			for (int i = 1; i < 32; i++) {
				view.getPanel().add(view.getListday().get(i - 1));
			}
			view.getDay1().setText("Saturday");
			view.getDay2().setText("Sunday");
			view.getDay3().setText("Monday");
			view.getDay4().setText("Tuesday");
			view.getDay5().setText("Wednesday");
			view.getDay6().setText("Thursday");
			view.getDay7().setText("Friday");

			view.getPanel().updateUI();

		}
		if (view.getComboBox().getSelectedItem().equals("August")) {
			view.getPanel().removeAll();
			ArrayList<JButton> listday = new ArrayList<>();
			for (int i = 1; i < 32; i++) {
				view.getPanel().add(view.getListday().get(i - 1));
			}
			view.getDay1().setText("Tuesday");
			view.getDay2().setText("Wednesday");
			view.getDay3().setText("Thursday");
			view.getDay4().setText("Friday");
			view.getDay5().setText("Saturday");
			view.getDay6().setText("Sunday");
			view.getDay7().setText("Monday");

			view.getPanel().updateUI();

		}
		if (view.getComboBox().getSelectedItem().equals("September")) {
			view.getPanel().removeAll();
			ArrayList<JButton> listday = new ArrayList<>();
			for (int i = 1; i < 32; i++) {
				if (i <= 30) {
					view.getPanel().add(view.getListday().get(i - 1));
				} else {
					view.getPanel().add(new JLabel(""));
				}
			}
			view.getDay1().setText("Friday");
			view.getDay2().setText("Saturday");
			view.getDay3().setText("Sunday");
			view.getDay4().setText("Monday");
			view.getDay5().setText("Tuesday");
			view.getDay6().setText("Wednesday");
			view.getDay7().setText("Thursday");

			view.getPanel().updateUI();

		}
		if (view.getComboBox().getSelectedItem().equals("October")) {
			view.getPanel().removeAll();
			ArrayList<JButton> listday = new ArrayList<>();
			for (int i = 1; i < 32; i++) {
				view.getPanel().add(view.getListday().get(i - 1));
			}
			view.getDay1().setText("Sunday");
			view.getDay2().setText("Monday");
			view.getDay3().setText("Tuesday");
			view.getDay4().setText("Wednesday");
			view.getDay5().setText("Thursday");
			view.getDay6().setText("Friday");
			view.getDay7().setText("Saturday");

			view.getPanel().updateUI();

		}

		if (view.getComboBox().getSelectedItem().equals("November")) {
			view.getPanel().removeAll();
			ArrayList<JButton> listday = new ArrayList<>();
			for (int i = 1; i < 32; i++) {
				if (i <= 30) {
					view.getPanel().add(view.getListday().get(i - 1));
				} else {
					view.getPanel().add(new JLabel(""));
				}
			}
			view.getDay1().setText("Wednesday");
			view.getDay2().setText("Thursday");
			view.getDay3().setText("Friday");
			view.getDay4().setText("Saturday");
			view.getDay5().setText("Sunday");
			view.getDay6().setText("Monday");
			view.getDay7().setText("Tuesday");

			view.getPanel().updateUI();
		}
		if (view.getComboBox().getSelectedItem().equals("December")) {

			view.getPanel().removeAll();
			ArrayList<JButton> listday = new ArrayList<>();
			for (int i = 1; i < 32; i++) {
				view.getPanel().add(view.getListday().get(i - 1));
			}
			view.getDay1().setText("Friday");
			view.getDay2().setText("Saturday");
			view.getDay3().setText("Monday");
			view.getDay4().setText("Monday");
			view.getDay5().setText("Tuesday");
			view.getDay6().setText("Wednesday");
			view.getDay7().setText("Thursday");

			view.getPanel().updateUI();
		}

		if (src.equals(view.getCombotime())) {
	
		
			if (cal.getListtime().contains(view.getCombotime().getSelectedItem()) ) {

				
				View3 view3 = new View3();	
				view3.getArea().setText(cal.getListstr().get(view.getCombotime().getSelectedIndex()-1));
				Action3 act3 = new Action3(cal, view3,(String) view.getCombotime().getSelectedItem(),view,this);
				
				view3.getDelete().addActionListener(act3);
				view3.getCancel().addActionListener(act3);
				view3.getSave().addActionListener(act3);
				

			}
	

		}
		

		for (

		int i = 0; i < 31; i++) {
			if (src.equals(view.getListday().get(i))) {
			
				String str = (i + 1) + "/" + (String) view.getComboBox().getSelectedItem() + "/2017";
				View2 view2 = new View2();
				Action2 act2 = new Action2(view2, cal, str, view,db);
				
				view2.getSave().addActionListener(act2);
				view2.getCancel().addActionListener(act2);
			}
		}
	}

}
