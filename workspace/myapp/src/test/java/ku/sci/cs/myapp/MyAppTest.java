package ku.sci.cs.myapp;

import static org.junit.Assert.*;



import org.junit.Test;

import model.Calendar;

public class MyAppTest {

	
	@Test
	public void testAdd() {
		Calendar cal =new Calendar();
		cal.save( "1/1/2017","ABCDEFG");
//		System.out.println(cal.getListtime());
//		System.out.println(cal.getListstr());
		assertEquals(cal.getListtime().get(0), "1/1/2017");
		assertEquals(cal.getListstr().get(0), "ABCDEFG");

		
	}
	
	
	@Test
	public void testDel() {
		Calendar cal =new Calendar();
		cal.save( "1/1/2017","ABCDEFG");
		cal.delete(0);
		assertEquals(cal.getListtime().size(), 0);
		assertEquals(cal.getListtime().size(), 0);
		
	}
	
	@Test
	public void testEddit() {
		Calendar cal =new Calendar();
		cal.save( "1/1/2017","ABCDEFG");
		cal.edit(0, "1/1/2017", "123");
		assertEquals(cal.getListtime().get(0), "1/1/2017");
		assertEquals(cal.getListstr().get(0), "123");
		
	}
	
	
	
	
	
	

}
