package test;  
  
import java.util.Map; 
 
import org.apache.struts2.dispatcher.SessionMap;  
import org.apache.struts2.interceptor.SessionAware;  
  
public class LoginAction implements SessionAware{  

private String username,userpass;  
SessionMap<String,Object> sessionmap;  

@Override  
public void setSession(Map<String,Object> map) {
    sessionmap=(SessionMap<String,Object>)map;  
}
public String getUsername() {  
    return username;  
}  
  
public void setUsername(String username) {  
    this.username = username;  
}  
  
public String getUserpass() {  
    return userpass;  
}  
  
public void setUserpass(String userpass) {  
    this.userpass = userpass;  
}  

public String execute(){  
    if(LoginDao.validate(username, userpass)){ 
    	sessionmap.put("username",getUsername());
        return "success";  
    }  
    else{  
        return "error";  
    }  
}  

  
  
public String logout(){  
    sessionmap.invalidate();  
    return "success";  
}  
  
}  