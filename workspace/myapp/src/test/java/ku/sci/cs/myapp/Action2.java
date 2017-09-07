package ku.sci.cs.myapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import controll.JdbcSQLiteConnection;
import model.Calendar;
import view.View;
import view.View2;

public class Action2 implements ActionListener {
	private View2 view2;
	private Calendar cal;
	private String str;
	private View view;
	JdbcSQLiteConnection db;

	public Action2(View2 view2, Calendar cal, String str, View view, JdbcSQLiteConnection db) {
		this.view2 = view2;
		this.cal = cal;
		this.str = str;
		this.view = view;
		this.db = db;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		if (src.equals(view2.getSave())) {

			if (cal.getListtime().contains(str)) {
				view2.getFrame2().setVisible(false);
				JOptionPane.showMessageDialog(null, "Error//There is date in this note.");
			} else {

				cal.save(str, view2.getArea().getText());
				view.getCombotime().addItem(str);
				view2.getFrame2().setVisible(false);

				try {
					Class.forName("org.sqlite.JDBC");
					String dbURL = "jdbc:sqlite:store.db";
					Connection conn = DriverManager.getConnection(dbURL);
					if (conn != null) {

						DatabaseMetaData dm = (DatabaseMetaData) conn.getMetaData();
						// String query = "insert into Calendar\nvalues
						// ('1134','155')";
						String query = "insert into Calendar\nvalues ('" + str + "','" + view2.getArea().getText()
								+ "')";

						Statement statement = conn.createStatement();
						statement.execute(query);

						conn.close();
					}

				} catch (ClassNotFoundException ex) {
					ex.printStackTrace();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}

			}
		}

		if (src.equals(view2.getCancel())) {
			System.out.println("ASAS");
			view2.getFrame2().setVisible(false);
		}

	}

}
