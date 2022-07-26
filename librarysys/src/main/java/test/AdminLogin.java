package test;  
  
import java.util.Map;  
import org.apache.struts2.dispatcher.SessionMap;  
import org.apache.struts2.interceptor.SessionAware;  
  
public class AdminLogin implements SessionAware{  
private int adminid;
private String adminpass;  
SessionMap<String,String> sessionmap;  
  
public Integer getAdminid() {  
    return adminid;  
}  
  
public void setAdminid(Integer adminid) {  
    this.adminid = adminid;  
}  
  
public String getAdminpass() {  
    return adminpass;  
}  
  
public void setAdminpass(String adminpass) {  
    this.adminpass = adminpass;  
}  

public String execute(){  
    if(AdminLoginAction.validate(adminid, adminpass)){  
        return "success";  
    }  
    else{  
        return "error";  
    }  
}  

  
public void setSession(Map map) {  
    sessionmap=(SessionMap)map;  
    sessionmap.put("login","true");  
}  
  
public String logout(){  
    sessionmap.invalidate();  
    return "success";  
}  
  
}  