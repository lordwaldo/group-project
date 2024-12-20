<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>New account registration</title>
    <!-- Link to CSS page -->
    <link rel="stylesheet" type="text/css" href="styles.css" />
    <!-- Link for font awesome for shopping cart -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
</head>

<body>

    <div class="topnav">
        <a class="active" href="index.html">Home</a>
        <a href="newAccount.html">Create New Account</a>
        <a href="loginPage.html">Log In</a>
        <a href="cart.html"><i class="fas fa-shopping-cart"></i> Cart</a>
        <input type="text" placeholder="Search..">
    </div>
    <h1>New Account</h1>

    <form action="">
        <div>
            <label>First Name</label>
            <input id="fname" type="text" name="text" required>
        </div>
        <div>
            <label>Last Name</label>
            <input id="lname" type="text" name="text" required>
        </div>
        <div>
            <label>Email</label>
            <input id="email" type="text" name="text" required>
        </div>
        <div>
            <label>User Name</label>
            <input id="uname" type="text" name="text" required>
        </div>
        <div>
            <label>Password</label>
            <input id="pword" type="password" name="password" required>
        </div>
        <button id="newAcctSubmit" type="submit">Submit</button>

    </form>

    <!-- Footer -->
    <footer class="footer">
        <a id=FAQ href="#news">FAQ</a>
        <a id=empLoginFooter href="#empLogin">Employee Login</a>
        <a id=aboutFooter href="#about">About</a>
    </footer>

</body>

</html>