/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2018-10-23 17:39:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class student_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<head>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write(".blue-button{\r\n");
      out.write(" background: #25A6E1;\r\n");
      out.write(" filter: progid: DXImageTransform.Microsoft.gradient( startColorstr='#25A6E1',endColorstr='#188BC0',GradientType=0);\r\n");
      out.write(" padding:3px 5px;\r\n");
      out.write(" color:#fff;\r\n");
      out.write(" font-family:'Helvetica Neue',sans-serif;\r\n");
      out.write(" font-size:12px;\r\n");
      out.write(" border-radius:2px;\r\n");
      out.write(" -moz-border-radius:2px;\r\n");
      out.write(" -webkit-border-radius:4px;\r\n");
      out.write(" border:1px solid #1A87B9\r\n");
      out.write("}\r\n");
      out.write("table {\r\n");
      out.write("  font-family: \"Helvetica Neue\", Helvetica, sans-serif;\r\n");
      out.write("   width: 50%;\r\n");
      out.write("}\r\n");
      out.write("th {\r\n");
      out.write("  background: SteelBlue;\r\n");
      out.write("  color: white;\r\n");
      out.write("}\r\n");
      out.write(" td,th{\r\n");
      out.write("                border: 1px solid gray;\r\n");
      out.write("                width: 25%;\r\n");
      out.write("                text-align: left;\r\n");
      out.write("                padding: 5px 10px;\r\n");
      out.write("            }\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<form action=\"addStudent\" method=\"post\">\r\n");
      out.write("\r\n");
      out.write("<table>\r\n");
      out.write("  <tr>\r\n");
      out.write("   <th colspan=\"2\">Add Student</th>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("   <td>Country</td>\r\n");
      out.write("   <td><input type=\"text\" name=name></td>\r\n");
      out.write("  </tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("   <td>Population</td>\r\n");
      out.write("   <td><input type=\"text\" name=age>\r\n");
      out.write("  </td></tr>\r\n");
      out.write("  <tr>\r\n");
      out.write("   <td colspan=\"2\"><input type=\"submit\"\r\n");
      out.write("    class=\"blue-button\" /></td>\r\n");
      out.write("  </tr>\r\n");
      out.write(" </table>\r\n");
      out.write("\r\n");
      out.write("</form>\r\n");
      out.write("</body>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}