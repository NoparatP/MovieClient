package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            p.sansserif {\n");
      out.write("                font-family: Arial, Helvetica, sans-serif;\n");
      out.write("            }\n");
      out.write("            input[type=text] {\n");
      out.write("                width: 15%;\n");
      out.write("                padding: 6px 20px;\n");
      out.write("                margin: 4px 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                border: none;\n");
      out.write("                background-color: #3CBC8D;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            input[type=submit]{\n");
      out.write("                background-color: #3CBC8D;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("                padding: 6px 20px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                margin: 4px 2px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>Movies Service</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action = \"action.jsp\" method=\"post\">\n");
      out.write("            <p class=\"sansserif\"><font size=\"20\" color=\"#1569C7\">Movie Store</font></p><br/>  \n");
      out.write("            <p class=\"sansserif\"> <font size=\"5\" color=\"#218BA8\">Select</font></p>\n");
      out.write("\n");
      out.write("            <select name=\"category\">\n");
      out.write("                <option value=\"title\">title</option>\n");
      out.write("                <option value=\"year\">year</option>\n");
      out.write("                <option value=\"types\">type</option>\n");
      out.write("                <option value=\"director\">director</option>\n");
      out.write("            </select>\n");
      out.write("            <input type=\"text\" name=\"search\">\n");
      out.write("            <input type=\"submit\" value=\"Search\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
