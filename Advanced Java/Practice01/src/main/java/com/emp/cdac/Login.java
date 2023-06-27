package com.emp.cdac;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection conn;
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/advjava", "root", "cdac");
			
			String email = request.getParameter("email");
			String pswd = request.getParameter("pswd");
			
			String sql = "SELECT * FROM EMPLOYEE WHERE email = ?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, email);

			ResultSet rs = pst.executeQuery();
			
			if(rs.next() && rs.getString("pswd").equals(pswd)) {
				out.write("<h1> Welcome ! <h1>");
			} else {
				out.write("<h1> Sorry Invalid details ! <h1>");
			}
			
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
