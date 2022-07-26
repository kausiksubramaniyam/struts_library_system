<hr/>  
<%@ taglib uri="/struts-tags" prefix="s" %>  
 <h1>Library Management System</h1>
 <h2>Admin - Add Book</h2>
 <hr>
<s:form action="addbooksaction">  
<s:textfield name="bookid" label="Book ID"></s:textfield>  
<s:textfield name="bookname" label="Book Name"></s:textfield> 
<s:textfield name="author" label="Author"></s:textfield> 
<s:textfield name="version" label="Version"></s:textfield> 
<s:textfield name="publisher" label="Publisher"></s:textfield> 
<s:textfield name="price" label="Price"></s:textfield> 
<s:textfield name="stock" label="Stock"></s:textfield> 

<s:submit value="Add Book"></s:submit>  
</s:form>  
<hr>