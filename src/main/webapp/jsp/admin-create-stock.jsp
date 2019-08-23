<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>

<head>
<title>Admin Manage Exchange</title>
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
					href="admin-landing-page.html">Home <span class="sr-only">(current)</span></a>
				</li> &nbsp;&nbsp; &nbsp; &nbsp;
				<li class="nav-item"><a class="nav-link"
					href="admin-import-data.html">Import Data</a></li> &nbsp; &nbsp;&nbsp;
				&nbsp;
				<li class="nav-item"><a class="nav-link"
					href="admin-manage-company.html">Manage Company</a></li> &nbsp;
				&nbsp;&nbsp; &nbsp;
				<li class="nav-item"><a class="nav-link"
					href="admin-manage-exchange.html">Manage Exchange</a></li> &nbsp;
				&nbsp;&nbsp; &nbsp;
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
	<form:form method="POST" action="/Admin/createStock"
		modelAttribute="stock">
		<div>
			<h3 class="text-center" style="margin-top: 20px;">Create New
				Exchange</h3>
			<div class="form-group row"
				style="margin-left: 690px; margin-top: 60px">
				<label for="stock-id" class="col-sm-2 col-form-label">Stock Id</label>
				<div class="col-sm-3">
					<form:input type="text" path="id" class="form-control"
						id="stock-id" placeholder="Stock Id" />
				</div>
			</div>
			<div class="form-group row"
				style="margin-left: 690px; margin-top: 60px">
				<label for="stock-name" class="col-sm-2 col-form-label">StockExchange
					Name</label>
				<div class="col-sm-3">
					<form:input type="text" path="stockExchangeName" class="form-control"
						id="stock-name" placeholder="StockExchange Name" />
				</div>
			</div>
			<div class="form-group row"
				style="margin-left: 690px; margin-top: 60px">
				<label for="stock-address" class="col-sm-2 col-form-label">Contact Address
					</label>
				<div class="col-sm-3">
					<form:input type="text" path="contactAddress" class="form-control"
						id="stock-address" placeholder="Contact Address" />
				</div>
			</div>
			<div class="form-group row"
				style="margin-left: 690px; margin-top: 60px">
				<label for="stock-desc" class="col-sm-2 col-form-label">Brief</label>
				<div class="col-sm-3">
					<form:input type="text" path="brief"
						class="form-control" id="stock-desc"
						placeholder="brief" />
				</div>
			</div>
			<div class="form-group row"
				style="margin-left: 690px; margin-top: 60px">
				<label for="remarks" class="col-sm-2 col-form-label">Remarks</label>
				<div class="col-sm-3">
					<form:input type="text" path="remarks" class="form-control"
						id="remarks" placeholder="remarks" />
				</div>
			</div>

			<div class="form-group row">
				<div class="col-sm-10" style="margin-left: 900px; margin-top: 70px;">
					<button type="submit" class="btn btn-primary">Save</button>
				</div>
			</div>
		</div>
	</form:form>
	<div class="footer">
		<p class="footer-text">Stock Exchange</p>
	</div>
</body>

</html>