package test;  
import java.sql.*;  

import org.apache.struts2.ServletActionContext;

import java.util.ArrayList;  
  
public class ShowBooks {  
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
              
  PreparedStatement ps=con.prepareStatement("select bookid,bookname,author,version,publisher from books where stock>0");  
  ResultSet rs=ps.executeQuery();    
  
  while(rs.next()){  
   Book book=new Book();  
   book.setBookid(rs.getString(1));  
   book.setBookname(rs.getString(2));  
   book.setAuthor(rs.getString(3));  
   book.setVersion(rs.getString(4));  
   book.setPublisher(rs.getString(5)); 
   list.add(book);  
   
     
  }  
  PreparedStatement ps2=con.prepareStatement("select bookid,bookname,author,version,publisher from books where stock=0");  
  ResultSet rs2=ps2.executeQuery();    
  
  while(rs2.next()){  
   Book book=new Book();  
   book.setBookid2(rs2.getString(1));  
   book.setBookname2(rs2.getString(2));  
   book.setAuthor2(rs2.getString(3));  
   book.setVersion2(rs2.getString(4));  
   book.setPublisher2(rs2.getString(5)); 
   list.add(book);  
   
     
  }  
  
  con.close();  
 }catch(Exception e){e.printStackTrace();}  
          
 return "success";  
}  
}  