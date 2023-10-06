package pds;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;

//import sun.reflect.ReflectionFactory.GetReflectionFactoryAction;
public class dblogic {
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	private String result1;

	public ResultSet retlogin(String username, String password, String usertype)
			throws SQLException, ClassNotFoundException {

		rs = dbconnect.getStatement().executeQuery("select * from login where username='" + username + "'and password='"
				+ password + "' and usertype='" + usertype + "'");
		return rs;
	}

	public ResultSet retlogin1(String username, String password) throws SQLException, ClassNotFoundException {

		rs = dbconnect.getStatement()
				.executeQuery("select * from login where username='" + username + "'and password='" + password + "'");
		return rs;
	}

	public ResultSet retmethod(Long id) throws SQLException, ClassNotFoundException {

		rs = dbconnect.getStatement().executeQuery("select * from block where DISTRICT_ID=" + id + "");
		return rs;
	}

	public ResultSet retuser() throws SQLException, ClassNotFoundException {

		rs = dbconnect.getStatement().executeQuery("select * from district");
		return rs;
	}

	public ResultSet user() throws SQLException, ClassNotFoundException {

		rs = dbconnect.getStatement().executeQuery("select * from depot");
		return rs;
	}

	public ResultSet Selectdistrict(Long id) throws SQLException, ClassNotFoundException {

		rs = dbconnect.getStatement().executeQuery("select * from depot where DEPOT_ID=" + id + "");
		return rs;

	}

	public int update1(String District, String Block, String Location, String Capacity, String Hiredby,
			String DepotRRCinownedby, String DepotRRCinmanagedby, Long id) throws SQLException, ClassNotFoundException {

		int i = dbconnect.getStatement()
				.executeUpdate("update depot set DISTRICT='" + District + "',BLOCK='" + Block + "',LOCATION='"
						+ Location + "',CAPACITY='" + Capacity + "',HIRED_BY='" + Hiredby + "',DEPOT_RRC_IN_OWNED_BY='"
						+ DepotRRCinownedby + "',DEPOT_RRC_IN_MANAGED_BY='" + DepotRRCinmanagedby + "' where DEPOT_ID="
						+ id + "");
		return i;
	}

	public ResultSet retmethod1(Long id) throws SQLException, ClassNotFoundException {

		rs = dbconnect.getStatement().executeQuery("select * from block where DISTRICT_ID=" + id + "");
		return rs;
	}

	public ResultSet district() throws SQLException, ClassNotFoundException {

		rs = dbconnect.getStatement().executeQuery("select * from district");
		return rs;
	}

	public ResultSet system() throws SQLException, ClassNotFoundException {

		rs = dbconnect.getStatement()
				.executeQuery("select * from depot where DEPOT_RRC_IN_OWNED_BY='FCI'and DEPOT_RRC_IN_MANAGED_BY='FCI'");
		return rs;
	}

	public ResultSet districtpage(Long id) throws SQLException, ClassNotFoundException {

		rs = dbconnect.getStatement().executeQuery("select * from depot where DEPOT_ID=" + id + "");
		return rs;

	}

	public int update(String District, String Block, String Location, String Capacity, String Hiredby,
			String DepotRRCinownedby, String DepotRRCinmanagedby, Long id) throws SQLException, ClassNotFoundException {

		int i = dbconnect.getStatement()
				.executeUpdate("update depot set DISTRICT='" + District + "',BLOCK='" + Block + "',LOCATION='"
						+ Location + "',CAPACITY='" + Capacity + "',HIRED_BY='" + Hiredby + "',DEPOT_RRC_IN_OWNED_BY='"
						+ DepotRRCinownedby + "',DEPOT_RRC_IN_MANAGED_BY='" + DepotRRCinmanagedby + "' where DEPOT_ID="
						+ id + "");
		return i;

	}

	public int registeradd(String depotname, String district, String result, String location, String capacity,
			String hiredby, String depotRRCinownedby, String depotRRCinmanagedby, String name, String description,
			Long mobile) throws SQLException, ClassNotFoundException {
		Long capa = Long.parseLong(capacity);
		rs = dbconnect.getStatement()
				.executeQuery("select 	DISTRICT_NAME from DISTRICT where DISTRICT_ID=" + district + "");
		String dist_name = null;
		if (rs.next()) {
			dist_name = rs.getString("DISTRICT_NAME");
		}

		int i = dbconnect.getStatement()
				.executeUpdate("insert into depot values(DEPOT1.nextval,'" + depotname + "','" + dist_name + "','"
						+ result + "','" + location + "'," + capa + ",'" + hiredby + "','" + depotRRCinownedby + "','"
						+ depotRRCinmanagedby + "')");

		int j = dbconnect.getStatement().executeUpdate("insert into INCHARGED values(INCHARGE_SEQ.nextval,'" + name
				+ "','" + description + "'," + mobile + ",DEPOT1.nextval-1)");

		return 0;
	}

	public int registeradd2(String date, Long depot_id, String rice_issue, String rice_receive, String wheat_issue,
			String wheat_receive, String sugar_issue, String sugar_receive) throws Exception {

		String sql = "select OPENING_BALANCE_RICE from RRC_OPENING_BALANCE where depot_id=" + depot_id + "";
		String sql2 = "select OPENING_BALANCE_WHEAT from RRC_OPENING_BALANCE where depot_id=" + depot_id + "";
		String sql3 = "select OPENING_BALANCE_SUGAR from RRC_OPENING_BALANCE where depot_id=" + depot_id + "";
		String sql6 = "select max(slno) from RRC_OPENING_BALANCE where depot_id=" + depot_id + "";

		ResultSet rs = dbconnect.getStatement().executeQuery(sql);
		ResultSet rs1 = dbconnect.getStatement().executeQuery(sql2);
		ResultSet rs2 = dbconnect.getStatement().executeQuery(sql3);
		ResultSet rs3 = dbconnect.getStatement().executeQuery(sql6);
		while (rs.next() && rs1.next() && rs2.next() && rs3.next()) {
			String OPENING_BALANCE_RICE = rs.getString("OPENING_BALANCE_RICE");
			String OPENING_BALANCE_WHEAT = rs1.getString("OPENING_BALANCE_WHEAT");
			String OPENING_BALANCE_SUGAR = rs2.getString("OPENING_BALANCE_SUGAR");
			Long slno = rs3.getLong(1);
			Long rice_issue1 = Long.parseLong(rice_issue);
			Long rice_receive1 = Long.parseLong(rice_receive);
			Long wheat_issue1 = Long.parseLong(wheat_issue);
			Long wheat_receive1 = Long.parseLong(wheat_receive);
			Long sugar_issue1 = Long.parseLong(sugar_issue);
			Long sugar_receive1 = Long.parseLong(sugar_receive);
			Long OPENING_BALANCE_RICE1 = Long.parseLong(OPENING_BALANCE_RICE);

			Long OPENING_BALANCE_WHEAT1 = Long.parseLong(OPENING_BALANCE_WHEAT);
			Long OPENING_BALANCE_SUGAR1 = Long.parseLong(OPENING_BALANCE_SUGAR);
			Long total = OPENING_BALANCE_RICE1 - rice_issue1;
			Long total1 = total + rice_receive1;

			Long total2 = OPENING_BALANCE_WHEAT1 - wheat_issue1;
			Long total3 = total2 + wheat_receive1;
			Long total4 = OPENING_BALANCE_SUGAR1 - sugar_issue1;
			Long total5 = total4 + sugar_receive1;

			System.out.println(total + "");
			System.out.println(total1 + "");
			System.out.println(total3 + "");
			System.out.println(total5 + "");

			String sql1 = "update RRC_OPENING_BALANCE set OPENING_BALANCE_RICE =" + total1 + " where DEPOT_ID="
					+ depot_id + " and slno=" + slno + "";
			System.out.println(sql1);

			String sql4 = "update RRC_OPENING_BALANCE set OPENING_BALANCE_WHEAT =" + total3 + " where DEPOT_ID="
					+ depot_id + " and slno=" + slno + "";
			String sql5 = "update RRC_OPENING_BALANCE set OPENING_BALANCE_SUGAR =" + total5 + " where DEPOT_ID="
					+ depot_id + " and slno=" + slno + "";
			System.out.println(sql4);
			System.out.println(sql5);
			int j = dbconnect.getStatement().executeUpdate(sql1);
			int k = dbconnect.getStatement().executeUpdate(sql4);
			int l = dbconnect.getStatement().executeUpdate(sql5);
		}
		int i = dbconnect.getStatement()
				.executeUpdate("insert into TRANSACTION_REPORT values(REPORT1.nextval,'" + date + "'," + depot_id + ",'"
						+ rice_issue + "','" + rice_receive + "','" + wheat_issue + "','" + wheat_receive + "','"
						+ sugar_issue + "','" + sugar_receive + "')");

		return 0;

	}

	/*
	 * public ResultSet Selectdistrict3(Long id)throws
	 * SQLException,ClassNotFoundException{
	 * 
	 * 
	 * rs=dbconnect.getStatement().
	 * executeQuery("select * from depot where DEPOT_ID="+id+""); return rs; }
	 */

	public ResultSet district1() throws SQLException, ClassNotFoundException {

		rs = dbconnect.getStatement().executeQuery("select * from district");
		return rs;
	}

	public ResultSet retmethod2(Long id) throws SQLException, ClassNotFoundException {

		rs = dbconnect.getStatement().executeQuery("select * from block where DISTRICT_ID=" + id + "");
		return rs;
	}

	public ResultSet retmethod3(String blname) throws SQLException, ClassNotFoundException {
		String sql = "select 	DEPOT_ID,DEPOT_NAME from depot where BLOCK='" + blname + "'";
		System.out.println(sql);
		rs = dbconnect.getStatement().executeQuery(sql);
		return rs;
	}

	public ResultSet RRCregister(String dstid, String block, String depo) throws SQLException, ClassNotFoundException {

		Long idd = Long.parseLong(dstid);
		Long idd1 = Long.parseLong(depo);

		rs = dbconnect.getStatement().executeQuery("select a.BLOCK,a.LOCATION,b.NAME,b.DESCRIPTION,b.MOBILE "
				+ ",c.OPENING_BALANCE_RICE,c.OPENING_BALANCE_WHEAT,c.OPENING_BALANCE_SUGAR from depot a,INCHARGED b,"
				+ "RRC_OPENING_BALANCE c where a.DEPOT_ID=b.DEPOT_ID and a.DEPOT_ID=c.DEPOT_ID  and a.DEPOT_ID=" + idd1
				+ "");

		return rs;

	}

	public int update2(String block, String location, String name, String description, Long mobile,
			String openingbalancerice, String openingbalancewheat, String openingbalancesugar, Long id)
			throws SQLException {

		int i = dbconnect.getStatement().executeUpdate(
				"update depot set BLOCK='" + block + "',LOCATION='" + location + "'where DEPOT_ID=" + id + "");
		int j = dbconnect.getStatement().executeUpdate("update incharged set NAME='" + name + "',DESCRIPTION='"
				+ description + "',MOBILE=" + mobile + " where DEPOT_ID=" + id + "");
		int k = dbconnect.getStatement()
				.executeUpdate("update  RRC_OPENING_BALANCE set OPENING_BALANCE_RICE='" + openingbalancerice
						+ "',OPENING_BALANCE_WHEAT='" + openingbalancewheat + "',OPENING_BALANCE_SUGAR='"
						+ openingbalancesugar + "'where DEPOT_ID=" + id + "");
		System.out.println(i);
		return i;

	}

	public ResultSet district2() throws SQLException, ClassNotFoundException {

		rs = dbconnect.getStatement().executeQuery("select * from district");
		return rs;
	}

	public ResultSet retmethod4(Long id) throws SQLException, ClassNotFoundException {

		rs = dbconnect.getStatement().executeQuery("select * from block where DISTRICT_ID=" + id + "");
		return rs;
	}

	public ResultSet retmethod5(String blname) throws SQLException, ClassNotFoundException {
		String sql = "select 	DEPOT_ID,DEPOT_NAME from depot where BLOCK='" + blname + "'";
		System.out.println(sql);
		rs = dbconnect.getStatement().executeQuery(sql);
		return rs;
	}

	public ResultSet district3() throws SQLException, ClassNotFoundException {

		rs = dbconnect.getStatement().executeQuery("select * from district");
		return rs;
	}

	public ResultSet reportreg(String block) throws SQLException, ClassNotFoundException {

		rs = dbconnect.getStatement().executeQuery("select * from depot where BLOCK='" + block + "'");

		return rs;

	}

	public ResultSet reportdetail() throws SQLException, ClassNotFoundException {

		rs = dbconnect.getStatement().executeQuery(
				"select  a.DISTRICT,a.BLOCK,a.LOCATION,a.DEPOT_RRC_IN_OWNED_BY,a.DEPOT_RRC_IN_MANAGED_BY,a.HIRED_BY,a.CAPACITY,b.NAME,b.DESCRIPTION,b.MOBILE from depot a,INCHARGED b where a.DEPOT_ID=b.DEPOT_ID ");

		return rs;

	}

	public ResultSet delet(String r, String depo) throws SQLException, ClassNotFoundException {
		System.out.println("enteruuuuuuuuu");
		int id = Integer.parseInt(depo);
		System.out.println(r);
		if (r == "rice") {
			System.out.println("LL" + r);
			rs = dbconnect.getStatement().executeQuery(
					"select a.TRID,a.DATE_OF_TRANSACTION,b.NAME,b.MOBILE ,c.LOCATION,a.RICE_ISSUE,a.RICE_RECEIVE	from TRANSACTION_REPORT a,INCHARGED b ,DEPOT c where a.DEPOT_ID=b.DEPOT_ID and a.DEPOT_ID=c.DEPOT_ID and a.RICE_ISSUE!=0 and  a.RICE_RECEIVE!=0 and a.DEPOT_ID="
							+ id + "");
			return rs;
		} else if (r == "wheat") {
			System.out.println("kk" + r);
			rs = dbconnect.getStatement().executeQuery(
					"select  a.TRID,a.DATE_OF_TRANSACTION,b.NAME,b.MOBILE ,c.LOCATION,a.WHEAT_ISSUE,a.WHEAT_RECEIVE	from TRANSACTION_REPORT a,INCHARGED b ,DEPOT c where a.DEPOT_ID=b.DEPOT_ID and a.DEPOT_ID=c.DEPOT_ID and a.WHEAT_ISSUE!=0 and  a.WHEAT_RECEIVE!=0 and a.DEPOT_ID="
							+ id + "");
			return rs;
		} else {
			System.out.println("pp" + r);
			rs = dbconnect.getStatement().executeQuery(
					"select a.TRID,a.DATE_OF_TRANSACTION,b.NAME,b.MOBILE ,c.LOCATION,a.SUGAR_ISSUE,a.SUGAR_RECEIVE	from TRANSACTION_REPORT a,INCHARGED b ,DEPOT c where a.DEPOT_ID=b.DEPOT_ID and a.DEPOT_ID=c.DEPOT_ID and a.SUGAR_ISSUE!=0 and  a.SUGAR_RECEIVE!=0 and a.DEPOT_ID="
							+ id + "");
			return rs;
		}
		// sreturn rs;

	}

	public int deleteMsg(int id, String food) throws Exception {
		int i = 0;
		if (food == "rice") {
			i = dbconnect.getStatement()
					.executeUpdate("update TRANSACTION_REPORT set RICE_ISSUE=0,RICE_RECEIVE=0 where TRID=" + id + "");
			return i;
		} else if (food == "wheat") {
			i = dbconnect.getStatement()
					.executeUpdate("update TRANSACTION_REPORT set WHEAT_ISSUE=0,WHEAT_RECEIVE=0 where TRID=" + id + "");
			return i;
		} else {
			i = dbconnect.getStatement()
					.executeUpdate("update TRANSACTION_REPORT set SUGAR_ISSUE=0,SUGAR_RECEIVE=0 where TRID=" + id + "");
			return i;
		}

	}

	public ResultSet selectDetails(String bname) throws Exception {
		ResultSet rs = dbconnect.getStatement().executeQuery("select count");
		return rs;
	}

	public int insertOpenClose(Long depotId, String riceIssue, String wheatIssue, String sugarIssue) throws Exception {
		int MILLIS_IN_DAY = 1000 * 60 * 60 * 24;
		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MMM/yy");
		String prevDate = dateFormat.format(date.getTime() - MILLIS_IN_DAY);
		String currDate = dateFormat.format(date.getTime());
		String nextDate = dateFormat.format(date.getTime() + MILLIS_IN_DAY);
		System.out.println("Previous date: " + prevDate);
		System.out.println("Currnent date: " + currDate);
		System.out.println("Next date: " + nextDate);
		int i = dbconnect.getStatement().executeUpdate("insert into CLOSINGBALANSSE values(close_seq.nextval,'"
				+ riceIssue + "','" + wheatIssue + "','" + sugarIssue + "','" + currDate + "'," + depotId + ")");
		int j = dbconnect.getStatement().executeUpdate("insert into RRC_OPENING_BALANCE values(close_seq.nextval-1,'"
				+ riceIssue + "','" + wheatIssue + "','" + sugarIssue + "'," + depotId + ",'" + nextDate + "')");
		return 0;
	}

	public ResultSet selectcloseingbalancee(String r, int did) throws Exception {
		if (r == "rice") {
			ResultSet rs = dbconnect.getStatement().executeQuery(
					"select d.BLOCK_NAME,d.count(DEPOT_NAME),r.CLOSEING_BALANCE_RICE,t.count(RICE_ISSUE),t.count(RICE_RECEIVE),c.OPENING_BALANCE_RICE from depot d,RRC_OPENING_BALANCE r,TRANSACTION_REPORT t,CLOSINGBALANSSE c where d.DEPOT_ID=r.DEPOT_ID and r.DEPOT_ID=t.DEPOT_ID and t.DEPOT_ID=c.DEPOT_ID and d.DISTRICT=");
			return rs;
		} else if (r == "wheat") {
			return rs;
		} else {
			return rs;
		}

	}

}
