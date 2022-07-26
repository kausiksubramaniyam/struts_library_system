<%@ taglib uri="/struts-tags" prefix="s" %>  
<hr>  
<h1>Library Management System</h1>
<hr>
<h2>User Login</h2>

  
<s:form action="loginprocess">  
<s:textfield name="username" label="Name"></s:textfield>  
<s:password name="userpass" label="Password"></s:password>  
<s:submit value="login"></s:submit>  
</s:form>  

<a href="register">Register</a> <br><br>
<a href="adminlogin">Admin Login</a>  
