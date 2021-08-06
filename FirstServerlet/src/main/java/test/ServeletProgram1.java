
package test;
import java.io.*;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;

import javax.servlet.ServletResponse;
import javax.servlet.*;
import javax.servlet.http.*;
@WebServlet("/pqr")//annotation
public class ServeletProgram1 extends HttpServlet
{
	public void init() {}
 public void service(ServletRequest req, ServletResponse res) 
		 throws IOException,ServletException{
    PrintWriter pw = res.getWriter();
    res.setContentType("text/html");
    pw.println("welcome to servlet programing ----");
 }
 public void destroy() {}
}


