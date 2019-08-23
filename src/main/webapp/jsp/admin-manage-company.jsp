<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.*,com.example.stockspring.model.Company"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<head>
<title>Admin Manage Company</title>
<link rel="Stylesheet" href="/styles/style.css">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">

</head>

<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
		<a class="navbar-brand" href="#"><img src="/images/page-icon.png"
			width="30" height="30" alt=""> STOCK MARKETING</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown"
			aria-expanded="false" aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarNavDropdown">
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link"
					href="/Admin/admin-landing-page">Home <span class="sr-only">(current)</span>
				</a></li> &nbsp; &nbsp; &nbsp; &nbsp;
				<li class="nav-item"><a class="nav-link"
					href="/Admin/admin-import-data">Import Data</a></li> &nbsp; &nbsp;
				&nbsp; &nbsp;
				<li class="nav-item"><a class="nav-link" href="/createcompany">Manage
						Company</a></li> &nbsp; &nbsp; &nbsp; &nbsp;
				<li class="nav-item"><a class="nav-link" href="#">Manage
						Exchange</a></li> &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
				<li class="nav-item"><a class="nav-link" href="/cmpList">Company
						List</a></li> &nbsp; &nbsp; &nbsp; &nbsp;
						<li class="nav-item "><a class="nav-link"
					href="/Admin/createIpo">Manage IPOs</a></li> &nbsp; &nbsp;&nbsp; &nbsp;
				<li class="nav-item"><a class="nav-link" href="/Admin/viewIpo">Update
						IPO Details</a></li>

			</ul>
		</div>
		<div>
			<ul class="navbar-nav">
				<li class="nav-item active"><a class="nav-link" href="#">Logout</a>
				</li>
			</ul>
		</div>

	</nav>
	<div class="page-body">
		<h2 class="text-center" style="margin-top: 20px;">List of
			Companies</h2>



		<%
			List companyList = (List) request.getAttribute("cmpList");
		
		%>
		<table class="managecmp-page-table">
			<tr>
				<th>Company Code</th>
				<th>Company Name</th>
				<th>Turn Over</th>
				<th>CEO</th>
				<th>Board of Directors</th>
				<th>Sector Id</th>
				<th>Brief</th>
			</tr>

			<%
				for (int i = 0; i < companyList.size(); i++) {
					Company cmp = (Company) companyList.get(i);
			%>
			<tr>

				<td><%=cmp.getCompanyCode()%></td>
				<td><%=cmp.getCompanyName()%></td>
				<td><%=cmp.getTurnover()%></td>
				<td><%=cmp.getCEO()%></td>
				<td><%=cmp.getBoardOfDirectors()%>
				<td><%=cmp.getSectorId()%>
				<td><%=cmp.getBriefWriteup()%></td>
				<td><input type="button" name="tbl-button" id="tbl-button"
					value="Edit"></td>
			</tr>
			<%
				}
			%>

			<div class="footer">
				<p class="footer-text">Stock Exchange</p>
			</div>
</body>

</html>