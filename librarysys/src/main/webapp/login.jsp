<hr/>  
<%@ taglib uri="/struts-tags" prefix="s" %>  
 <h1>Library Management System</h1>
 <hr>
<s:form action="loginprocess">  
<s:textfield name="username" label="UserName"></s:textfield>  
<s:password name="userpass" label="Password"></s:password>  
<s:submit value="login"></s:submit>  
</s:form>  

<a href="register">New User , Register Now</a>