<hr/>  
<%@ taglib uri="/struts-tags" prefix="s" %>  
  
<h1>Library Management System</h1><hr>
<br/>Welcome, <s:property value="username"/>  <br><br>

<% String s=(String)session.getAttribute("username"); 
System.out.println(s);%>
<a href="viewbooks">View and Borrow Books</a>  <br><br>
<a href="returnbook">Return Books</a> <br><br>
<a href="dues">Check dues</a> | <a href="logout">Logout</a> 
 