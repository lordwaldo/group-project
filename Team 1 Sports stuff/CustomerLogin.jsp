<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8" />
    <title>title</title>
    <link rel="stylesheet" href="CLogin.css" />
</head>

<body>
    <!-- This is the navbar links-->

    <div class="topnav">
        <a class="active" href="index.html">Home</a>
        <a href="newAccount.html">Create New Account</a>
        <a href="loginPage.html">Log In</a>
        <a href="cart.html"><i class="fas fa-shopping-cart"></i> Cart</a>
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
            <h1> Customer Login page</h1>
            <form action="#" method="POST">
                <div class="txt_field">
                    <label>Username</label>
                    <input type="text" name="text" required>

                </div>
                <div class="txt_field">
                    <label>Password</label>
                    <input type="password" name="password" required>

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