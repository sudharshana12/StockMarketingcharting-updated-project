<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<head>
    <title>Admin Upload Summary</title>
    <link rel="Stylesheet" href="Styles/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>

<body>
    
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#"><img src="images/page-icon.png" width="30" height="30" alt=""> STOCK MARKETING</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown"
            aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                </li>
                &nbsp; &nbsp;&nbsp; &nbsp;
                <li class="nav-item">
                    <a class="nav-link" href="admin-import-data.html">Import Data</a>
                </li>
                &nbsp; &nbsp;&nbsp; &nbsp;
                <li class="nav-item">
                    <a class="nav-link" href="admin-manage-company.html">Manage Company</a>
                </li>
                &nbsp; &nbsp;&nbsp; &nbsp;
                <li class="nav-item">
                        <a class="nav-link" href="#">Manage Exchange</a>
                 </li>
                 &nbsp; &nbsp;&nbsp; &nbsp;
                 <li class="nav-item"><a class="nav-link" href="/cmpList">Company
						List</a></li> &nbsp; &nbsp; &nbsp; &nbsp;
						<li class="nav-item "><a class="nav-link"
					href="/Admin/createIpo">Manage IPOs</a></li> &nbsp; &nbsp;&nbsp; &nbsp;
                 <li class="nav-item">
                        <a class="nav-link" href="#">Update IPO Details</a>
                </li>
                
            </ul>
        </div>
        <div>
                <ul class="navbar-nav">
                <li class="nav-item active">
                <a class="nav-link" href="#">Logout</a>
                </li>
                </ul>
        </div>
    </nav>
    <div class="page-body">
     <table class="page-table" cellspacing="20px">
     <tr>
         <th></th>
         <th></th>
         <th class="table-heading">Summary of Upload</th>
     </tr>
     <tr>
         <td><th>Company Name</th></td>
         <td>Abc Ltd</td>
     </tr>
     <tr>
         <td><th>Stock Exchange</th></td>
         <td>BSE(Bombay Stock Exchange)</td>
     </tr>
     <tr>
         <td><th>No of Record Imported</th></td>
         <td>80</td>
     </tr>
     <tr>
         <td><th>From Date</th></td>
         <td>               </td>
         <td><th>To Date</th></td>
         <td>                </td>
     </tr>
    <tr>
        <td></td>
        <td></td>
        <td>
            <centre><input type="button" name="tbl-button" id="tbl-button" value="OK"></centre>
        </td>
    </tr>


     </table>
    </div>

    <div class="footer">
        <p class="footer-text">Stock Exchange</p>
    </div>
</body>

</html>