<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    import = "java.util.*,com.example.stockspring.model.Company"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CompanyList</title>
</head>
<body>
<%
List companyList = (List)request.getAttribute("cmpList");
System.out.println(companyList);

%>
<table>
<tr>
<th>Company Code</th>
<th>Company Name</th>
<th>Turn Over </th>
<th> CEO </th>th>
<th> Board of Directors </th>
<th> Sector Id</th>
<th> Brief </th>
</tr>

<%
for(int i=0;i<companyList.size();i++)
{
	Company cmp = (Company) companyList.get(i);

%>
<tr>

<td><%= cmp.getCompanyCode() %></td>
<td><%= cmp.getCompanyName() %></td>
<td><%= cmp.getTurnover() %></td>
<td><%= cmp.getCEO() %></td>
<td><%= cmp.getBoardOfDirectors() %>
<td><%= cmp.getSectorId() %>
<td><%= cmp.getCompanyCode() %></td>
<td><%= cmp.getBriefWriteup() %></td>
 <td><input type="button" name="tbl-button" id="tbl-button" value="Edit"></td>
</tr>
<% } %>
</table>
</body>
</html>