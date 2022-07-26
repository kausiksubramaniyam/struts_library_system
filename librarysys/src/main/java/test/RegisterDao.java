package test;  
import java.sql.*;  
public class RegisterDao {  
  
public static int save(RegisterAction r){  
int status=0;  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");  
  
PreparedStatement ps=con.prepareStatement("insert into users(user_id,name,mail_id,password,phone_num,books_in_hand,max_books,type,balance_dues) values(?,?,?,?,?,?,?,?,?)");  
ps.setString(1,r.getUsername());  
ps.setString(2,r.getName());  
ps.setString(3,r.getMail());  
ps.setString(4,r.getUserpass());  
ps.setString(5,r.getPhno());  
ps.setInt(6,0);  
ps.setInt(7,3);  
ps.setInt(8,0);  
ps.setInt(9,0);  
          
status=ps.executeUpdate();  
  
}catch(Exception e){e.printStackTrace();}  
    return status;  
}  
}  
