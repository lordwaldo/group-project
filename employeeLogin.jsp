<%-- 
    Document   : employeeLogin
    Created on : Nov 7, 2024, 4:47:32 PM
    Author     : Katie
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8" />
    <title>title</title>
    <link rel="stylesheet" href="empLoginCSS.css" />
</head>

<body>
    <!-- This is the navbar links-->

    <div class="topnav">
        <a class="active" href="index.jsp">Home</a>
        <a href="newAccount.jsp">Create New Account</a>
        <a href="employeeLogin.jsp">Log In</a>
        <a href="cart.jsp"><i class="fas fa-shopping-cart"></i> Cart</a>
        <input type="text" placeholder="Search..">
    </div>

    <!-- website brand title-->
    <div class="title">
        <h1>human sports great</h1>
    </div>
    <!--image code-->
    <div class="imgcontainer">
        <img src="sports_icon.png" class="image">
    </div>
    <!-- the login code-->
    <div class="container">
        <div class="center">
            <h1>Employee Login page</h1>
            <form action='http://localhost:8080/SportingGoods_Team1/EmployeeLoginServlet' method="post">
                <div class="txt_field">
                    <label>Username</label>
                    <input type="name" name="empID" required>

                </div>
                <div class="txt_field">
                    <label>Password</label>
                    <input type="password" name="empPass" required>

                </div>
                <input name="submit" type="submit" value="Login">
            </form>
        </div>
    </div>
    <!-- bottom part of the page-->
    <footer class="footer">
        <a id=docFooter href="#news">Documentation</a>
        <a id=empLoginFooter href="#empLogin">Employee Login</a>
        <a id=aboutFooter href="#about">About</a>
    </footer>
</body>

</html>
