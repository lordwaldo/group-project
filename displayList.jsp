<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="LIST.css"/>
</head>
<body>
    <!--navbar-->
    <div class="topnav">
        <a class="active" href="index.jsp">Home</a>
        <a href="newAccount.jsp">Create New Account</a>
        <a href="loginPage.jsp">Log In</a>
        <a href="#"><i class="fas fa-shopping-cart"></i> Cart</a>
        <input type="text" placeholder="Search..">
    </div>
    <!--tables-->
    <h1>List data</h1>

    <table class="cart-table">
            
        <tr><th colspan="list"></th></tr>
        
        <tr>
            <td>
                <i>Product: </i>
            </td>
            
            <td>
                <i>Quantity: </i>
            </td>
            
            <td>
                <i>Price: </i>
            </td>
            <td>
                <button id="shipButton" onclick="changeText()">not shipped</button>
            </td>
            
        </tr>

         <tr>
            <td>
                <i>Product: </i>
            </td>
            
            <td>
                <i>Quantity: </i>
            </td>
            
            <td>
                <i>Price: </i>
            </td>
            <td>
                <button id="shipButton" onclick="changeText()">not shipped</button>
            </td>
            
            
        </tr>
        
        
        <tr>
            <td>
                <i>Product: </i>
            </td>
            
            <td>
                <i>Quantity: </i>
            </td>
            
            <td>
                <i>Price: </i>
            </td>
            <td>
                <button id="shipButton" onclick="changeText()">not shipped</button>
            </td>
            
            
        </tr>

    <button id="addTable" onclick="addTable()">addTable</button>

    <!--footer-->
        <footer class="footer">
            <a id=FAQ href="faq.jsp">FAQ</a>
            <a id=empLoginFooter href="#empLogin">Employee Login</a>
            <a id=aboutFooter href="#about">About</a>
        </footer>
    <!--button shipped-->
    <script>
        function changeText() {
            var button = document.getElementById("shipButton");
            button.textContent = "shipped";
        }
    </script>
    <!---->
    
</body>
</html>
