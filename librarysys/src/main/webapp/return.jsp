<%@ taglib uri="/struts-tags" prefix="s" %>  
<h1>Library Management System</h1> <hr>
<s:form action="return">  
<br><h3>Return Book</h3>  <br><br>
<s:textfield name="bookid" label="Enter Book ID to Return"></s:textfield>  
<s:submit value="Return"></s:submit>  
</s:form>  

<a href="userhome">Back to home</a><br>
<a href="logout">Logout</a> 
<h3>My Books:</h3>  


<style>
table {
  border-collapse: collapse;
}

tr {
  border-bottom: 1px solid #ddd;
}
td{
  text-align:center;
}
</style>
 <table style="width:1200px;">
 <tr>
    <th>Book ID</th>
    <th>Book Name</th>
    <th>Borrowed On</th>
  </tr>
<s:iterator  value="list">
  <tr>
    <td><s:property value="bookid"/></td>
    <td><s:property value="version"/></td>
    <td><s:property value="bookname"/></td>
  </tr>
  </s:iterator>
 </table>
