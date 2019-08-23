<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<head>
    <title>User Landing Page</title>
    <link rel="Stylesheet" href="/styles/style.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet"> 
     
    

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
    <br>
    <div class="form-group row">
        <div class="col-sm-4"></div>
        <div class="col-sm-2">
            <label for="select" class="col-form-label">Select Comapny/Sector</label>
        </div>

        <div class="col-sm-2">
            <select id="select" class="form-control">
                <option selected>Company</option>
                <option>Sector</option>
            </select>
        </div>
        <br><br><br>
        <div class="col-sm-4"></div>
    </div>
    <div class="form-group row">
        <div class="col-sm-4"></div>
        <div class="col-sm-2">
            <label for="select-se" class="col-form-label">Select Stock Exchange</label>
        </div>
        <div class="col-sm-2">
            <select id="select-se" class="form-control">
                <option selected>BSE</option>
                <option>NSE</option>
            </select>
        </div>
        <div class="col-sm-4"></div>
    </div>
    <br>
    <div class="col-sm-4"></div>
    </div>
    <div class="form-group row">
        <div class="col-sm-4"></div>
        <div class="col-sm-2">
            <label for="cmp-name" class="col-form-label">Company Name</label>
        </div>
        <div class="col-sm-2">
            <input type="text" id="cmp-name" class="form-control mx-sm">
        </div>
        <div class="col-sm-4"></div>
    </div>
    <br><br><br>
    <div class="form-group row">
            <div class="col-sm-4"></div>
            <div class="col-sm-2">
                <label for="select-se" class="col-form-label">From Period</label>
                &nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp;
                <label for="select-se" class="col-form-label" >To Period</label>
            </div>
        </div>    
        <div class="form-group row">
                <div class="col-sm-4"></div>
                <div class="col-sm-2">
                    <label for="select-se" class="col-form-label">Specify Periodicity</label>
                
                </div>
            </div>     
        
    <div><a href="#" style="width:40px" ><i class="material-icons" style="font-size:36px">add_circle_outline</i> </a></div>
    <br><br>
    <input type="button" name="generate-map" value="Generate Map" class="generate-btn">
    <div class="footer">
            <p class="footer-text">Stock Exchange</p>
       <br><br><br><br>
       <div class="col-sm-4"></div>
    </div>
</body>

</html>