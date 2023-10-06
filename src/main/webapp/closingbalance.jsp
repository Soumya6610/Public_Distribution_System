
<%@taglib uri="/struts-tags" prefix="s"  %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>


<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<meta name="keywords" content="" />
<meta name="description" content="" />
<meta http-equiv="content-type" content="text/html; charset=utf-8" />
<title>Equivalency    by Free CSS Templates</title>
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
<script type="text/javascript">
  function f()
  {
  alert("gg");
  }
  
  </script>
    <script type="text/javascript">
    var ob;
    function retrieve(str)
    {
    alert(str);
    try
    {
    ob=new XMLHttpRequest();
    }
    catch(e)
    {
    try
    {
    ob=new ActiveXObject("Microsoft.XMLHTTP");
    }
    catch(e)
    {
    try
    {
      ob=new ActiveXObject("Msxml2.XMLHTTP");
   }
   catch(e)
   {
   return false;
   }
   }
   }
   
   ob.onreadystatechange=fun5;
   var url="/PDS/show";
   url=url+"?p="+str;
   //url=url+"&s="+Math.random();
   ob.open("GET",url,true);
   ob.send(null);
   function fun5()
   {
   
   if(ob.readyState==4)
   {
   document.getElementById("result").innerHTML=ob.responseText;
   }
   }
   }
   </script>
   


  </head>
 <body id="b" onload="noBack();" onpageshow="if (event.persisted) noBack();" onunload=""> 
 <br><div id="wrapper">
	<div id="header"><div id="logo"><img height="85" width="903" alt="" src="images/Mhead-bg11.jpg"></div><div id="menu">
			<ul>
				<li class="first current_page_item"><a href="#">Home</a></li>
				<li><a href="#">Government orders</a></li>
				<li><br></li>
				<li><a href="#">About us</a></li>
			<li><a href="home.jsp">Log out</a></li>
			</ul>
		</div>
	</div>
	<!-- end #header -->
	<div id="page">
		<div id="page-bgtop">
			<div id="page-bgbtm">
				<div id="content">
					<div class="post">
						<h2 class="title"><a href="#">Welcome to Public Distribution System </a></h2>
						
						<div class="entry">
						<p><img src="images/22_Jointings1.jpg" width="538" height="200" alt="" /></p>	
						</div>
					</div>
					<div class="post">
						<h2 class="title"><a href="#">CLOSING BALANCE</a></h2>
						<div class="entry">
						
		 <center>
        <s:form action="closingbalances" name="fr" onsubmit="return func()">
        
        
       
        <table>
        <tr><td><s:textfield name="depot_id" label="Enter your depotid"/></td></tr>
        <tr><td><s:textfield name="rice_issue" label="Closing Rice Balance     (QT)"/></td></tr>
        <tr><td><s:textfield name="wheat_issue" label="Closing Wheat Balance   (QT)"/></td></tr>
        <tr><td><s:textfield name="sugar_issue" label="Closing Sugar Balance     (QT)"/></td></tr>
        <tr><td><s:submit value="send"></s:submit></td></tr>
          <tr><td><s:reset value="clear"></s:reset></td></tr>
         </table>
         </s:form>
         </center>
        

						
						</div>
					</div>
					<div style="clear: both;">&nbsp;</div>
				</div>
				<!-- end #content -->
				<div id="sidebar">
					<ul> 
						<li> 
														<div style="clear: both;">&nbsp;</div> 
						</li> 
						<li> 
							<h2>ABOUT US</h2> 
							<p>Public Distribution System (PDS) is an Indian food security system. Established by the Government of India under Ministry of Consumer Affairs, Food, and Public Distribution and managed jointly with state governments in India, it distributes subsidised food and non-food items to India's poor. Major commodities distributed include staple food grains, such as wheat, rice, sugar, and kerosene, through a network of Public distribution shops, also known as Ration shops established in several states across the country. Food Corporation of India, a Government-owned corporation, procures, maintains the Public Distribution System....<br><a href="#">Read more</a></p> 
						</li>
						
						</ul><img alt="" src="images/Reserved.jpg" width="291" height="421"><ul><div> 
						 
						</div> 
						 
					 
						 
						 
					</ul>
				</div>
				<!-- end #sidebar -->
				<div style="clear: both;">&nbsp;</div>
			</div>
		</div>
	</div>
	<!-- end #page -->
</div>
<div id="footer">
	<p>Copyright (c) 2008 Sitename.com. All rights reserved. Design by <a href="http://www.freecsstemplates.org/">Free CSS Templates</a>.</p>
</div>
<!-- end #footer -->
</body>
<script type="text/javascript">

function func()
{

var b=document.forms["fr"]["depot_id"].value;
var c=document.forms["fr"]["rice_issue"].value;

var e=document.forms["fr"]["wheat_issue"].value;

var g=document.forms["fr"]["sugar_issue"].value;


if(b=="")
{
alert("Enter Depot ID");
  document.forms["fr"]["depot_id"].focus();
return false;
}
if(isNaN(b)||b.indexOf(" ")!=-1)
           {
              alert("Enter numeric value")
              return false; 
           }
if(c=="")
{
alert("Enter Rice issue");
  document.forms["fr"]["rice_issue"].focus();
return false;
}

           if(e=="")
{
alert("Enter Wheat issue");
  document.forms["fr"]["wheat_issue"].focus();
return false;
}

if(g=="")
{
alert("Enter Sugar issue ");
return false;
}

return true;
}


</script>

</html>

 
