<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <style>
  #scr
  {
  padding:15px;
  }
  
  </style>
  
<script>
/*var messages = [], 
  lastUserMessage = "", 
  botMessage = "", 
  botName = "Adil", 
  talking = true; 

function chatbotResponse() {
  talking = true;
  botMessage = "Not Available"; 

  if (lastUserMessage === 'hello') {
    botMessage = 'Welcome To UBIT!';
  //  botMessage=document.getElementById('time').innerHTML.value();
  }

  if (lastUserMessage === 'name') {
    botMessage = 'My name is ' + botName;
 //   botMessage=document.getElementById('time').innerHTML.value();
  }
}  */
/*function myFunction() {
    var para = document.createElement("P");
    var t = document.createTextNode("This is a paragraph.");
    para.appendChild(t);
    document.getElementById("myDIV").appendChild(para);
} */
    var botMessage;
    var botName="adil";
var userMessage;

function myFunction() {

	var d = new Date();

        userMessage=document.getElementById("chat").value;
        var im=document.createElement("img");
        var il=document.createElement("img");

	var para = document.createElement("P");
    var gara=document.createElement("P");
     para.style.cssText="padding-left:300px;";
     var dq=document.createElement("div");
     var dr=document.createElement("div");
dq.style.cssText="border:1px solid grey;margin:5px;height:50px;";
dr.style.cssText="border:1px solid grey;margin:5px;height:50px;";
        
        im.setAttribute("height", "50");
im.setAttribute("width", "50");
im.setAttribute("alt", "Flower");
im.style.cssText="float:right;";

il.setAttribute("height", "50");
il.setAttribute("width", "50");
il.setAttribute("alt", "Flower");
il.style.cssText="float:left;";
        
        var t = document.createTextNode(userMessage);
        chatbotResponse();
        var g = document.createTextNode(botMessage);
    para.appendChild(t);
    gara.appendChild(g);
    dq.appendChild(im);
    dr.appendChild(il);
    dq.appendChild(para);
    dr.appendChild(gara);
    document.getElementById("screen").appendChild(dq);
    document.getElementById("screen").appendChild(dr);
    sessionStorage.setItem("name", "GeekChamp"); 
}

function chatbotResponse() {
 // talking = true;
  //botMessage = "Not Available"; 

  if (userMessage == 'hello') {
    botMessage='Welcome To UBIT!';
  //  botMessage=document.getElementById('time').innerHTML.value();
  }

  else
  {
  botMessage='Who Are You,I am '+botName;    
  }
  
} 

function clickCounter() {
    if(typeof(Storage) !== "undefined") {
        if (sessionStorage.clickcount) {
        	var message=document.getElementById("chat").value;
        	 var t = document.createTextNode(message);
        	 gdffdgdfg
        	sessionStorage.clickcount = String(sessionStorage.clickcount)+t;
        } else {
            sessionStorage.clickcount = " ";
        }
        var d = new Date();
       document.getElementById("screen").style.float="left";
        document.getElementById("screen").innerHTML =sessionStorage.clickcount;
  document.getElementById("screen").innerHTML=d.getDate()+" "+d.getMonth()+" "+d.getFullYear();
    } else {
        document.getElementById("screen").innerHTML = "Sorry, your browser does not support web storage...";
    }
}

document.onkeypress = keyPress;
function keyPress(e) {
  var x = e || window.event;
  var key = (x.keyCode || x.which);
  if (key == 13 || key == 3) {
    myFunction();
    document.getElementById("chat").value="";
  }
  if (key == 38) {
    console.log('hi')
  }
}
/*function newEntry() {
  //if the message from the user isn't empty then run 
  if (document.getElementById("chat").value != "") {
    lastUserMessage = document.getElementById("chat").value;
    //sets the chat box to be clear
    document.getElementById("chat").value = "";
    messages.push(lastUserMessage);
    chatbotResponse();
    messages.push("<b>" + botName + ":</b> " + botMessage
            document.getElementById("screen").innerHTML = messages[messages.length - i];
            }
    */
function Display()
{
	var message=document.getElementById("chat").value;
document.getElementById("screen").innerHTML=message;
}
</script>
</head>
<body>
<div class="container">
<content>
<div class="row">
<div class="jumbotron" id="screen">

</div>
</div>
</content>
<footer>
<div class="row">
<div class="jumbotron">
<form action="#">
<textarea rows="5" cols="50" id="chat" placeholder="Enter Any Thing You Want"></textarea>
<button type="submit" onclick="myFunction()">Send</button>
</form>
</div>
</div>
</footer>

<div class="row">
<form method="post" action="workings">
<textarea rows="10" cols="25" name="message" id="message">
</textarea>
<input type="submit" value="Segment" id="segment" name="segment"/>
</form>
</div>

</div>
</body>
</html>