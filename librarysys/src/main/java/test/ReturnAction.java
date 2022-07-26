package test;
import java.sql.*; 
import java.sql.DriverManager;  
import java.sql.PreparedStatement;

import org.apache.struts2.ServletActionContext;  

public class ReturnAction {  
	  
public static boolean update(Integer bookid){  
 boolean status=false;  
try{
	   Class.forName("com.mysql.jdbc.Driver");
	   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
	   PreparedStatement ps=conn.prepareStatement("UPDATE books SET stock=stock+1 WHERE bookid=?");
	   ps.setInt(1,bookid);
	   ps.executeUpdate();
	   String a=(String)ServletActionContext.getRequest().getSession(false).getAttribute("username");  
	   PreparedStatement ps2=conn.prepareStatement("UPDATE borrowed SET return_date=now() WHERE user_id=? and bookid=?");
	   ps2.setString(1,a);
	   ps2.setInt(2,bookid);
	   ps2.executeUpdate();
	   PreparedStatement ps3=conn.prepareStatement("UPDATE borrowed SET return_days=DATEDIFF(return_date,borrowed_date) WHERE user_id=? AND bookid=?;");
	   ps3.setString(1,a);
	   ps3.setInt(2,bookid);
	   ps3.executeUpdate();
	   status=true;
	}
	catch(Exception e){
		e.printStackTrace();
	}
   return status;
}
}