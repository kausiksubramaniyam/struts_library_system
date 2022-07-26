package test;
import java.sql.*; 
import java.sql.DriverManager;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet; 

public class LoginDao {  
	  
public static boolean validate(String username,String userpass){  
 boolean status=false;  
try{
	   Class.forName("com.mysql.jdbc.Driver");
	   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
	   PreparedStatement ps=conn.prepareStatement("select password from users where user_id=?");
	   ps.setString(1,username);
	   ResultSet rs = ps.executeQuery();
	   if (rs.next()) {
		    String a= rs.getString("password");
		    if(a.equals(userpass)){
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