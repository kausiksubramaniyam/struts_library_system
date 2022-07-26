package test;  
import java.sql.*;  

import org.apache.struts2.ServletActionContext;

import java.util.ArrayList;  
  
public class ReturnBooks {  
ArrayList<Book> list=new ArrayList<Book>();  
  
public ArrayList<Book> getList() {  
    return list;  
}  
public void setList(ArrayList<Book> list) {  
    this.list = list;  
}  
public String execute(){  
 try{  
  Class.forName("com.mysql.jdbc.Driver");  
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");  
  
  String a=(String)ServletActionContext.getRequest().getSession(false).getAttribute("username");  
  PreparedStatement ps=con.prepareStatement("select bookid,borrowed_date from borrowed where user_id=?");  
  ps.setString(1,a);
  ResultSet rs=ps.executeQuery();    
  
  while(rs.next()){  
   Book book=new Book(); 
   String bkid=rs.getString(1);
   book.setBookid(rs.getString(1));  
   book.setBookname(rs.getString(2));    
   PreparedStatement ps2=con.prepareStatement("select bookname from books where bookid=?");  
   ps2.setString(1,bkid);
   ResultSet rs2=ps2.executeQuery();
   if(rs2.next()) {
	   String bkname=rs2.getString("bookname");
	   book.setVersion(bkname);
   }
   list.add(book); 
  }  
  
  con.close();  
 }catch(Exception e){e.printStackTrace();}  
          
 return "success";  
}  
}  