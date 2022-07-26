package test;
import java.sql.*; 
import java.sql.DriverManager;  
import java.sql.PreparedStatement;

public class MakeRequest {  
	  
public static boolean request(Integer bookid){  
 boolean status=false;  
try{
	   Class.forName("com.mysql.jdbc.Driver");
	   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
	   PreparedStatement ps=conn.prepareStatement("update requests set requestnum=requestnum+1 where bookid=?");
	   ps.setInt(1,bookid);
	   ps.executeUpdate(); 
	   status=true;
	}
	catch(Exception e){
		e.printStackTrace();
	}
   return status;
}
}