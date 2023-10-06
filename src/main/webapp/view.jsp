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
<title>pds</title>
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
	
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
						<h2 class="title"><font color="blue">UPDATE DEPOT REGISTRATION</font></h2>
						<div class="entry">
						 <center>
        <s:form action="view11">
        <s:select label="Please Select" name="depot_id" list="mapForSelect" headerKey="-1" headerValue="---please select">
        </s:select>
        <s:submit value="View"></s:submit>
         </s:form>
        </center>     
                

						</div>
					</div>
					<div style="clear: both;">&nbsp;</div>
					
							<h2>PDS News</h2>
							<br/>
							<ul>
								<li><a href="http://ibnlive.in.com/generalnewsfeed/news/delhi-govt-launches-epds-system-for-greater-transparency/963576.html">DL: Delhi Government launches e-PDS system for greater transparency</a></li>
								<li><a href="http://fcs.up.nic.in/upfood/fcsportal/information/Nivida_Suchna.aspx">UP:Food and Civil supplies Department: 2012-13</a></li>
								<li><a href="http://ww5.foodorissa.in/Download/Revised_Operational_Guidelines_for_Departmental_Storage_Operations_as_on_30.04.2012.pdf">Departmental storage operation with Door Delivery of Food Stock..02.05.2012</a></li>
								
							</ul>
						
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