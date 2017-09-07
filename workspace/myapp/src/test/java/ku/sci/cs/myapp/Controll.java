package ku.sci.cs.myapp;
import javax.swing.JButton;

import controll.JdbcSQLiteConnection;
import model.Calendar;
import view.View;

public class Controll {
	
	public void startApp(){
		JdbcSQLiteConnection db= new JdbcSQLiteConnection();
		Calendar cal= new Calendar();
		View view= new View(cal);
		view.loadSave();
		Action act=new Action(view,cal ,db);
		view.getComboBox().addActionListener(act);
	
		view.getBtnNote().addActionListener(act);
		for (int i=0;i<view.getListday().size();i++){
			view.getListday().get(i).addActionListener(act);
		}

		
	}

}
