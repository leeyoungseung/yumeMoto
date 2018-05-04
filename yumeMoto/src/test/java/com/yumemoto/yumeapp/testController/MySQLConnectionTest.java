package com.yumemoto.yumeapp.testController;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {

	private static final String DRIVER =
			"com.mysql.jdbc.Driver";
	private static final String URL =
			"jdbc:mysql://127.0.0.1:3309/momo_ex";
	private static final String USER =
			"zerock";
	private static final String PW =
			"zerock";
	@Test
	public void testConnnection() throws Exception{
		Class.forName(DRIVER);
		
		try(Connection con = DriverManager.getConnection(URL, USER, PW)){
			System.out.println("------------------------------------------------------------");
			System.out.println("success connection");
			System.out.println("------------------------------------------------------------");
			System.err.println(con);
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("------------------------------------------------------------");
			System.out.println("fail");
			System.out.println("------------------------------------------------------------");
		}
	}
}
