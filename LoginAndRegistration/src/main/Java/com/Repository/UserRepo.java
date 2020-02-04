package com.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Config.DBConfig;
import com.Model.User;

public class UserRepo {

	DBConfig config = new DBConfig();

	public boolean validateUser(String email, String pass) {
		boolean st = false;

		try {
			Class.forName(config.getDRIVER());
			Connection con = DriverManager.getConnection(config.getCONNECTION_URL(), config.getDbusername(),
					config.getDBUSERPASS());
			PreparedStatement ps = con.prepareStatement(config.getFindUserByEmailAndPass());
			ps.setString(1, email);
			ps.setString(2, pass);
			ResultSet rs = ps.executeQuery();
			st = rs.next();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return st;
	}

	public boolean register(User user) {
		try {
			Class.forName(config.getDRIVER());
			Connection con = DriverManager.getConnection(config.getCONNECTION_URL(), config.getDbusername(),
					config.getDBUSERPASS());
			PreparedStatement pstmt = con.prepareStatement(config.getInsertQuery());
			pstmt.setString(1, user.getFirstname());
			pstmt.setString(2, user.getLastname());
			pstmt.setString(3, user.getDob());
			pstmt.setString(4, user.getAddress());
			pstmt.setString(5, user.getEmail());
			pstmt.setString(6, user.getZip());
			pstmt.setString(7, user.getPassword());
			pstmt.setString(8, user.getPhoneno());
			
			return pstmt.executeUpdate() > 0;
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

		return false;

	}
}
