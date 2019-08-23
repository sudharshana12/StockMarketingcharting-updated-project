<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
import = "java.util.*,com.example.stockspring.model.StockPrice"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<head>
    <title>User Landing Page</title>
    <link rel="Stylesheet" href="/styles/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
        integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>

<body>
    
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="#"><img src="/images/page-icon.png" width="30" height="30" alt=""> STOCK MARKETING</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown"
            aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse" id="navbarNavDropdown">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="/User/user-landing-company">Home <span class="sr-only">(current)</span></a>
                </li>
                &nbsp;&nbsp; &nbsp; &nbsp;
                <li class="nav-item">
                    <a class="nav-link" href="/User/viewIpo">IPOs</a>
                </li>
                &nbsp; &nbsp;&nbsp; &nbsp;
                <li class="nav-item">
                    <a class="nav-link" href="/User/user-compare-company">Compare Company</a>
                </li>
                &nbsp; &nbsp;&nbsp; &nbsp;
                <li class="nav-item">
                        <a class="nav-link" href="/User/user-compare-sectors">Compare Sectors</a>
                 </li>
                 &nbsp; &nbsp;&nbsp; &nbsp;
                 <li class="nav-item">
                        <a class="nav-link" href="#">Other</a>
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
		<h2 class="text-center" style="margin-top: 20px;">List of
			Stocks</h2>



		<%
			List stockpriceList = (List) request.getAttribute("stockpriceList");
			
		%>
		<table class="managecmp-page-table">
			<tr>
				
				<th>CompanyName</th>
				<th>Stock Code</th>
				<th>Current Price</th>
				<th>Date</th>
				<th>Time</th>
				<th>StockExchange_Id</th>
				
			</tr>

			<%
				for (int i = 0; i < stockpriceList.size(); i++) {
					StockPrice stockprice = (StockPrice) stockpriceList.get(i);
			%>
			<tr>

				<td><%=stockprice.getCompany().getCompanyName()%></td>
				<td><%=stockprice.getStockCode()%></td>
				<td><%=stockprice.getCurrentPrice()%></td>
				<td><%=stockprice.getDate()%></td>
				<td><%=stockprice.getTime()%>
				<td><%=stockprice.getStockExchange()%>
				
			</tr>
			<%
				}
			%>
    <div class="footer">
        <p class="footer-text">Stock Exchange</p>
    </div>
</body>

</html>