package pds;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class dbconnect {
 public static Statement getStatement()
 {
	  Connection con=null;
	  Statement st=null;
	  try
	  {
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","pds","pds");
		  st=con.createStatement();
	  }
	  catch(Exception e)
	  {
		  e.printStackTrace();
	  }
	  return st;
 }
 }
 
