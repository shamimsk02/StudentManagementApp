package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao {
	public static boolean insertStudentToDb(Student st) {
		boolean f=false;
		try {
		Connection con=Cb.createC();
		String q="insert into students(sname,sphone,scity) values(?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(q);
		pstmt.setString(1,st.getStudent_name());
		pstmt.setString(2,st.getStudent_phone());
		pstmt.setString(3,st.getStudent_city());
		
		pstmt.executeUpdate();
		f=true;
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return f;
}
	
	public static boolean deleteStudent(int id) {
		boolean f=false;
		Connection con=Cb.createC();
		String q="delete from students where sid=?";
		try {
			PreparedStatement pstmt=con.prepareStatement(q);
			pstmt.setInt(1, id);
			
			
			pstmt.executeUpdate();
			f=true;
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return f;
	}

	public static void showAllStudents() {
		
		try {
		Connection con=Cb.createC();
		String q="select * from students";
		Statement stmt = con.createStatement();
		
		
		ResultSet set= stmt.executeQuery(q);
		
		while(set.next()) {
			int id=set.getInt(1);
			String name=set.getString(2);
			String phone=set.getString(3);
			String city=set.getString("scity");
			
			System.out.println("Id: "+id);
			System.out.println("Name: "+name);
			System.out.println("Phone: "+phone);
			System.out.println("City: "+city);
			System.out.println("========================");
		}
		
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}