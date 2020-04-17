package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myChatui_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\">\n");
      out.write("  <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js\"></script>\n");
      out.write("  <script src=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
      out.write("  <style>\n");
      out.write("  #scr\n");
      out.write("  {\n");
      out.write("  padding:15px;\n");
      out.write("  }\n");
      out.write("  \n");
      out.write("  </style>\n");
      out.write("  \n");
      out.write("<script>\n");
      out.write("/*var messages = [], \n");
      out.write("  lastUserMessage = \"\", \n");
      out.write("  botMessage = \"\", \n");
      out.write("  botName = \"Adil\", \n");
      out.write("  talking = true; \n");
      out.write("\n");
      out.write("function chatbotResponse() {\n");
      out.write("  talking = true;\n");
      out.write("  botMessage = \"Not Available\"; \n");
      out.write("\n");
      out.write("  if (lastUserMessage === 'hello') {\n");
      out.write("    botMessage = 'Welcome To UBIT!';\n");
      out.write("  //  botMessage=document.getElementById('time').innerHTML.value();\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  if (lastUserMessage === 'name') {\n");
      out.write("    botMessage = 'My name is ' + botName;\n");
      out.write(" //   botMessage=document.getElementById('time').innerHTML.value();\n");
      out.write("  }\n");
      out.write("}  */\n");
      out.write("/*function myFunction() {\n");
      out.write("    var para = document.createElement(\"P\");\n");
      out.write("    var t = document.createTextNode(\"This is a paragraph.\");\n");
      out.write("    para.appendChild(t);\n");
      out.write("    document.getElementById(\"myDIV\").appendChild(para);\n");
      out.write("} */\n");
      out.write("    var botMessage;\n");
      out.write("    var botName=\"adil\";\n");
      out.write("var userMessage;\n");
      out.write("\n");
      out.write("function myFunction() {\n");
      out.write("\n");
      out.write("\tvar d = new Date();\n");
      out.write("\n");
      out.write("        userMessage=document.getElementById(\"chat\").value;\n");
      out.write("        var im=document.createElement(\"img\");\n");
      out.write("        var il=document.createElement(\"img\");\n");
      out.write("\n");
      out.write("\tvar para = document.createElement(\"P\");\n");
      out.write("    var gara=document.createElement(\"P\");\n");
      out.write("     para.style.cssText=\"padding-left:300px;\";\n");
      out.write("     var dq=document.createElement(\"div\");\n");
      out.write("     var dr=document.createElement(\"div\");\n");
      out.write("dq.style.cssText=\"border:1px solid grey;margin:5px;height:50px;\";\n");
      out.write("dr.style.cssText=\"border:1px solid grey;margin:5px;height:50px;\";\n");
      out.write("        \n");
      out.write("        im.setAttribute(\"height\", \"50\");\n");
      out.write("im.setAttribute(\"width\", \"50\");\n");
      out.write("im.setAttribute(\"alt\", \"Flower\");\n");
      out.write("im.style.cssText=\"float:right;\";\n");
      out.write("\n");
      out.write("il.setAttribute(\"height\", \"50\");\n");
      out.write("il.setAttribute(\"width\", \"50\");\n");
      out.write("il.setAttribute(\"alt\", \"Flower\");\n");
      out.write("il.style.cssText=\"float:left;\";\n");
      out.write("        \n");
      out.write("        var t = document.createTextNode(userMessage);\n");
      out.write("        chatbotResponse();\n");
      out.write("        var g = document.createTextNode(botMessage);\n");
      out.write("    para.appendChild(t);\n");
      out.write("    gara.appendChild(g);\n");
      out.write("    dq.appendChild(im);\n");
      out.write("    dr.appendChild(il);\n");
      out.write("    dq.appendChild(para);\n");
      out.write("    dr.appendChild(gara);\n");
      out.write("    document.getElementById(\"screen\").appendChild(dq);\n");
      out.write("    document.getElementById(\"screen\").appendChild(dr);\n");
      out.write("    sessionStorage.setItem(\"name\", \"GeekChamp\"); \n");
      out.write("}\n");
      out.write("\n");
      out.write("function chatbotResponse() {\n");
      out.write(" // talking = true;\n");
      out.write("  //botMessage = \"Not Available\"; \n");
      out.write("\n");
      out.write("  if (userMessage == 'hello') {\n");
      out.write("    botMessage='Welcome To UBIT!';\n");
      out.write("  //  botMessage=document.getElementById('time').innerHTML.value();\n");
      out.write("  }\n");
      out.write("\n");
      out.write("  else\n");
      out.write("  {\n");
      out.write("  botMessage='Who Are You,I am '+botName;    \n");
      out.write("  }\n");
      out.write("  \n");
      out.write("} \n");
      out.write("\n");
      out.write("function clickCounter() {\n");
      out.write("    if(typeof(Storage) !== \"undefined\") {\n");
      out.write("        if (sessionStorage.clickcount) {\n");
      out.write("        \tvar message=document.getElementById(\"chat\").value;\n");
      out.write("        \t var t = document.createTextNode(message);\n");
      out.write("        \t gdffdgdfg\n");
      out.write("        \tsessionStorage.clickcount = String(sessionStorage.clickcount)+t;\n");
      out.write("        } else {\n");
      out.write("            sessionStorage.clickcount = \" \";\n");
      out.write("        }\n");
      out.write("        var d = new Date();\n");
      out.write("       document.getElementById(\"screen\").style.float=\"left\";\n");
      out.write("        document.getElementById(\"screen\").innerHTML =sessionStorage.clickcount;\n");
      out.write("  document.getElementById(\"screen\").innerHTML=d.getDate()+\" \"+d.getMonth()+\" \"+d.getFullYear();\n");
      out.write("    } else {\n");
      out.write("        document.getElementById(\"screen\").innerHTML = \"Sorry, your browser does not support web storage...\";\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("document.onkeypress = keyPress;\n");
      out.write("function keyPress(e) {\n");
      out.write("  var x = e || window.event;\n");
      out.write("  var key = (x.keyCode || x.which);\n");
      out.write("  if (key == 13 || key == 3) {\n");
      out.write("    myFunction();\n");
      out.write("    document.getElementById(\"chat\").value=\"\";\n");
      out.write("  }\n");
      out.write("  if (key == 38) {\n");
      out.write("    console.log('hi')\n");
      out.write("  }\n");
      out.write("}\n");
      out.write("/*function newEntry() {\n");
      out.write("  //if the message from the user isn't empty then run \n");
      out.write("  if (document.getElementById(\"chat\").value != \"\") {\n");
      out.write("    lastUserMessage = document.getElementById(\"chat\").value;\n");
      out.write("    //sets the chat box to be clear\n");
      out.write("    document.getElementById(\"chat\").value = \"\";\n");
      out.write("    messages.push(lastUserMessage);\n");
      out.write("    chatbotResponse();\n");
      out.write("    messages.push(\"<b>\" + botName + \":</b> \" + botMessage\n");
      out.write("            document.getElementById(\"screen\").innerHTML = messages[messages.length - i];\n");
      out.write("            }\n");
      out.write("    */\n");
      out.write("function Display()\n");
      out.write("{\n");
      out.write("\tvar message=document.getElementById(\"chat\").value;\n");
      out.write("document.getElementById(\"screen\").innerHTML=message;\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("<content>\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"jumbotron\" id=\"screen\">\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</content>\n");
      out.write("<footer>\n");
      out.write("<div class=\"row\">\n");
      out.write("<div class=\"jumbotron\">\n");
      out.write("<form action=\"#\">\n");
      out.write("<textarea rows=\"5\" cols=\"50\" id=\"chat\" placeholder=\"Enter Any Thing You Want\"></textarea>\n");
      out.write("<button type=\"submit\" onclick=\"myFunction()\">Send</button>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</footer>\n");
      out.write("\n");
      out.write("<div class=\"row\">\n");
      out.write("<form method=\"post\" action=\"workings\">\n");
      out.write("<textarea rows=\"10\" cols=\"25\" name=\"message\" id=\"message\">\n");
      out.write("</textarea>\n");
      out.write("<input type=\"submit\" value=\"Segment\" id=\"segment\" name=\"segment\"/>\n");
      out.write("</form>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
