package test;  

import org.apache.struts2.ServletActionContext;  
  
public class Profile {  
  
public String execute(){  
 
  
String a=(String)ServletActionContext.getRequest().getSession(false).getAttribute("username");  
if(a!=null && !a.equals("")){  
    return "success";  
}  
else{  
    return "error";  
}  
  
}  
}  