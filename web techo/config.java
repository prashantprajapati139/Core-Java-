package com.assign;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class ConfigDemoServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        
        message = config.getInitParameter("message");
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>ConfigDemoServlet</title></head>");
        out.println("<body>");
        out.println("<h2>" + message + "</h2>");
        out.println("</body></html>");
    }
}
// xml mapping 
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee" xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd" id="WebApp_ID" version="4.0">
  <display-name>WEB</display-name>
  
  
     <servlet>
    <servlet-name>ConfigDemoServlet</servlet-name>
    <servlet-class>com.assign.ConfigDemoServlet</servlet-class>
    <init-param>
        <param-name>message</param-name>
        <param-value>Hello from web xml file </param-value>
    </init-param>
</servlet>

<servlet-mapping>
    <servlet-name>ConfigDemoServlet</servlet-name>
    <url-pattern>/configDemo</url-pattern>
</servlet-mapping>
  
  
  
  
</web-app>

