var nm=document.getElementById('name').value;
var pw=document.getElementById('pass').value;

if(nm=='adil' || nm=='Adil')
{
   if(pw=='adil' || pw=='Adil')
   {
       Window.redirect("myChatui.html");
       
   }
   else
   {
       alert("Password not correct");
   }
    
}
else
   {
       alert("English not correct");
   }

