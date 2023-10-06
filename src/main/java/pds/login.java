package pds;

import java.io.PrintWriter;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import pds.dbconnect;
public class login extends ActionSupport implements ServletRequestAware,ServletResponseAware{
	private String username,result1,usertype;
	private String password;
	private String districtid;
	private String districts;
	private String dist;

	public String getDist() {
		return dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getDistricts() {
		return districts;
	}

	public void setDistricts(String districts) {
		this.districts = districts;
	}
	//private String districtname;
	private Map<Integer,String>mapForSelect;
	private Map<String,String>mapForSelect1;
	public Map<String, String> getMapForSelect1() {
		return mapForSelect1;
	}

	public void setMapForSelect1(Map<String, String> mapForSelect1) {
		this.mapForSelect1 = mapForSelect1;
	}
	private String district;
	private String block;
	private String location;
	private String capacity;
	private String hiredby;
	private String depotRRCinownedby;
	private String depotRRCinmanagedby;
	private String loginid; 
	private Long depot_id;
	private Long id;
	private String name;
	private String description;
	private Long mobile;
	private String result;
	private String depo_id;
	private String date;
	private String rice_issue;
	private String rice_receive;
	private String wheat_issue;
	private String wheat_receive;
	private String sugar_issue;
	private String sugar_receive;
	private String result2;
	private String result3;
	private String districe;
	
	public String getDistrice() {
		return districe;
	}

	public void setDistrice(String districe) {
		this.districe = districe;
	}

	public String getDepo_id() {
		return depo_id;
	}

	public void setDepo_id(String depoId) {
		depo_id = depoId;
	}

	public String getResult2() {
		return result2;
	}

	public void setResult2(String result2) {
		System.out.println("Model class "+result2);
		this.result2 = result2;
	}

	public String getResult3() {
		return result3;
	}

	public void setResult3(String result3) {
		this.result3 = result3;
	}

	public String getRice_issue() {
		return rice_issue;
	}

	public void setRice_issue(String riceIssue) {
		rice_issue = riceIssue;
	}

	public String getRice_receive() {
		return rice_receive;
	}

	public void setRice_receive(String riceReceive) {
		rice_receive = riceReceive;
	}

	public String getWheat_issue() {
		return wheat_issue;
	}

	public void setWheat_issue(String wheatIssue) {
		wheat_issue = wheatIssue;
	}

	public String getWheat_receive() {
		return wheat_receive;
	}

	public void setWheat_receive(String wheatReceive) {
		wheat_receive = wheatReceive;
	}

	public String getSugar_issue() {
		return sugar_issue;
	}

	public void setSugar_issue(String sugarIssue) {
		sugar_issue = sugarIssue;
	}

	public String getSugar_receive() {
		return sugar_receive;
	}

	public void setSugar_receive(String sugarReceive) {
		sugar_receive = sugarReceive;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	private String openingbalancerice;
	private String openingbalancewheat;
	private String openingbalancesugar;
    Map session;

	public Map getSession() {
		return session;
	}

	public void setSession(Map session) {
		this.session = session;
	}

	public String getResult1() {
		return result1;
	}

	public void setResult1(String result1) {
		this.result1 = result1;
	}

	public String getOpeningbalancerice() {
		return openingbalancerice;
	}

	public void setOpeningbalancerice(String openingbalancerice) {
		this.openingbalancerice = openingbalancerice;
	}

	public String getOpeningbalancewheat() {
		return openingbalancewheat;
	}

	public void setOpeningbalancewheat(String openingbalancewheat) {
		this.openingbalancewheat = openingbalancewheat;
	}

	public String getOpeningbalancesugar() {
		return openingbalancesugar;
	}

	public void setOpeningbalancesugar(String openingbalancesugar) {
		this.openingbalancesugar = openingbalancesugar;
	}




	

	public String getResult() {
	return result;
}

public void setResult(String result) {
	this.result = result;
}




	 private String depotname;
	
	//private String SelectDistrict;
	
	/*public String getSelectDistrict() {
		return SelectDistrict;
	}*/

	/*public void setSelectDistrict(String selectDistrict) {
		SelectDistrict = selectDistrict;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getDepotname() {
		return depotname;
	}

	public void setDepotname(String depotname) {
		this.depotname = depotname;
	}




	HttpServletResponse res;
	HttpServletRequest req;
	ResultSet rs=null;

	
	
	

	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getDepot_id() {
		return depot_id;
	}
	public void setDepot_id(Long depotId) {
		depot_id = depotId;
	}
	public String getLoginid() {
		return loginid;
	}
	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getBlock() {
		return block;
	}

	public void setBlock(String block) {
		this.block = block;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}


	public String getDistrictid() {
		return districtid;
	}
	public void setDistrictid(String districtid) {
		this.districtid = districtid;
	}
	/*public String getDistrictname() {
		return districtname;
	}*/
	/*public void setDistrictname(String districtname) {
		this.districtname = districtname;
	}*/
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public String getHiredby() {
		return hiredby;
	}
	public void setHiredby(String hiredby) {
		this.hiredby = hiredby;
	}
	public String getDepotRRCinownedby() {
		return depotRRCinownedby;
	}
	public void setDepotRRCinownedby(String depotRRCinownedby) {
		this.depotRRCinownedby = depotRRCinownedby;
	}
	public String getDepotRRCinmanagedby() {
		return depotRRCinmanagedby;
	}
	public void setDepotRRCinmanagedby(String depotRRCinmanagedby) {
		this.depotRRCinmanagedby = depotRRCinmanagedby;
	}
	


	public void setPassword(String password) {
		this.password = password;
	}
	public Map<Integer, String> getMapForSelect() {
		return mapForSelect;
	}
	public void setMapForSelect(Map<Integer, String> mapForSelect) {
		this.mapForSelect = mapForSelect;
	}
	

	   public String show()throws Exception
	   {
		   String idd=req.getParameter("p");
		   Long id=Long.parseLong(idd);
		   System.out.println("ggg"+id);
		   String ret="<select name='result'>";
		  // String ret1="<select name='result'>";
			 
		   try
		   {
			   rs=dl.retmethod(id);
			  
			   //System.out.println(rs.next());
			   while(rs.next())
			   {
				  
				   ret+="<option value="+rs.getString("BLOCK_NAME")+">"+rs.getString("BLOCK_NAME")+"</option>" ;
				   System.out.println("gggg");
				 
					
			   }
			   rs.close();
			   ret+="</select>";
			   res.getOutputStream().print("");
			   res.getOutputStream().print(ret);
			   //res.getOutputStream().print(ret);
		   }
		   catch(Exception err)
		   {
			   System.out.println(err.getMessage());
			   
		   }
		   return null;
		   }

	public void setServletRequest(HttpServletRequest request) {
	this.req=request;
		
	}
	public HttpServletRequest getServletRequest(HttpServletRequest request) {
		return  request;
			
		}

	public void setServletResponse(HttpServletResponse res) {
		this.res=res;
	}
	
	
	
	public String registeraction()throws SQLException,ClassNotFoundException
	{	
		
	 int i=0;
	String s=getDistrict();
	String ss=getResult();
	
	
	System.out.println(s);
	System.out.println(ss);
	
	 i=dl.registeradd(getDepotname(),getDistrict(),getResult(),getLocation(),getCapacity(),getHiredby(),getDepotRRCinownedby(),getDepotRRCinmanagedby(),getName(),getDescription(),getMobile());
	   //i=dl.registeradd(depotname,district55,result,location,capacity,hiredby,depotRRCinownedby,depotRRCinmanagedby,description,name,mobile);
	  
	   reset();
	   return adddepot();
	}

	
	
	
	
	
	dblogic dl=new dblogic();
	public String loginData()throws SQLException, ClassNotFoundException
{
		
	  ResultSet rs=dl.retlogin(username,password,usertype);
	 System.out.println(username+password+usertype);
	  if(rs.next())
	  {
		  Map sess=ActionContext.getContext().getSession();
		  String usertype=rs.getString("usertype");
		  if(usertype.equals("admin"))
				  {
			  sess.put("UNAME",rs.getString(2));
			  return "admin";
			  
					  }
		  if(usertype.equals("incharge"))
		  {
			  sess.put("UNAME",rs.getString(2));
	  return "incharge";
	  
			  }
		  else
		  {
			  return "loginfail";
		  }
		 
	  }
	  return "loginfail";
}	  
	  
	
	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String login()throws SQLException, ClassNotFoundException
	{
			
		  ResultSet rs=dl.retlogin1(username,password);
		  if(rs.next())
		  {
			  String usertype=rs.getString("usertype");
			  if(usertype.equals("incharge"))
					  {
				  return "incharge";
				  
						  }
			  else
			  {
				  return "loginfail";
			  }
			 
		  }
		  return "loginfail";
	}	  
		  
	public String inchargeaction()throws Exception
	{	
		
	
		
	 int i=0;
	
	 i=dl.registeradd2(getDate(),getDepot_id(),getRice_issue(),getRice_receive(),getWheat_issue(),getWheat_receive(),getSugar_issue(),getSugar_receive());
	 
	 reset();
	 return adddepot();
	  
	   
	   
	}
	
	
	  public String adddepot()throws SQLException, ClassNotFoundException
	  {
		//Map session=ActionContext.getContext().getSession();
		//session.put("district_id", rs.getInt(2));
			
         mapForSelect =new HashMap<Integer,String>();
         ResultSet rs=dl.retuser();
         while(rs.next())
         {
        	 mapForSelect.put(rs.getInt(2),rs.getString(3));
         }
        	 return "displaydata";
        	 
         }
         
    public String viewdepot()throws SQLException, ClassNotFoundException
{
   mapForSelect =new HashMap<Integer,String>();
   ResultSet rs=dl.user();
   while(rs.next())
   {
  	 mapForSelect.put(rs.getInt(1),rs.getString(2));
   }
  	 return "displaydata";
  	 
   }
   

public String  view11()throws SQLException,ClassNotFoundException
{
	Long id=getDepot_id();
   ResultSet rs=dl. Selectdistrict(id);
    login la=new login();
    if(rs.next())
    {
    	setDistrict(rs.getString(3));
    	setBlock(rs.getString(4));
    	setLocation(rs.getString(5));
    	setCapacity(rs.getString(6));
    	setHiredby(rs.getString(7));
    	setDepotRRCinownedby(rs.getString(8));
    	setDepotRRCinmanagedby(rs.getString(9));
 
    	
    }
    return "view11";
    
    }
public String updateaction1() throws SQLException,ClassNotFoundException
{
	
	
	HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	Long id=Long.parseLong(request.getParameter("depot_id"));
	System.out.println(id);
	int i=dl.update1(getDistrict(),getBlock(),getLocation(),getCapacity(),getHiredby(),getDepotRRCinownedby(),getDepotRRCinmanagedby(),id);
	System.out.println(i);
	return "update";
}










public String show1()throws Exception
{
	   String idd=req.getParameter("p");
	   Long id=Long.parseLong(idd);
	   System.out.println("ggg"+id);
	   String ret="<select name='result'>";
	   try
	   {
		   rs=dl.retmethod(id);
		  
		   //System.out.println(rs.next());
		   while(rs.next())
		   {
			  
			   ret+="<option value="+rs.getString("BLOCK_NAME")+">"+rs.getString("BLOCK_NAME")+"</option>" ;
			   System.out.println("gggg");
	
		   }
		   rs.close();
		   ret+="</select>";
		   res.getOutputStream().print("");
		   res.getOutputStream().print(ret);
	   }
	   catch(Exception err)
	   {
		   System.out.println(err.getMessage());
		   
	   }
	   return null;
	   }

public String addRRC()throws SQLException, ClassNotFoundException
{
   mapForSelect =new HashMap<Integer,String>();
   ResultSet rs=dl.district1();
   while(rs.next())
   {
  	 mapForSelect.put(rs.getInt(2),rs.getString(3));
   }
  	 return "displaydata";
  	 
   }




public String show2()throws Exception
{
	   String idd=req.getParameter("p");
	   Long id=Long.parseLong(idd);
	   String ret="<select name='result' onchange='retrieve1(this.value)'>";
	   ret+="<option value=''>'--Select a Block--'</option>";
	   try{
		   rs=dl.retmethod2(id);
		     while(rs.next()){
			  ret+="<option value="+rs.getString("BLOCK_NAME")+" >"+rs.getString("BLOCK_NAME")+"</option>" ;
		   }
		   rs.close();
		   ret+="</select>";
		   res.getOutputStream().print("");
		   res.getOutputStream().print(ret);
	   }
	   catch(Exception err)
	   {
		   System.out.println(err.getMessage());
		   
	   }
	   return null;
	   }


public String show3()throws Exception
{
	String blokNm=req.getParameter("pp");
	System.out.println("Block name"+blokNm);
	String ret="<select name='result1'>";
	ret+="<option value=''>'--Select a depot name--'</option>";
	  
	try
	{
		rs=dl.retmethod3(blokNm);

		//System.out.println(rs.next());
		while(rs.next())
		{
			ret+="<option value="+rs.getString("DEPOT_ID")+" >"+rs.getString("DEPOT_NAME")+"</option>" ;

			//System.out.println("depot1");

			
		}
		rs.close();
		ret+="</select>";
		res.getOutputStream().print("");
		res.getOutputStream().print(ret);
	}
	catch(Exception err)
	{
		System.out.println("Msgg is"+err.getMessage());

	}
	return null;
}

public String  RRCregisteraction()throws SQLException,ClassNotFoundException
{
	
     String dstid=getDistrict();
     String block= getResult();
     String depo = getResult1();
	ResultSet rs=dl.RRCregister(dstid,block,depo);

	while(rs.next()) {
		setDepot_id(getDepot_id());
		setBlock(rs.getString("BLOCK"));
		setLocation(rs.getString("LOCATION"));
		setName(rs.getString("NAME"));
		setDescription(rs.getString("DESCRIPTION"));
		setMobile(rs.getLong("MOBILE"));
		setOpeningbalancerice(rs.getString("OPENING_BALANCE_RICE"));
		setOpeningbalancewheat(rs.getString("OPENING_BALANCE_WHEAT"));
		setOpeningbalancesugar(rs.getString("OPENING_BALANCE_SUGAR"));
}
	return "displaydata";
    
    }
public String RRCupdate() throws SQLException,ClassNotFoundException
{
	
	
	HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	Long id=Long.parseLong(request.getParameter("result1"));
	System.out.println(id);
	int i=dl.update2(getBlock(),getLocation(),getName(),getDescription(),getMobile(),getOpeningbalancerice(),getOpeningbalancewheat(),getOpeningbalancesugar(),id);
	
	return "update";
}











public String deletdist()throws SQLException, ClassNotFoundException
{
   mapForSelect =new HashMap<Integer,String>();
   ResultSet rs=dl.district2();
   while(rs.next())
   {
  	 mapForSelect.put(rs.getInt(2),rs.getString(3));
   }
  	 return "displaydata";
  	 
   }
public String deletdist1()throws SQLException, ClassNotFoundException
{
   mapForSelect1 =new HashMap<String,String>();
   ResultSet rs=dl.district2();
   while(rs.next())
   {
  	 mapForSelect1.put(rs.getString(3),rs.getString(3));
   }
  	 return "displaydata";
  	 
   }
public String show4()throws Exception
{
	   String idd=req.getParameter("p");
	   System.out.println("Dist id::"+idd);
	   Long id=Long.parseLong(idd);
	   System.out.println("Call show method");
	   String ret="<select name='result2' onchange='retrieve1(this.value)'>";
	   ret+="<option >'--Select a Block--'</option>";
	   try{
		   rs=dl.retmethod4(id);
		     while(rs.next()){
			  ret+="<option value="+rs.getString("BLOCK_NAME")+" >"+rs.getString("BLOCK_NAME")+"</option>" ;
		   }
		   rs.close();
		   ret+="</select>";
		   res.getOutputStream().print("");
		   res.getOutputStream().print(ret);
	   }
	   catch(Exception err)
	   {
		   System.out.println(err.getMessage());
		   
	   }
	   return null;
	   }


public String show5()throws Exception
{
	String blokNm=req.getParameter("pp");
	System.out.println("Block name"+blokNm);
	String ret="<select name='depo_id'>";
	ret+="<option >'--Select a depot name--'</option>";
	  
	try
	{
		rs=dl.retmethod5(blokNm);

		//System.out.println(rs.next());
		while(rs.next())
		{
			ret+="<option value="+rs.getString("DEPOT_ID")+" >"+rs.getString("DEPOT_NAME")+"</option>" ;

			//System.out.println("depot1");

			
		}
		rs.close();
		ret+="</select>";
		res.getOutputStream().print("");
		res.getOutputStream().print(ret);
	}
	catch(Exception err)
	{
		System.out.println("Msgg is"+err.getMessage());

	}
	return null;
}
public String deletaction()throws SQLException, ClassNotFoundException
{
	Map se=ActionContext.getContext().getSession();
	HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	 ArrayList<login> al=new ArrayList<login>();
	 String dstid=getDistrict();
	 //System.out.println("Block :"+req.getParameter("pp"));
     String block= getResult();
     System.out.println(block);
     String depo = getResult1();
      System.out.println("depo id is"+depo);
      System.out.println("pp"+block);
      System.out.println("pp"+depo);
      String rice=request.getParameter("r");
      //String wheat=request.getParameter("wheat");
     // String sugar=request.getParameter("sugar");
     // System.out.println("Sugar is"+sugar);
     // System.out.println("Wheate is"+block);
      System.out.println("Rice is"+rice);
      se.put("FOOD",rice);
      
	 ResultSet rs=dl.delet(rice,depo);
//System.out.println(rs.next());
    while(rs.next())
    {
	   
	    login la=new login();
	    la.setDepo_id(rs.getString(1));
		la.setDate(rs.getString(2));
		la.setName(rs.getString(3));
		la.setMobile(rs.getLong(4));
		la.setLocation(rs.getString(5));
		la.setRice_issue(rs.getString(6));
		la.setRice_receive(rs.getString(7));
				
		
		al.add(la);
	}
	Map session1=ActionContext.getContext().getSession();
	session1.put("ALIST",al);

	
	return "displaydata";   
  	   
   }








public String show6()throws Exception
{
	System.out.println("grjgjrjgojreooriemmmmmmmmmmmmm");
	   String idd=req.getParameter("p");
	   Long id=Long.parseLong(idd);
	   System.out.println("ggg"+id);
	   String ret="<select name='result' onchange='retrive1(this.value)'><option value='--plz select---'>'--plz select---'</option>";
	  // String ret1="<select name='result'>";
		 
	   try
	   {
		   rs=dl.retmethod(id);
		  
		   //System.out.println(rs.next());
		   while(rs.next())
		   {
			  
			   ret+="<option value="+rs.getString("BLOCK_NAME")+">"+rs.getString("BLOCK_NAME")+"</option>" ;
			   System.out.println("gggg");
			 
				
		   }
		   rs.close();
		   ret+="</select>";
		   res.getOutputStream().print("");
		   res.getOutputStream().print(ret);
		   //res.getOutputStream().print(ret);
	   }
	   catch(Exception err)
	   {
		   System.out.println(err.getMessage());
		   
	   }
	   return null;
	   }
public String repot()throws SQLException, ClassNotFoundException
{
   mapForSelect =new HashMap<Integer,String>();
   ResultSet rs=dl.district3();
   
   while(rs.next())
   {
  	mapForSelect.put(rs.getInt(2),rs.getString(3));
  	
   }
  	 return "displaydata";
  	 
   }


public String statushire()throws SQLException, ClassNotFoundException
{
	   mapForSelect =new HashMap<Integer,String>();
	   ResultSet rs=dl.district3();
	   
	   while(rs.next())
	   {
	  	mapForSelect.put(rs.getInt(2),rs.getString(3));
	  	
	   }
	  	 return "displaydata";
	  	 
	   }

public String depotreg()throws SQLException, ClassNotFoundException
{
   
   
   ResultSet rs=dl.reportreg(block);
   while(rs.next())
   {

    int noofdepot=rs.getInt(3);
    int noofdepothire=rs.getInt(4);
    int noofdepotdehire=rs.getInt(5);
   }
   return "displaydata";



}

public String regdetail()throws SQLException, ClassNotFoundException
{
	    
	ArrayList<login> al=new ArrayList<login>();
	ResultSet rs=dl.reportdetail();
	System.out.println(111);
	while(rs.next())
	{
		login la=new login();
		la.setDistrict(rs.getString(1));
		la.setBlock(rs.getString(2));
		la.setLocation(rs.getString(3));
		la.setDepotRRCinownedby(rs.getString(4));
		la.setDepotRRCinmanagedby(rs.getString(5));
		la.setHiredby(rs.getString(6));
		la.setCapacity(rs.getString(7));
		la.setName(rs.getString(8));
		la.setDescription(rs.getString(9));
		la.setMobile(rs.getLong(10));				
		
		al.add(la);
	}
	Map session1=ActionContext.getContext().getSession();
	session1.put("ALIST",al);

	
		return "displaydata";   
   
   }
public String deleteMsg()throws Exception
{
	Map se=ActionContext.getContext().getSession();
	String food=(String)se.get("FOOD");
	int id=Integer.parseInt(req.getParameter("id"));
	int i=dl.deleteMsg(id,food);
return "deletemsg";
}

public String shownHireStatus()throws Exception
{
	String bname=req.getParameter("p");
	
	 ResultSet rs=dbconnect.getStatement().executeQuery("select * from DEPOT where BLOCK='"+bname+"'");
	 PrintWriter pw=res.getWriter();
	 pw.println("<table border='2' bordercolor='green'><tr><td>DEPOT_ID</td><td>DEPOT_NAME</td><td>DISTRICT</td><td>BLOCK</td><td>LOCATION</td><td>CAPACITY</td><td>STATUS</td><td>DEPOT_RRC_OWNEDBY</td><td>DEPOT_RRCMANAGED_BY</td><tr>");
	 //System.out.println(rs.next());
	 while(rs.next())
	 {
		 pw.println("<tr><td>");
		 pw.println(rs.getInt(1));
		 pw.println("</td>");
		 pw.println("<td>");
		 pw.println(rs.getString(2));
		 pw.println("</td>");
		 pw.println("<td>");
		 pw.println(rs.getString(3));
		 pw.println("</td>");
		 pw.println("<td>");
		 pw.println(rs.getString(4));
		 pw.println("</td>");
		 pw.println("<td>");
		 pw.println(rs.getString(5));
		 pw.println("</td>");
		 pw.println("<td>");
		 pw.println(rs.getLong(6));
		 pw.println("</td>");
		 pw.println("<td>");
		 pw.println(rs.getString(7));
		 pw.println("</td>");
		 pw.println("<td>");
		 pw.println(rs.getString(8));
		 pw.println("</td>");
		 pw.println("<td>");
		 pw.println(rs.getString(9));
		 pw.println("</td></tr>");
	 }
	pw.println("</table>");

	   return null;
}
public String closingBalances()throws Exception
{
	int i=dl.insertOpenClose(getDepot_id(),getRice_issue(),getWheat_issue(),getSugar_issue());
	return "close";
}
public String closingAction()throws Exception
{
	//HttpServletRequest request=(HttpServletRequest)ActionContext.getContext().get(ServletActionContext.HTTP_REQUEST);
	// rice=request.getParameter("r");
	String str=getDistricts();
	System.out.println(str);
	//int did=Integer.parseInt(str);
   // System.out.println("Rice is"+rice);
    
	// ResultSet rs=dl.selectcloseingbalancee(rice,did);
	if(str.equals("angul"))
	{
		return "angul";
	}
	if(str.equals("Jharsuguda"))
	{
		System.out.println("jha");
		return "jharsuguda";
	}
	if(str.equals("Balasore"))
	{
		return "Balasore";
	}
	if(str.equals("Sambalpur"))
	{
		return "Sambalpur";
	}

	
	return "fail";
}


public void reset()
{
	this.username="";
	this.password="";
	this.district="";
	this.block="";
	this.capacity="";
	this.depotname="";
	this.depotRRCinownedby="";
	this.depotRRCinmanagedby="";
	this.description="";
	this.hiredby="";
	this.sugar_issue="";
	this.name="";
	this.description="";
	this.depot_id=null;
	this.districtid=null;
	this.result1="";
	this.result="";
	this.date="";
	this.rice_issue="";
	this.rice_receive="";
	this.wheat_receive="";
	this.wheat_issue="";
	this.sugar_issue="";
	this.sugar_receive="";
	this.depot_id=null;
	this.location="";
	this.mobile=null;
	
	
	
}

public String riceTransfer()throws Exception
{
	System.out.println("yyyyyyyyyyy");
	String str=getDist();
	System.out.println(str);
	if(str.equals("Angul"))
	{
		return "riceangul";
	}
	if(str.equals("Jharsuguda"))
	{

		return "ricejharsuguda";
	}
	if(str.equals("Balasore"))
	{
		return "ricebalasore";
	}
	if(str.equals("Sambalpur"))
	{
		return "ricesambalpur";
	}

	
	return "fail";

}
public String sugarTransfer()throws Exception
{
	System.out.println("yyyyyyyyyyy");
	String str=getDist();
	System.out.println(str);
	if(str.equals("Angul"))
	{
		return "sugarangul";
	}
	if(str.equals("Jharsuguda"))
	{

		return "sugarjharsuguda";
	}
	if(str.equals("Balasore"))
	{
		return "sugarbalasore";
	}
	if(str.equals("Sambalpur"))
	{
		return "sugarsambalpur";
	}

	
	return "fail";

}
public String wheatTransfer()throws Exception
{
	
	System.out.println("yyyyyyyyyyy");
	String str=getDist();
	System.out.println(str);
	/*ResultSet rs=dbconnect.getStatement().executeQuery("select * from DISTRICT where DISTRICT_ID='"+str+"'");
	if(rs.next())
	{
		setDistrice(rs.getString(3));
	
	}
	String dist=getDistrice();
*/	if(str.equals("Angul"))
	{
		return "wheatangul";
	}
	if(str.equals("Jharsuguda"))
	{

		return "wheatjharsuguda";
	}
	if(str.equals("Balasore"))
	{
		return "wheatbalasore";
	}
	if(str.equals("Sambalpur"))
	{
		return "wheatsambalpur";
	}
	
	
	return "null";

}
public String shownDetails()throws Exception
{
	System.out.println("yyyyyyyyyyy");
	String bname=req.getParameter("p");
	System.out.println(bname);
	int no_of_depot=0;
	int dehier=0;
	int hier=0;
	int depotid=0;
	String ownby=null;
	String managedby=null;
	 ResultSet rs=dbconnect.getStatement().executeQuery("select count(DEPOT_NAME)from DEPOT where BLOCK='"+bname+"'");
	 ResultSet rs1=dbconnect.getStatement().executeQuery("select count(HIRED_BY) from DEPOT where BLOCK='"+bname+"' and HIRED_BY='dehire'");
	 ResultSet rs8=dbconnect.getStatement().executeQuery("select count(DEPOT_RRC_IN_OWNED_BY) from DEPOT where BLOCK='"+bname+"' and HIRED_BY='dehire'");
	 ResultSet rs9=dbconnect.getStatement().executeQuery("select count(DEPOT_RRC_IN_OWNED_BY) from DEPOT where BLOCK='"+bname+"' and DEPOT_RRC_IN_OWNED_BY='OSCSC'");
	// ResultSet rs2=dbconnect.getStatement().executeQuery("select DEPOT_ID,DEPOT_RRC_IN_OWNED_BY,DEPOT_RRC_IN_MANAGED_BY from DEPOT where BLOCK='"+bname+"'");
	 ResultSet rs3=dbconnect.getStatement().executeQuery("select count(HIRED_BY) from DEPOT where BLOCK='"+bname+"' and HIRED_BY='hire'");
	 ResultSet rs10=dbconnect.getStatement().executeQuery("select sum(CAPACITY) from DEPOT where BLOCK='"+bname+"'");
	 PrintWriter pw=res.getWriter();
	 pw.println("<table border='2' bordercolor='green'><tr><td>No of Depots</td><td>No of Depots Dehire</td><td>No of Depots Hire</td><td>OSCSC</td><td>CAPACITY</td><tr>");
	 //System.out.println(rs.next());
	 if(rs.next())
	 {
		 pw.println("<tr><td>");
		 pw.println(no_of_depot=rs.getInt(1));
		 pw.println("</td>");
	 }
	 if(rs1.next())
	 {
		 pw.println("<td>");
		 pw.println(dehier=rs1.getInt(1));
		 pw.println("</td>");
	 }

	 if(rs3.next())
	 {
		 pw.println("<td>");
		 pw.println( hier=rs3.getInt(1));
		 pw.println("</td>");
	 }

	 while(rs8.next())
	 {
		 System.out.println("hhh");
		 pw.println("<td>");
		 pw.println( rs8.getInt(1));
		 pw.println("</td>");
		 // rs2.getString(2);
		//rs2.getString(3);
	 }
	 while(rs10.next())
	 {
		 System.out.println("hhh");
		 pw.println("<td>");
		 pw.println( rs10.getInt(1));
		 pw.println("</td></tr></table>");
		// rs2.getString(2);
		//rs2.getString(3);
	 }


	   return null;
}
public String logOut()throws Exception
{
	Map se=ActionContext.getContext().getSession();
	session.remove("UNAME");
	return "logout";
}
}	
