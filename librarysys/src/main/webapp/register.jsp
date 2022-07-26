<%@ taglib uri="/struts-tags" prefix="s" %>  
<hr/>  
<h1>Library Management System</h1>

  
<s:form action="registerAction">  
<s:textfield name="username" label="Username"></s:textfield>  
<s:textfield name="name" label="Name"></s:textfield>
<s:textfield name="phno" label="Phone Number"></s:textfield>
<s:password name="userpass" label="Password"></s:password> 
<s:textfield name="mail" label="Mail ID"></s:textfield>
 
<s:submit value="Register"></s:submit>  
</s:form>  
