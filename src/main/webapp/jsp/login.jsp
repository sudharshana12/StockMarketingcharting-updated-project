<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<html>
    <head>
        <title>Login Page</title>
        <link rel="Stylesheet" href="/styles/login-style.css">
    </head>
    <body>
        
        <div class="loginbox">
            <img src="/images/icon.png" class="avatar">
            <h1> Login Here</h1>
            <form:form method="POST" action="/User/login" modelAttribute="login">
                <p> Username </p>
                <form:input type="text"  name="uname" placeholder="Enter username" path="username"/>
                <p> Password </p>
                <form:input type="password" name="password" placeholder="Enter password" path="password"/>
                <input type="submit" name="sumbit" value="Login">
                <a href="/User/registerUser">No Account?Resgiter Here!</a>
            </form:form>
       </div>
       
    </body>
</html>