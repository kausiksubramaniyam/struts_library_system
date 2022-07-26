<hr/>  
<%@ taglib uri="/struts-tags" prefix="s" %>  
 <h1>Library Management System</h1>
 <h2>Admin Login</h2>
 <hr>
<s:form action="adminloginprocess">  
<s:textfield name="adminid" label="AdminID"></s:textfield>  
<s:password name="adminpass" label="Password"></s:password>  
<s:submit value="login"></s:submit>  
</s:form>  
<hr>

