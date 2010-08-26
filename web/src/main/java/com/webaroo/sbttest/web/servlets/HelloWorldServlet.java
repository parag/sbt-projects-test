package com.webaroo.sbttest.web.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloWorldServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        resp.setContentType("text/html"); 
        PrintWriter pw = resp.getWriter();
        pw.write("<html>\n");
        pw.write("<head><title>Initialize AWS </title></head>\n");
        pw.write("<body><center>");
        pw.write("<h1>Set AWS access credential</h1>");
        pw.write("<div>");
        pw.write("<form method=post><input type=text name=passkey /><br/>");
        pw.write("<input type=submit value=Submit /> </form>");
        pw.write("</div");
        pw.write("</center></body>");
        pw.write("</html>");
    }
	
}
