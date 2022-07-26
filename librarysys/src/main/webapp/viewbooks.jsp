<%@ taglib uri="/struts-tags" prefix="s" %>  
<h1>Library Management System</h1> <hr>
<s:form action="borrow">  
<br/>Welcome, Here is the list of all our books. <s:property value="username"/>  <br><br>
<s:textfield name="bookid" label="Enter Book ID to Borrow"></s:textfield>  
<s:submit value="Borrow"></s:submit>  
</s:form>  

<a href="userhome">Back to home</a><br>
<a href="logout">Logout</a> 
<h3>All Books:</h3>  


<style>
table {
  border-collapse: collapse;
}

tr {
  border-bottom: 1px solid #ddd;
}
</style>
 <table style="width:1200px;">
 <tr>
    <th>Book ID</th>
    <th>Name</th>
    <th>Author</th>
    <th>Version</th>
    <th>Publisher</th>
  </tr>
<s:iterator  value="list">
  <tr>
    <td><s:property value="bookid"/></td>
    <td><s:property value="bookname"/></td>
    <td><s:property value="author"/></td>
    <td><s:property value="version"/></td>
    <td><s:property value="publisher"/></td> 
  </tr>
  </s:iterator>
 </table>

<br><br>

<s:form action="request">  
<h2>Out of Stock books</h2>
<s:textfield name="bookid" label="Enter Book ID to Request"></s:textfield>  
<s:submit value="Request"></s:submit>  
</s:form>  
<style>
table {
  border-collapse: collapse;
}

tr {
  border-bottom: 1px solid #ddd;
}
</style>
 <table style="width:1200px;">
 <tr>
    <th>Book ID</th>
    <th>Name</th>
    <th>Author</th>
    <th>Version</th>
    <th>Publisher</th>
  </tr>
<s:iterator  value="list">
  <tr>
    <td><s:property value="bookid2"/></td>
    <td><s:property value="bookname2"/></td>
    <td><s:property value="author2"/></td>
    <td><s:property value="version2"/></td>
    <td><s:property value="publisher2"/></td> 
  </tr>
  </s:iterator>
 </table>

