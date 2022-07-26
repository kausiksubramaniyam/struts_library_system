<%@ taglib uri="/struts-tags" prefix="s" %>  
<h1>Library Management System</h1> <hr> 
<br/>Admin Dashboard  <br><br>
<a href="adminhome">Back to Home</a> 
<a href="logout">Logout</a> 
<h3>Top Borrowing Users:</h3>  


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
 <table style="width:500px;">
 <tr>
    <th>User Name</th>
    <th>No. of Books</th>
  </tr>
<s:iterator  value="list">
  <tr>
    <td><s:property value="userid"/></td>
    <td><s:property value="bookusers"/></td>
  </tr>
  </s:iterator>
 </table>
 
 <h3>Top Books Borrowed:</h3>  
 <table style="width:500px;">
 <tr>
    <th>Book ID</th>
    <th>Book Name</th>
    <th>No. of Borrowers</th>
  </tr>
<s:iterator  value="list">
  <tr>
    <td><s:property value="bookid"/></td>
    <td><s:property value="bookname"/></td>
    <td><s:property value="booknum"/></td>
  </tr>
  </s:iterator>
 </table>
