<%-- 
    Document   : smsapp
    Created on : Nov 14, 2016, 1:25:54 AM
    Author     : pc
--%>

<%@page import="com.twilio.rest.lookups.v1.PhoneNumber"%>
<%@page import="java.lang.System.out"%>
<%@page import="com.twilio.example.Example.AUTH_TOKEN"%>
<%@page import="com.twilio.example.Example.ACCOUNT_SID"%>
<%@page import="com.twilio.example.Example.ACCOUNT_SID"%>
<%@page import="com.twilio.Twilio"%>
<%@page import="com.twilio.rest.api.v2010.account.Message"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String AUTH_TOKEN = "your_auth_token";

    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    Message message = Message.creator(new PhoneNumber("+15558675309"),
        new PhoneNumber("+15017250604"), 
        "This is the ship that made the Kessel Run in fourteen parsecs?").create();

    out.println(message.getSid());

        %>
    </body>
</html>
