package model;
import java.util.ArrayList;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;




public class Calendar {
	private ArrayList<String> listtime=new ArrayList<>();
	private ArrayList<String> liststr=new ArrayList<>();
	
	public Calendar(){
		
	}
	

	public ArrayList<String> getListtime() {
		return listtime;
	}

	public ArrayList<String> getListstr() {
		return liststr;
	}

	public void save(String time,String str){
		listtime.add(time);
		liststr.add(str);
	}
	public void delete(int index){
		liststr.remove(index);
		listtime.remove(index);
	}
	
	public void edit(int index,String time,String str){
		delete(index);
		save(time,str);
	}

	
	
}
