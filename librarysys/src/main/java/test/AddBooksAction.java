package test;  
import java.sql.*;  
public class AddBooksAction {  
  
public static int save(AddBooks r){  
int status=0;  
try{  
Class.forName("com.mysql.jdbc.Driver");  
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");  
  
PreparedStatement ps=con.prepareStatement("insert into books(bookid,bookname,author,version,publisher,price,stock) values(?,?,?,?,?,?,?)");  
ps.setInt(1,r.getBookid());  
ps.setString(2,r.getBookname());  
ps.setString(3,r.getAuthor());  
ps.setString(4,r.getVersion());  
ps.setString(5,r.getPublisher());  
ps.setInt(6,r.getPrice());  
ps.setInt(7,r.getStock()); 
          
status=ps.executeUpdate();  

PreparedStatement ps2=con.prepareStatement("insert into requests(bookid,requestnum) values(?,?);");
ps2.setInt(1,r.getBookid());  
ps2.setInt(2,0); 

status=ps2.executeUpdate();
  
}catch(Exception e){e.printStackTrace();}  
    return status;  
}  
}  
