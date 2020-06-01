package com.hzit.dao;
/**
 * 
* Desction: 操作数据库
* @author Administrator
* @date 2020年5月25日
*
 */

import com.hzit.model.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;



public class DBUtil {
	
	private final static String URL = "jdbc:mysql://127.0.0.1:3306/student?useUnicode=yes&characterEncoding=UTF-8&serverTimezone=Europe/Moscow";
	private final static String USER = "root";
	private final static String PASSWORD = "123456";

	
	
	/**
	 * 加载驱动，获取链接
	 */
	public static Connection  getCon() {
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); //通过反射加载mysql的驱动，
			con = DriverManager.getConnection(URL, USER, PASSWORD);
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		
		return con;
	}
	
	
	/**
	 * 添加方法
	 * @return
	 * @throws SQLException 
	 */
	public int add(String sql , Student student) throws SQLException {
		
		Connection con = DBUtil.getCon();
		
		PreparedStatement pst = con.prepareStatement(sql);
		pst.setObject(1, student.getStuName());
		pst.setObject(2, student.getStuAge());
		pst.setObject(3, student.getStuSex());

		
		int rlt = pst.executeUpdate();
		
		
		return rlt;
	}
	
	
	
	
	

}
