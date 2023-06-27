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
 * Servlet implementation class Editreturn
 */
@WebServlet("/Editreturn")
public class Editreturn extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection conn;
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/advjava", "root", "cdac");
			int id = Integer.parseInt(request.getParameter("id"));
			String sql = "SELECT * FROM EMPLOYEE WHERE id = ?"; 
			PreparedStatement pst = conn.prepareStatement(sql);
			pst.setInt(1, id);
			ResultSet rs = pst.executeQuery();
			
			out.write("<html><head>");
			out.write("<title>Edit Employee</title>");
			out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">");
			out.write("</head><body>");
			
			while(rs.next()) {
				out.write("<div class=\"container\">");
				out.write("<h1 class=\"text-center\">Edit Employee</h1>");

				out.write("<form action='EditServlet' method='POST'>");
				out.write("<div class=\"mb-3\">");
				out.write("<input type='hidden' name='id' value='" + rs.getString("id") + "'>");
				out.write("</div>");
				out.write("<div class=\"mb-3\">");
				out.write("<label for='name' class='form-label'>Name:</label>");
				out.write("<input type='text' class='form-control' id='name' name='name' value='" + rs.getString("name") + "' required>");
				out.write("</div>");
				out.write("<div class=\"mb-3\">");
				out.write("<label for='email' class='form-label'>Email:</label>");
				out.write("<input type='email' class='form-control' id='email' name='email' value='" + rs.getString("email") + "'> required");
				out.write("</div>");
				out.write("<div class=\"mb-3\">");
				out.write("<label for='password' class='form-label'>Password:</label>");
				out.write("<input type='password' class='form-control' id='password' name='pswd' value='" + rs.getString("pswd") + "'> required");
				out.write("</div>");
				out.write("<button type='submit' class='btn btn-primary'>Edit</button>");
				out.write("</form>");

				out.write("</div>");
			}
			
			out.write("</body></html>");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
