<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<head>
<title>Admin-Import Data Page</title>
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
					href="/User/user-landing-company">Home <span class="sr-only">(current)</span></a>
				</li> &nbsp; &nbsp;&nbsp; &nbsp;
				<li class="nav-item"><a class="nav-link"
					href="/Admin/admin-import-data">Import Data</a></li> &nbsp; &nbsp;&nbsp;
				&nbsp;
				<li class="nav-item"><a class="nav-link"
					href="/createcompany">Manage Company</a></li> &nbsp;
				&nbsp;&nbsp; &nbsp;
				<li class="nav-item"><a class="nav-link" href="/Admin/createStock">Manage
						Exchange</a></li> &nbsp; &nbsp;&nbsp; &nbsp;
				<li class="nav-item"><a class="nav-link" href="/cmpList">Company
						List</a></li> &nbsp; &nbsp; &nbsp; &nbsp;
						<li class="nav-item ">
                    <a class="nav-link" href="/Admin/createIpo">Manage IPOs</a>
                </li>
                &nbsp; &nbsp;&nbsp; &nbsp;
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
		<h4 class="page-heading">Import Excel</h4>
		<label class="page-label">Select Excel file to be uploaded</label> <input
			type="file" name="file-input-box" id="file-input-box" value="Upload">
		<div class="page-link-div">
			<a href="#" class="import-page-link">Click Here to download
				sample Excel file</a>
		</div>

	</div>
	<div class="footer">
		<p class="footer-text">Stock Exchange</p>
	</div>

</body>

</html>