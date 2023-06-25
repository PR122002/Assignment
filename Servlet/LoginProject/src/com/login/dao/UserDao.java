package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {

	String url="jdbc:mysql://localhost:3306/USER_DATA";
	String usernameDB="root";
	String passwordDB="prium12345";
	String loginSql="SELECT * FROM Login WHERE USERNAME=? AND PASSWORD=?;";
	String userExists="SELECT * FROM Login WHERE USERNAME=?;";
	String registerSql="INSERT INTO Login(USERNAME,PASSWORD) VALUES(?,?);";
	
	public String checkDetails(String username,String password) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,usernameDB,passwordDB);
			PreparedStatement st=con.prepareStatement(loginSql);
			PreparedStatement st1=con.prepareStatement(userExists);
			st1.setString(1, username);
			st.setString(1, username);
			st.setString(2, password);
			ResultSet rs=st.executeQuery();
			ResultSet rs1=st1.executeQuery();
			if(rs.next() && rs1.next()) {
				return "true";
			}
			if(rs1.next())
				return "Incorrect Password";
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "User does not exist";
	}
	
	public String registerUser(String username,String password) {
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection(url,usernameDB,passwordDB);
			PreparedStatement st=con.prepareStatement(registerSql);
			PreparedStatement st1=con.prepareStatement(userExists);
			st1.setString(1, username);
			st.setString(1,username);
			st.setString(2,password);
			ResultSet rs=st1.executeQuery();
			if(rs.next())
				return "User already exists";
			st.executeUpdate();
			return "Registration Successful";
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return "false";
	}
}
