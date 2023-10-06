<%@ page language="java" import="java.util.*,com.opensymphony.xwork2.ActionContext" pageEncoding="utf-8"%>
<%@taglib uri="/struts-tags" prefix="s" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%
 Map sess=ActionContext.getContext().getSession();
 String name=(String)sess.get("UNAME");

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
<title>Equivalency    by Free CSS Templates</title>
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
	
  </head>
  
  <body bgcolor="">
<div id="wrapper">
	<div id="header"><div id="logo"><img height="85" width="903" alt="" src="images/Mhead-bg11.jpg"></div><div id="menu">
			<ul>
				<li class="first current_page_item"><a href="#">Home</a></li>
				<li><a href="#">Government Orders</a></li>
				<li><a href="#">Storage</a></li>
				<li><a href="#">About Us</a></li>
				<li><a href="login.jsp">Log out</a></li>
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
						<h2 class="title"><a href="#">PUBLIC DISTRIBUTION SYSTEM</a></h2>
						<div class="entry"> 
						<font color="red" size="6"> Welcome,&nbsp;&nbsp;<%=name %> </font>
						<br/>
						<br>
						<a href="transactionRepot.jsp">Make transaction </a>|| 
						 
						<a href="closingbalance.jsp">ClosingBalance Transaction</a><br><br><br>
							
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
							<h2>ABOUT US</h2> 
							<p>Public Distribution System (PDS) is an Indian food security system. Established by the Government of India under Ministry of Consumer Affairs, Food, and Public Distribution and managed jointly with state governments in India, it distributes subsidised food and non-food items to India's poor. Major commodities distributed include staple food grains, such as wheat, rice, sugar, and kerosene, through a network of Public distribution shops, also known as Ration shops established in several states across the country. Food Corporation of India, a Government-owned corporation, procures, maintains the Public Distribution System....<br><a href="#">Read more</a></p></li><li> 
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
