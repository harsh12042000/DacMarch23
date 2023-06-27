package com.emp.cdac;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ViewEmployee
 */
@WebServlet("/viewemployee")
public class ViewEmployee extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Connection conn;

		PrintWriter out = response.getWriter();
		out.write("<html><head>");
		out.write(
				"<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\">");
		out.write("</head><body>");
		out.write("<div class=\"container\">"); 
		out.write("<h1 class=\"text-center\">Employee List</h1>");
		out.write("<h3><a href='login.jsp'>Login</a></h3>");

		if (request.getParameter("q") != null && request.getParameter("q").equals("added")) {
			out.write("<script>");
			out.write("setTimeout(function() {");
			out.write("  var messageElement = document.getElementById('message');");
			out.write("  messageElement.style.display = 'none';");
			out.write("}, 4500);");
			out.write("</script>");
			out.write("<h2 id='message' class='text-danger text-center'>Record Successfully Added !</h2>");

		} else if (request.getParameter("q") != null && request.getParameter("q").equals("edited")) {
			out.write("<script>");
			out.write("setTimeout(function() {");
			out.write("  var messageElement = document.getElementById('message');");
			out.write("  messageElement.style.display = 'none';");
			out.write("}, 4500);");
			out.write("</script>");
			out.write("<h2 id='message' class='text-danger text-center'>Record Successfully Updated !</h2>");

		} else if (request.getParameter("q") != null && request.getParameter("q").equals("deleted")) {
			out.write("<script>");
			out.write("setTimeout(function() {");
			out.write("  var messageElement = document.getElementById('message');");
			out.write("  messageElement.style.display = 'none';");
			out.write("}, 4500);");
			out.write("</script>");
			out.write("<h2 id='message' class='text-danger text-center'>Record Deleted !</h2>");

		}

		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/advjava", "root", "cdac");
			String sql = "SELECT * FROM EMPLOYEE";
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);

			out.write("<a class=\"btn btn-primary mb-3\" href=\"Home.jsp\">Add New Employee</a>");
			out.write("<table class=\"table\">");
			out.write("<thead>");
			out.write("<tr>");
			out.write("<th scope=\"col\">ID</th>");
			out.write("<th scope=\"col\">Name</th>");
			out.write("<th scope=\"col\">Email</th>");
			out.write("<th scope=\"col\">Edit</th>");
			out.write("<th scope=\"col\">Delete</th>");
			out.write("</tr>");
			out.write("</thead>");
			out.write("<tbody>");

			while (rs.next()) {
				out.write("<tr>");
				out.write("<td>" + rs.getInt("id") + "</td>");
				out.write("<td>" + rs.getString("name") + "</td>");
				out.write("<td>" + rs.getString("email") + "</td>");
				out.write("<td><a class=\"btn btn-primary\" href='Editreturn?id=" + rs.getInt("id") + "'>Edit</a></td>");
				out.write("<td><a class=\"btn btn-danger\" href='Delete?id=" + rs.getInt("id") + "'>Delete</a></td>");
				out.write("</tr>");
			}
			out.write("</tbody>");
			out.write("</table>");
			out.write("</div>"); 
			out.write("</body></html>");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

}
