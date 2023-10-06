
<%@taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%
String path = request.getContextPath();
String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>


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
<title>Equivalency by Free CSS Templates</title>
<link href="style.css" rel="stylesheet" type="text/css" media="screen" />
<script type="text/javascript">
	function f() {
		alert("gg");
	}
</script>
<script type="text/javascript">
	var ob;
	function retrieve(str) {
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
		var url = "/PDS/show";
		url = url + "?p=" + str;
		//url=url+"&s="+Math.random();
		ob.open("GET", url, true);
		ob.send(null);
		function fun5() {

			if (ob.readyState == 4) {
				document.getElementById("result").innerHTML = ob.responseText;
			}
		}
	}
</script>


</head>
<body id="b" onload="noBack();"
	onpageshow="if (event.persisted) noBack();" onunload="">
	<br>
	<div id="wrapper">
		<div id="header">
			<div id="logo">
				<img height="85" width="903" alt="" src="images/Mhead-bg11.jpg">
			</div>
			<div id="menu">
				<ul>
					<li class="first current_page_item"><a href="#">Home</a></li>
					<li><a href="#">Government orders</a></li>
					<li><br></li>
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
							<h2 class="title">
								<font color="blue">Welcome to Public Distribution System
								</font>
							</h2>

							<div class="entry">
								<p>
									<img src="images/22_Jointings1.jpg" width="538" height="200"
										alt="" />
								</p>
							</div>
						</div>
						<div class="post">
							<h2 class="title">
								<font color="blue">ADD DEPOT REGISTRATION</font>
							</h2>
							<div class="entry">

								<center>
									<s:form action="registeraction" name="fr"
										onsubmit="return func()">

										<table>
											<tr>
												<td><s:select name="district" label="SELECT DISTRICT"
														list="mapForSelect" headerKey="0"
														headerValue="--please select--"
														onchange="retrieve(this.value);"></s:select></td>
											</tr>
											<tr>
												<td>BLOCK NAME</td>
												<td id="result"></td>
											</tr>
											<tr>
												<td><s:textfield name="depotname" label="DEPOT NAME" /></td>
											</tr>
											<tr>
												<td><s:textfield name="location" label="LOCATION DEPOT" /></td>
											</tr>
											<tr>
												<td><s:textfield name="capacity"
														label=" DEPOT CAPACITY" /></td>
											</tr>
											<tr>
												<td><s:radio name="hiredby" label="HIRED BY"
														list="{'hire','dehire'}"></s:radio></td>
											</tr>
											<tr>
												<td><s:select label="DEPOT RRC IN OWNED BY"
														name="depotRRCinownedby"
														list="{'FCI','OSCSI','OSWE','OWN'}" headerKey="0"
														headerValue="---please select">
													</s:select></td>
											</tr>
											<tr>
												<td><s:select label="DEPOT RRC IN MANAGED BY"
														name="depotRRCinmanagedby" list="{'FCI','OSCSI'}"
														headerKey="0" headerValue="---please select">
													</s:select></td>
											</tr>
											<tr>
												<td><s:textfield name="name" label="NAME" /></td>
											</tr>
											<tr>
												<td><s:textfield name="designation" label="DESIGNATION" /></td>
											</tr>
											<tr>
												<td><s:textfield name="mobile" label="MOBILE" /></td>
											</tr>
											<tr>
												<td><s:submit value="submit"></s:submit></td>
											</tr>
											<tr>
												<td><s:reset value="cancel"></s:reset></td>
											</tr>
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
								<h2>
									<font color="blue">ABOUT US</font>
								</h2> <font color="black"><p>
										Public Distribution System (PDS) is an Indian food security
										system. Established by the Government of India under Ministry
										of Consumer Affairs, Food, and Public Distribution and managed
										jointly with state governments in India, it distributes
										subsidised food and non-food items to India's poor. Major
										commodities distributed include staple food grains, such as
										wheat, rice, sugar, and kerosene, through a network of Public
										distribution shops, also known as Ration shops established in
										several states across the country. Food Corporation of India,
										a Government-owned corporation, procures, maintains the Public
										Distribution System....<br>
										<a href="about.jsp">Read more</a>
									</p></font>
							</li>

						</ul>
						<img alt="" src="images/Reserved.jpg" width="291" height="421">
						<ul>
							<div></div>




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
		<p>
			Copyright (c) 2008 Sitename.com. All rights reserved. Design by <a
				href="http://www.freecsstemplates.org/">Free CSS Templates</a>.
		</p>
	</div>
	<!-- end #footer -->
</body>
<script type="text/javascript">
	function func(str) {
		var a = document.forms["fr"]["district"].value;
		var b = document.forms["fr"]["depotname"].value;
		var c = document.forms["fr"]["location"].value;
		var d = document.forms["fr"]["capacity"].value;
		var e = document.forms["fr"]["hiredby"].value;
		var f = document.forms["fr"]["depotRRCinownedby"].value;
		var g = document.forms["fr"]["depotRRCinmanagedby"].value;
		var h = document.forms["fr"]["name"].value;
		var i = document.forms["fr"]["designation"].value;
		var j = document.forms["fr"]["mobile"].value;
		if (a == 0) {
			alert("Choose a District");
			document.forms["fr"]["district"].focus();
			return false;
		}
		if (b == "") {
			alert("Enter DepotName");
			document.forms["fr"]["depotname"].focus();
			return false;
		}
		if (c == "") {
			alert("Enter Location");
			document.forms["fr"]["location"].focus();
			return false;
		}
		if (d == "") {
			alert("Enter Capacity");
			document.forms["fr"]["capacity"].focus();
			return false;
		}
		if (isNaN(d) || d.indexOf(" ") != -1) {
			alert("Enter numeric value")
			return false;
		}
		/*if(e==null)
		{
		alert("Choose an option for hired by");
		 document.forms["fr"]["hiredby"].focus();
		return false;
		}*/
		if (f == 0) {
			alert("Choose an option for ownedBy");
			document.forms["fr"]["depotRRCinownedby"].focus();
			return false;
		}
		if (g == 0) {
			alert("Choose an option for managed By");
			document.forms["fr"]["depotRRCinmanagedby"].focus();
			return false;
		}
		if (h == "") {
			alert("Enter name");
			document.forms["fr"]["name"].focus();
			h = str.match(/[a-zA-Z]/);
			if (h != null) {
				alert("Enter only alphabets");
			}
			return false;
		}
		if (i == "") {
			alert("Enter designation");
			document.forms["fr"]["designation"].focus();
			return false;
		}
		if (j == "") {
			alert("Enter mobile no.");
			document.forms["fr"]["mobile"].focus();
			return false;
		}
		if (isNaN(j) || j.indexOf(" ") != -1) {
			alert("Enter numeric value")
			return false;
		}
		if (j.length<10 || j.length>10) {
			alert("enter 10 characters");
			return false;
		}

		return true;
	}
</script>

</html>


