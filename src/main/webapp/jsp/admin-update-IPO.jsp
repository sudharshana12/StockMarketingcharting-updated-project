<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.*,com.example.stockspring.model.IPOsPlanned"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<head>
<title>Admin Manage Ipo</title>
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
			IPOs</h2>



		<%
			List ipoList = (List) request.getAttribute("ipoList");
			
		%>
		<table class="managecmp-page-table">
			<tr>
				<th>ID</th>
				<th>Company Code</th>
				<th>Stock Exchange</th>
				<th>price per share</th>
				<th>Total Shares</th>
				<th>Open Date</th>
				<th>Remarks</th>
			</tr>

			<%
				for (int i = 0; i < ipoList.size(); i++) {
					IPOsPlanned ipos = (IPOsPlanned) ipoList.get(i);
			%>
			<tr>

				<td><%=ipos.getId()%></td>
				<td><%=ipos.getCompanyCode()%></td>
				<td><%=ipos.getStockExchange()%></td>
				<td><%=ipos.getPricePerShare()%></td>
				<td><%=ipos.getTotalNumberOfShares()%>
				<td><%=ipos.getOpenDateTime()%>
				<td><%=ipos.getRemarks()%></td>
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