package test;  
  
public class AddBooks {  
private Integer bookid,price,stock;
private String bookname,author,version,publisher;  


public Integer getBookid() {  
    return bookid;  
}  
  
public void setBookid(Integer bookid) {  
    this.bookid = bookid;  
}  
public String getBookname() {  
    return bookname;  
}  
  
public void setBookname(String bookname) {  
    this.bookname = bookname;  
}  
  
public String getAuthor() {  
    return author;  
}  
  
public void setAuthor(String author) {  
    this.author = author;  
}  
public String getVersion() {  
    return version;  
}  
  
public void setVersion(String version) {  
    this.version = version;  
}  
 
public String getPublisher() {  
    return publisher;  
}  
  
public void setPublisher(String publisher) {  
    this.publisher = publisher;  
}  
public Integer getPrice() {  
    return price;  
}  
  
public void setPrice(Integer price) {  
    this.price = price;  
}  
 
public Integer getStock() {  
    return stock;  
}  
  
public void setStock(Integer stock) {  
    this.stock = stock;  
}  

public String execute(){  
    int i=AddBooksAction.save(this);  
    if(i>0){  
    return "success";  
    }  
    return "error";  
}  
}  