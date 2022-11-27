package com.rar.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;


import com.rar.service.Menu;

public class RARDB {
	
	private static String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private static String user = "system";
	private static String pass = "root";
	private static String driver = "oracle.jdbc.driver.OracleDriver";
	
	public int login(String tname , String tpass) {
		String sql;
		PreparedStatement stm = null;
		Connection con = null;
		Statement stmt = null;
		String user_id;
		String pas = null;
		String name = null;
		ResultSet rs = null;
		int b = 0;
		
		try {

			Class.forName(driver);

			con = DriverManager.getConnection(url, user, pass);

			stmt = con.createStatement();
			
			sql = "select  tpass , tnum  from tlogin where tnum = ? ";
			stm = con.prepareStatement(sql);
			stm.setString(1,tname);
			rs= stm.executeQuery();
			if (rs.next() == false) {
			       b=1;
			      } else {
			    	  
			        do {
			        	pas = rs.getString(1);
						name = rs.getString(2);
			        } while (rs.next());
			     }
			if (pas.equals(tpass)) {
				//Menu m = new Menu();
				//n.setVisible(false);
				//JOptionPane.showMessageDialog(null, "Welcome  " + name);
				Menu tm = new Menu(name);
				//Menu_Page r = new Menu_Page(email);
				tm.setVisible(true);
//				if(tm.isVisible()==true) {
//					n.setVisible(false);
//				}
			} else {
				// JOptionPane.showMessageDialog(null, "Enter valid User Id And Pass");
				b = 2;
			}

			
		} catch(NumberFormatException e) {
			
			JOptionPane.showMessageDialog(null, "Enter Password");
		}
		catch (Exception e) {
			
		}
		return b;
	}

}
