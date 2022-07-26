package test;  
import java.sql.*;  

import java.util.ArrayList;  
  
public class MostBorrowed {  
ArrayList<Dashboard> list=new ArrayList<Dashboard>();  
  
public ArrayList<Dashboard> getList() {  
    return list;  
}  
public void setList(ArrayList<Dashboard> list) {  
    this.list = list;  
}  

public String execute(){  
 try{  
  Class.forName("com.mysql.jdbc.Driver");  
  Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");  
              
  PreparedStatement ps=con.prepareStatement("SELECT user_id,COUNT(user_id) AS most_borrowed FROM borrowed GROUP BY user_id ORDER BY most_borrowed DESC LIMIT 5;");  
  ResultSet rs=ps.executeQuery();    
  
  PreparedStatement ps2=con.prepareStatement("SELECT bookid,COUNT(bookid) AS most_borrowed FROM borrowed GROUP BY bookid ORDER BY most_borrowed DESC LIMIT 5;");  
  ResultSet rs2=ps2.executeQuery();
  while(rs.next()){  
   Dashboard Dsb=new Dashboard();  
   Dsb.setUserid(rs.getString(1));  
   Dsb.setBookusers(rs.getString(2));  
   list.add(Dsb);    
  }  
  while(rs2.next()){  
   Dashboard Dsb=new Dashboard();  
   Dsb.setBookid(rs2.getString(1));  
   Dsb.setBooknum(rs2.getString(2)); 
   String bkid=rs2.getString(1);
   System.out.println(bkid);
   PreparedStatement ps3=con.prepareStatement("select bookname from books where bookid=?");  
   ps3.setString(1,bkid);
   ResultSet rs3=ps3.executeQuery();
   if(rs3.next()) {
	   String bkname=rs3.getString("bookname");
	   Dsb.setBookname(bkname);
   }
   list.add(Dsb);    
  }
  
  
  
  con.close();  
 }catch(Exception e){e.printStackTrace();}  
          
 return "success";  
}  
}  