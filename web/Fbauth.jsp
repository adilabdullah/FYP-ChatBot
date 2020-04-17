
<%@page import="org.openqa.selenium.chrome.ChromeDriver"%>
<%@page import="org.openqa.selenium.WebDriver"%>
<%@page import="com.restfb.types.User"%>
<%@page import="com.restfb.FacebookClient"%>
<%@page import="com.restfb.DefaultFacebookClient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
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
             
        %>
    </body>

