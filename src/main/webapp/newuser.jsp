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
<title>Equivalency    by Free CSS Templates</title>
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
	
  </head>
  
  <body bgcolor="">
<div id="wrapper">
	<div id="header">
		<div id="logo">
			<h1><a href="#">PUBLIC DISTRIBUTION SYSTEM </a></h1>
			
		</div>
		<div id="menu">
			<ul>
				<li class="first current_page_item"><a href="#">Home</a></li>
				<li><a href="#">Blog</a></li>
				<li><br></li>
				<li><a href="#">About</a></li>
				<li><br></li>
				<li><a href="#">Contact</a></li>
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
						<table align="center">
						<s:form action="registeruser">
						
						<tr><td><s:textfield name="username" label="Enter User name:"></s:textfield></td></tr>
						<tr><td><s:radio name="usertype" label="User Type" list="{'admin','user'}"/></td></tr>
						<tr><td><s:password name="password" label="Enter Password:"></s:password></td></tr>
						<tr><td><s:textarea name="address" label="Enter Address"></s:textarea></td></tr>
						<tr><td><s:select name="gender" label="Enter your gender:" list="{'male','female'}"></s:select></td></tr>
						<tr><td><s:textfield name="age" label="Enter age:"></s:textfield></td></tr>
						<tr><td><s:textfield name="phone" label="Enter Phone no.:"></s:textfield></td></tr>
							<tr><td><s:submit value="Submit" ></s:submit>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<s:reset value="Cancel" ></s:reset></td></tr>
							
							
							</s:form>
							
							</table>
							
						</div>
					</div>
					<div style="clear: both;">&nbsp;</div>
				</div>
				<!-- end #content -->
				<div id="sidebar">
					<ul>
						<li>
							<div id="search" >
								<form method="get" action="#">
									<div>
										<input type="text" name="s" id="search-text" value="" />
										<input type="submit" id="search-submit" value="GO" />
									</div>
								</form>
							</div>
							<div style="clear: both;">&nbsp;</div>
						</li>
						<li>
							<h2>ABOUT US</h2>
							<p>Public Distribution System (PDS) is an Indian food security system. Established by the Government of India under Ministry of Consumer Affairs, Food, and Public Distribution and managed jointly with state governments in India, it distributes subsidised food and non-food items to India's poor. Major commodities distributed include staple food grains, such as wheat, rice, sugar, and kerosene, through a network of Public distribution shops, also known as Ration shops established in several states across the country. Food Corporation of India, a Government-owned corporation, procures, maintains the Public Distribution System</p>
						</li>
						<li>
							<h2>Categories</h2>
							<ul>
								<li><a href="#">Aliquam libero</a></li>
								<li><a href="#">Consectetuer adipiscing elit</a></li>
								<li><a href="#">Metus aliquam pellentesque</a></li>
								<li><a href="#">Suspendisse iaculis mauris</a></li>
								<li><a href="#">Urnanet non molestie semper</a></li>
								<li><a href="#">Proin gravida orci porttitor</a></li>
							</ul>
						</li>
						<li>
							<h2>Blogroll</h2>
							<ul>
								<li><a href="#">Aliquam libero</a></li>
								<li><a href="#">Consectetuer adipiscing elit</a></li>
								<li><a href="#">Metus aliquam pellentesque</a></li>
								<li><a href="#">Suspendisse iaculis mauris</a></li>
								<li><a href="#">Urnanet non molestie semper</a></li>
								<li><a href="#">Proin gravida orci porttitor</a></li>
							</ul>
						</li>
						<li>
							<h2>Archives</h2>
							<ul>
								<li><a href="#">Aliquam libero</a></li>
								<li><a href="#">Consectetuer adipiscing elit</a></li>
								<li><a href="#">Metus aliquam pellentesque</a></li>
								<li><a href="#">Suspendisse iaculis mauris</a></li>
								<li><a href="#">Urnanet non molestie semper</a></li>
								<li><a href="#">Proin gravida orci porttitor</a></li>
							</ul>
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
