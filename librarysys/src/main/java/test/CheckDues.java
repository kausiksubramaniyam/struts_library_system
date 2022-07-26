//SELECT sum(return_days) from borrowed WHERE user_id=?;
//package test;
//import java.sql.*; 
//import java.sql.DriverManager;  
//import java.sql.PreparedStatement;  
//import java.sql.ResultSet;
//
//import org.apache.struts2.ServletActionContext; 
//
//public class CheckDues {  
//	  
//public static boolean execute(){  
// boolean status=false;  
//try{
//	   Class.forName("com.mysql.jdbc.Driver");
//	   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
//	   String username=(String)ServletActionContext.getRequest().getSession(false).getAttribute("username");  
//	   PreparedStatement ps=conn.prepareStatement("select sum(return_days) as 'dues' from borrowed where user_id=? and return_days>30;");
//	   ps.setString(1,username);
//	   ResultSet rs = ps.executeQuery();
//	   if (rs.next()) {
//		    String a= rs.getString("dues");
//		  }
//	}
//	catch(Exception e){
//		e.printStackTrace();
//	}
//   return status;
//}
//}