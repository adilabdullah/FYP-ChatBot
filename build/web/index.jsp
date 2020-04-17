<%-- 
    Document   : index
    Created on : Oct 25, 2016, 10:41:17 PM
    Author     : pc
--%>

<%@page import="com.restfb.types.User"%>
<%@page import="com.restfb.FacebookClient"%>
<%@page import="com.restfb.DefaultFacebookClient"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>
body {
  font: 15px arial, sans-serif;
  background-color: #d9d9d9;
  padding-top: 15px;
  padding-bottom: 15px;
}

#bodybox {
  margin: auto;
  max-width: 550px;
  font: 15px arial, sans-serif;
  background-color: white;
  border-style: solid;
  border-width: 1px;
  padding-top: 20px;
  padding-bottom: 25px;
  padding-right: 25px;
  padding-left: 25px;
  box-shadow: 5px 5px 5px grey;
  border-radius: 15px;
}

#chatborder {
  border-style: solid;
  background-color: #f6f9f6;
  border-width: 3px;
  margin-top: 20px;
  margin-bottom: 20px;
  margin-left: 20px;
  margin-right: 20px;
  padding-top: 10px;
  padding-bottom: 15px;
  padding-right: 20px;
  padding-left: 15px;
  border-radius: 15px;
}

.chatlog {
   font: 15px arial, sans-serif;
}

#chatbox {
  font: 17px arial, sans-serif;
  height: 22px;
  width: 100%;
}

h1 {
  margin: auto;
}

pre {
  background-color: #f0f0f0;
  margin-left: 20px;
}

.user{
    border:2px solid gray;
    border-radius: 6px;
    width:450px;
    height:25px;
}

.btt{
    border:2px solid gray;
    height:30px;
    width:70px;
    border-radius: 6px;
}
</style>
    </head>
    <body>
        <%
        String accessToken="EAACEdEose0cBADeTFpieUJtdtLP9ixjxDNSDxPZAntWuO3WdlcZCOLiBSQkoHar4Jtu2cWc2BoeH0Phg38n1L6GDPTaZCq9IShcTcS3rji4aom6dTZBMf9OO1hpZBPMyapk87ZBwD5YfJrw2PTUS3mFwG5BK0FyoHaZBFhuG4mncgZDZD";    
       FacebookClient fbClient=new DefaultFacebookClient(accessToken);
       User me=fbClient.fetchObject("me",User.class);
       out.println("<h1>"+me.getEmail()+"</h1>");
       out.println("<h1>"+me.getBirthday()+"</h1>");
       out.println("<h1>"+me.getLocation()+"</h1>");
       out.println("<h1>"+me.getAbout()+"</h1>");
       out.println("<h1>"+me.getGender()+"</h1>");

        %>
        <div id='bodybox'>
                <center>  
                    <form method="get" action="chatbot.html">
                    <input type="text" name="user" class="user" id="user" placeholder="Enter Username for Chat"/>
                    <input type="submit" class="btt" value="Go Chat"/>
                    </form>
                </center>
              <div>
            <form method="post" action="Fbauth.jsp">
                <input type="submit" value="Fb Authentication"/>
            </form>
        </div>
        </div>
        
      
    </body>
</html>
