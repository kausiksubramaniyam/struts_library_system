package test;
import java.sql.*; 
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet; 

public class AdminLoginAction {  
	  
public static boolean validate(Integer adminid,String adminpass){  
 boolean status=false;  
try{
	   Class.forName("com.mysql.jdbc.Driver");
	   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
	   PreparedStatement ps=conn.prepareStatement("select password from admin where adminid=?");
	   ps.setInt(1,adminid);
	   ResultSet rs = ps.executeQuery();
	   if (rs.next()) {
		    String a= rs.getString("password");
		    if(a.equals(adminpass)){
		    	status=true;
		    }
		  }
	}
	catch(Exception e){
		e.printStackTrace();
	}
   return status;
}
}