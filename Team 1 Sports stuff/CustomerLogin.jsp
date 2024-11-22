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
        <a class="active" href="index.jsp">Home</a>
        <a href="newAccount.jsp">Create New Account</a>
        <a href="CustomerLogin.jsp">Log In</a>
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
            <h1> Customer Login page</h1>
            <form id = "loginForm">
                <div class="txt_field">
                    <label>Username</label>
                    <input id="user" type="text" name="text" required>

                </div>
                <div class="txt_field">
                    <label>Password</label>
                    <input id="pw" type="password" name="password" required>

                </div>
                <input name="submit" type="submit" value="Login">
            </form>
        </div>
    </div>
    <!-- bottom part of the page-->
    <footer class="footer">
        <a id=docFooter href="faq.jsp">Documentation</a>
        <a id=empLoginFooter href="empLogin.jsp">Employee Login</a>
        <a id=aboutFooter href="faq.jsp">About</a>
    </footer>
<script>
    document.getElementById("loginForm").addEventListener("submit", function(event){
        event.preventDefault();
        const username = document.getElementById("user").value;
        const password = document.getElementById("pw").value;
        if (username === "user" && password === "password"){
            window.location.href = "index.jsp";
        }
        else {
            window.location.href = "error.jsp";
        }
    });
</script>
</body>

</html>
