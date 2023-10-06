<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
	
    <base href="<%=basePath%>">
    
    <title>Public Distribution System(PDS)</title>
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
   var url="/PDS/show2";
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
   


<script type="text/javascript">
  function f()
  {
  alert("gg1");
  }
  
  </script>
    <script type="text/javascript">
    
	var ob;
	function retrieve1(str) {
		alert(str);
		try {
			ob = new XMLHttpRequest();
		} catch (e) {
			try {
				ob = new ActiveXObject("Microsoft.XMLHTTP");
			} catch (e) {
				try {
					ob = new ActiveXObject("Msxml2.XMLHTTP");
				} catch (e) {
					return false;
				}
			}
		}

		ob.onreadystatechange = fun5;
		var url = "/PDS/show3";
		url = url + "?pp=" + str;
		url=url+"&s="+Math.random();
		ob.open("GET", url, true);
		ob.send(null);
		function fun5() {

			if (ob.readyState == 4) {
				document.getElementById("result1").innerHTML = ob.responseText;
			}
		}
	}
</script>
	
  </head>
  
  <body bgcolor="">
<div id="wrapper">
	<div id="header"><div id="logo"><img height="85" width="903" alt="" src="images/Mhead-bg11.jpg"></div><div id="menu">
			<ul>
				<li class="first current_page_item"><a href="#">Home</a></li>
				<li><a href="#">Government orders</a></li>
				<li><a href="#">Storage</a></li>
				<li><a href="#">About us</a></li>
				<li><a href="logout.jsp">Log out</a></li>
			</ul>
		</div>
	</div>
	<!-- end #header -->
	<div id="page">
		<div id="page-bgtop">
			<div id="page-bgbtm">
				<div id="content">
					<div class="post">
						<h2 class="title"><font color="blue">Welcome to Public Distribution System </font></h2>
						
						<div class="entry">
						<p><img src="images/22_Jointings1.jpg" width="538" height="200"  /></p>	
						</div>
					</div>
					<div class="post">
						<h2 class="title"><font color="blue">Rice - angul<br></font></h2>
						<div class="entry">
						  <center>
       <table border="1" width="633" height="30">
       <tr><td>BLOCK</td><td>DEPOT</td><td>OPENING_BALANCE</td><td>ISSUE</td><td>RECEIVED</td><td>CLOSING_BALANCE</td><td>DATE</td>
       </tr>
       <tr><td>Bantala</td><td>2</td><td>45000</td><td>5000</td><td>10000</td><td>50000</td><td>10/Apr/2013</td></tr>
       <tr><td>Nandapur</td><td>2</td><td>50000</td><td>0</td><td>5000</td><td>55000</td><td>10/Apr/2013</td></tr>
       <tr><td>Bantala</td><td>2</td><td>55000</td><td>20000</td><td>10000</td><td>45000</td><td>11/Apr/2013</td></tr>
       <tr><td>Nandapur</td><td>2</td><td>45000</td><td>10000</td><td>20000</td><td>55000</td><td>11/Apr/2013</td></tr>
       <tr><td>Bantala</td><td>2</td><td>55000</td><td>5000</td><td>5000</td><td>55000</td><td>12/Apr/2013</td></tr>
       <tr><td>Nandapur</td><td>2</td><td>55000</td><td>30000</td><td>15000</td><td>40000</td><td>12/Apr/2013</td></tr>
       <tr><td>Bantala</td><td>2</td><td>40000</td><td>0</td><td>5000</td><td>45000</td><td>13/Apr/2013</td></tr>
       <tr><td>Nandapur</td><td>2</td><td>45000</td><td>30000</td><td>15000</td><td>30000</td><td>13/Apr/2013</td></tr>
       <tr><td></td><td>16</td><td>3,90,000<br></td><td>1,00,000</td><td>15000</td><td>3,75,000</td><td></td></tr>
       </table>
  </center>
			</div>
					</div>
						
				</div>
				<!-- end #content -->
				<div id="sidebar">
					<ul>
						<li>
							<div style="clear: both;">&nbsp;</div>
						</li>
						<li>
							<h2><font color="blue">ABOUT US</font></h2>
							<font color="black"><p>Public Distribution System (PDS) is an Indian food security system. Established by the Government of India under Ministry of Consumer Affairs, Food, and Public Distribution and managed jointly with state governments in India, it distributes subsidised food and non-food items to India's poor. Major commodities distributed include staple food grains, such as wheat, rice, sugar, and kerosene, through a network of Public distribution shops, also known as Ration shops established in several states across the country. Food Corporation of India, a Government-owned corporation, procures, maintains the Public Distribution System.... <br/><a href="about.jsp">read more</a></p></font>
						</li>
						<li>
						<div style="clear: both;">
						<ul><li> 
						<div style="clear: both;"> 
						<p><br></p> 
						</div> 
						</li></ul>
						</div>
						</li>
							
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
</html>
'