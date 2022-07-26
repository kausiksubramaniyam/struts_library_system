package test;  
import java.sql.*;  

import org.apache.struts2.ServletActionContext;

import java.util.ArrayList;  
  
public class ViewRequests {  
ArrayList<Requests> list=new ArrayList<Requests>();  
  
public ArrayList<Requests> getList() {  
    return list;  
}  
public void setList(ArrayList<Requests> list) {  
    this.list = list;  
}  
public String execute(){  
 try{  
  Class.forName("com.mysql.jdbc.Driver");  
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");  
   
  PreparedStatement ps=con.prepareStatement("SELECT bookid,requestnum FROM requests WHERE requestnum>0 ORDER BY requestnum DESC;");  
  ResultSet rs=ps.executeQuery();    
  
  while(rs.next()){  
   Requests book=new Requests(); 
   String bkid=rs.getString(1);
   book.setBookid(rs.getString(1));    
   PreparedStatement ps2=con.prepareStatement("select bookname from books where bookid=?");  
   ps2.setString(1,bkid);
   ResultSet rs2=ps2.executeQuery();
   if(rs2.next()) {
	   String bkname=rs2.getString("bookname");
	   book.setBookname(bkname);
   }
   book.setRequestnum(rs.getString(2));  
   list.add(book); 
  }  
  
  con.close();  
 }catch(Exception e){e.printStackTrace();}  
          
 return "success";  
}  
}  