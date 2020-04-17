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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("body {\n");
      out.write("  font: 15px arial, sans-serif;\n");
      out.write("  background-color: #d9d9d9;\n");
      out.write("  padding-top: 15px;\n");
      out.write("  padding-bottom: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#bodybox {\n");
      out.write("  margin: auto;\n");
      out.write("  max-width: 550px;\n");
      out.write("  font: 15px arial, sans-serif;\n");
      out.write("  background-color: white;\n");
      out.write("  border-style: solid;\n");
      out.write("  border-width: 1px;\n");
      out.write("  padding-top: 20px;\n");
      out.write("  padding-bottom: 25px;\n");
      out.write("  padding-right: 25px;\n");
      out.write("  padding-left: 25px;\n");
      out.write("  box-shadow: 5px 5px 5px grey;\n");
      out.write("  border-radius: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#chatborder {\n");
      out.write("  border-style: solid;\n");
      out.write("  background-color: #f6f9f6;\n");
      out.write("  border-width: 3px;\n");
      out.write("  margin-top: 20px;\n");
      out.write("  margin-bottom: 20px;\n");
      out.write("  margin-left: 20px;\n");
      out.write("  margin-right: 20px;\n");
      out.write("  padding-top: 10px;\n");
      out.write("  padding-bottom: 15px;\n");
      out.write("  padding-right: 20px;\n");
      out.write("  padding-left: 15px;\n");
      out.write("  border-radius: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".chatlog {\n");
      out.write("   font: 15px arial, sans-serif;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#chatbox {\n");
      out.write("  font: 17px arial, sans-serif;\n");
      out.write("  height: 22px;\n");
      out.write("  width: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("h1 {\n");
      out.write("  margin: auto;\n");
      out.write("}\n");
      out.write("\n");
      out.write("pre {\n");
      out.write("  background-color: #f0f0f0;\n");
      out.write("  margin-left: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".user{\n");
      out.write("    border:2px solid gray;\n");
      out.write("    border-radius: 6px;\n");
      out.write("    width:450px;\n");
      out.write("    height:25px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btt{\n");
      out.write("    border:2px solid gray;\n");
      out.write("    height:30px;\n");
      out.write("    width:70px;\n");
      out.write("    border-radius: 6px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id='bodybox'>\n");
      out.write("                <center>  \n");
      out.write("                    <form method=\"get\" action=\"chatbot.html\">\n");
      out.write("                    <input type=\"text\" name=\"user\" class=\"user\" id=\"user\" placeholder=\"Enter Username for Chat\"/>\n");
      out.write("                    <input type=\"submit\" class=\"btt\" value=\"Go Chat\"/>\n");
      out.write("                    </form>\n");
      out.write("                </center>\n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
