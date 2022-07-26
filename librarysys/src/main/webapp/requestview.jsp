<%@ taglib uri="/struts-tags" prefix="s" %>  
<h1>Library Management System</h1> <hr>
<br/>Most Requested books <br><br> 

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
td{
 text-align:center;
 }
</style>
 <table style="width:1200px;">
 <tr>
    <th>Book ID</th>
    <th>Book Name</th>
    <th>Number of Requests</th>
  </tr>
<s:iterator  value="list">
  <tr>
    <td><s:property value="bookid"/></td>
    <td><s:property value="bookname"/></td>
    <td><s:property value="requestnum"/></td>
  </tr>
  </s:iterator>
 </table>
