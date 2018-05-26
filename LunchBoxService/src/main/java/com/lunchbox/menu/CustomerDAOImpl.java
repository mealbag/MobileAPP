package com.lunchbox.menu;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.stereotype.Component;

@Component
public class CustomerDAOImpl {

	private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	private static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/lunchboxdb?useSSL=false";
	private static final String DB_USER = "root";
	private static final String DB_PASSWORD = "admin";

	/*public static void main(String[] argv) {

		try {
			System.out.println(validateUser("sairam1", "sairam"));
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}*/

	public static boolean validateUser(String loginUserName, String password) throws SQLException {

		Connection dbConnection = null;
		PreparedStatement preparedStatement = null;
		boolean login = false;

		String selectSQL = "SELECT loginusername, password FROM customer WHERE (loginusername = ? and password = ?)";

		try {
			dbConnection = getDBConnection();
			preparedStatement = dbConnection.prepareStatement(selectSQL);
			preparedStatement.setString(1, loginUserName);
			preparedStatement.setString(2, password);
			// execute select SQL stetement
			ResultSet rs = preparedStatement.executeQuery();

			while (rs.next()) {
				String checkUser = rs.getString(1);
				String checkPass = rs.getString(2);

				System.out.println("loginusername : " + checkUser);
				System.out.println("password : " + checkPass);

				if ((checkUser.equalsIgnoreCase(loginUserName)) && (checkPass.equals(password))) {
					login = true;
				} else {
					login = false;
				}

			}
			/*
			 * while (rs.next()) {
			 * 
			 * String userid = rs.getString("loginusername"); String username =
			 * rs.getString("password");
			 * 
			 * System.out.println("loginusername : " + userid);
			 * System.out.println("password : " + username);
			 * 
			 * }
			 */
		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			if (preparedStatement != null) {
				preparedStatement.close();
			}
			if (dbConnection != null) {
				dbConnection.close();
			}
		}

		return login;

	}

	private static Connection getDBConnection() {

		Connection dbConnection = null;

		try {
			Class.forName(DB_DRIVER);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}

		try {
			dbConnection = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
			return dbConnection;
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return dbConnection;
	}

}
