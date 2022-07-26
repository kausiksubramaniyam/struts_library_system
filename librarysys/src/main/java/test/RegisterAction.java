package test;  
  
public class RegisterAction {  
private String username,name,phno,userpass,mail;  

public String getUsername() {  
    return username;  
}  
  
public void setUsername(String username) {  
    this.username = username;  
}  
public String getName() {  
    return name;  
}  
  
public void setName(String name) {  
    this.name = name;  
}  
  
public String getUserpass() {  
    return userpass;  
}  
  
public void setUserpass(String userpass) {  
    this.userpass = userpass;  
}  
public String getPhno() {  
    return phno;  
}  
  
public void setPhno(String phno) {  
    this.phno = phno;  
}  
  
public String getMail() {  
    return mail;  
}  
  
public void setMail(String mail) {  
    this.mail = mail;  
}  

public String execute(){  
    int i=RegisterDao.save(this);  
    if(i>0){  
    return "success";  
    }  
    return "error";  
}  
}  