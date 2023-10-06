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
<title>pds</title>
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
						<p><img src="images/22_Jointings1.jpg" width="538" height="200"  /></p>	
						</div>
					</div>
					<div class="post">
						<h2 class="title"><a href="#">PUBLIC DISTRIBUTION SYSTEM</a></h2>
						<div class="entry">
						  <center>
     
               <table border="2" bordercolor="green">
         <tr> <td>BLOCK</td><td>Depot</td><td>Opening</td>
         <td>Issue</td><td>Receive</td><td>Closing</td><td>date</td></tr>
         <tr> <td>Bantala</td><td><a href="bantaldepodetails.jsp">2</a></td><td>50000</td>
         <td>0</td><td>0</td><td>50000</td><td>10/Apr/2013</td></tr>
         <tr> <td>nandapur</td><td><a href="nanadapurdepotdetails.jsp">2</a></td><td>40000</td>
         <td>2000</td><td>1000</td><td>3000</td><td>10/Apr/2013</td></tr>
         <tr> <td>Bantala</td><td><a href="bantaldepodetails.jsp">2</a></td><td>50000</td>
         <td>0</td><td>0</td><td>50000</td><td>11/Apr/2013</td></tr>
         <tr> <td>nandapur</td><td><a href="nanadapurdepotdetails.jsp">2</a></td><td>40000</td>
         <td>2000</td><td>1000</td><td>3000</td><td>11/Apr/2013</td></tr>
         <tr> <td>Bantala</td><td><a href="bantaldepodetails.jsp">2</a></td><td>50000</td>
         <td>3000</td><td>2000</td><td>49000</td><td>12/Apr/2013</td></tr>
         <tr> <td>nandapur</td><td><a href="nanadapurdepotdetails.jsp">2</a></td><td>40000</td>
         <td>4000</td><td>5000</td><td>41000</td><td>12/Apr/2013</td></tr>
         <tr> <td>Bantala</td><td><a href="bantaldepodetails.jsp">2</a></td><td>49000</td>
         <td>20000<br></td><td>5000<br></td><td>24000<br></td><td>13/Apr/2013</td></tr>
         <tr> <td>nandapur</td><td><a href="nanadapurdepotdetails.jsp">2</a></td><td>41000</td>
         <td>5000</td><td>1000</td><td>37000</td><td>13/Apr/2013</td></tr>
         <tr> <td></td><td>00000</td><td>0000</td>
         <td>00000</td><td>00000</td><td>0000</td><td></td></tr>
         
         
         </table>
        
        </center>     


                

						</div>
					</div>
					<div style="clear: both;">&nbsp;</div>
					
							<h2>PDS News</h2>
							<br/>
							<ul>
								<li><a href="#">DL: Delhi Government launches e-PDS system for greater transparency</a></li>
								<li><a href="#">UP:Food and Civil supplies Department: 2012-13</a></li>
								<li><a href="#">Departmental storage operation with Door Delivery of Food Stock..02.05.2012</a></li>
								
							</ul>
						
				</div>
				<!-- end #content -->
				<div id="sidebar">
					<ul>
						<li>
							<div style="clear: both;">&nbsp;</div>
						</li>
						<li>
							<h2>ABOUT US</h2>
							<p>Public Distribution System (PDS) is an Indian food security system. Established by the Government of India under Ministry of Consumer Affairs, Food, and Public Distribution and managed jointly with state governments in India, it distributes subsidised food and non-food items to India's poor. Major commodities distributed include staple food grains, such as wheat, rice, sugar, and kerosene, through a network of Public distribution shops, also known as Ration shops established in several states across the country. Food Corporation of India, a Government-owned corporation, procures, maintains the Public Distribution System.... <br/><a href="#">read more</a></p>
						</li>
						<li>
						<div style="clear: both;">
						<ul><li> 
						<div style="clear: both;"> 
						<p><img height="430" width="274" alt="" src="images/Reserved.jpg"></p> 
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