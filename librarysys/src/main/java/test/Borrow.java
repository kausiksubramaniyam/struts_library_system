package test;  
  
public class Borrow {  
private Integer bookid;  
 
public Integer getBookid() {  
    return bookid;  
}  
  
public void setBookid(Integer bookid) {  
    this.bookid = bookid;  
} 
public String execute(){  
    if(BorrowAction.update(bookid)){  
        return "success";  
    }  
    else{  
        return "error";  
    }  
}  
public String returnbook(){  
    if(ReturnAction.update(bookid)){  
        return "success";  
    }  
    else{  
        return "error";  
    }  
} 
public String makerequest(){  
    if(MakeRequest.request(bookid)){  
        return "success";  
    }  
    else{  
        return "error";  
    }  
}  
}