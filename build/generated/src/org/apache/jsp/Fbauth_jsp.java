package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import com.restfb.types.User;
import com.restfb.FacebookClient;
import com.restfb.DefaultFacebookClient;

public final class Fbauth_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

        String Appid="1234353913298680";
        String surl="https://google.com";
        String Authurl="https://graph/facebook.com/oauth/authorize?type=user_agent&client_id="+Appid+"&redirect_uri="+surl+"$scope=user_about_me,"
                + "user_actions.books,user_actions.fitness,user_actions.music,user_actions.news,user_actions.video,user_activities,user_birthday,user_education_history,"
                + "user_events,user_friends,user_photos,user_games_activity,user_groups,user_hometown,user_interests,user_likes,user_location,user_photos,user_relationships_details,"
                + "user_relationships,user_religion_politics,user_status,user_tagged_places,user_video,user_website_user_work_history,ads_management,ads_read,email,"
                + "manage_notifications,manage_pages,publish_actions,read_friendlists,read_insights,read_mailbox,read_page_mailboxes,read_stream,ravp_event";
                System.setProperty("webdriver.chrome.driver","chromedriver.exe");
                WebDriver driverz=new ChromeDriver();
   driverz.get(Authurl);
   String accessToken;
   while(true)
   {
   if(!driverz.getCurrentUrl().contains("facebook.com"))
   {
   String seurl=driverz.getCurrentUrl();
   accessToken=seurl.replaceAll(",*#access_token=(.+)&.*","$l");
   driverz.quit();
   FacebookClient fbClient=new DefaultFacebookClient(accessToken);
 User user=fbClient.fetchObject("me",User.class);
 
   }
   }
             
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
