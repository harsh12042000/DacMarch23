package com.emp.cdac;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EditServlet
 */
@WebServlet("/EditServlet")
public class EditServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
Connection conn;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/advjava", "root", "cdac");
			
			String name = request.getParameter("name");
			String email = request.getParameter("email");
			String pswd = request.getParameter("pswd");
			int id = Integer.parseInt(request.getParameter("id"));
			
			String sql = "UPDATE EMPLOYEE SET name=?, email=?, pswd=? WHERE id=?";
			PreparedStatement pst = conn.prepareStatement(sql);
			
			pst.setString(1, name);
			pst.setString(2, email);
			pst.setString(3, pswd);
			pst.setInt(4,  id);
			
			pst.executeUpdate();
			
			PrintWriter out = response.getWriter();
			response.sendRedirect("viewemployee?q=edited");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
