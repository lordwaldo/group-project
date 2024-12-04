<%-- 
    Document   : index
    Created on : Nov 7, 2024, 4:55:33 PM
    Author     : Katie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <title>Team 1 Sporting Goods</title>
    <!-- Link to CSS page -->
    <link rel="stylesheet" type="text/css" href="styles.css" />
    <!-- Link for font awesome for shopping cart -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">

</head>

<body>

    <!-- Navbar -->

    <div class="topnav">
        <a class="active" href="index.html">Home</a>
        <a href="newAccount.jsp">Create New Account</a>
        <a href="customerLogin.jsp">Log In</a>
        <a href="cartList.jsp"><i class="fas fa-shopping-cart"></i> Cart</a>
        <input type="text" id="imageSearch" placeholder="Search..." oninput="filterImages()">
    </div>

    <h1>Team 1 Sporting Goods</h1>


    <!-- Grid -->
    <div class="header">
        <h2>Items for Sale</h2>
    </div>

    <div class="row">
        <div class="column">
            <img src="images/sports1.jfif" style="width:100%" alt="sports">
            <form action ='http://localhost:8080/SportingGoods_Team1/AddToCartServlet' method="post">
                <input type="hidden" name="proName" value ="sports1">
                <input type="hidden" name="price" value="19.99">
                <button type="submit" class="hide-button">Add to Cart</button>
            </form>
            <img src="images/fBall.webp" style="width:100%" alt="football">
            <form action='http://localhost:8080/SportingGoods_Team1/AddToCartServlet' method="post">
                <input type="hidden" name="proName" value="football">
                <input type="hidden" name="price" value="12.99">
                <button type="submit" class="hide-button">Add to Cart</button>
            </form>
            <img src="images/cleats.jfif" style="width:100%" alt="cleats">
            <form action='http://localhost:8080/SportingGoods_Team1/AddToCartServlet' method="post">
                <input type="hidden" name="proName" value="cleats">
                <input type="hidden" name="price" value="25.99">
                <button type="submit" class="hide-button">Add to Cart</button>
            </form>
            <img src="images/rShoes.jfif" style="width:100%" alt="running shoes">
            <form action='http://localhost:8080/SportingGoods_Team1/AddToCartServlet' method="post">
                <input type="hidden" name="proName" value="Running Shoes">
                <input type="hidden" name="price" value="30.99">
                <button type="submit" class="hide-button">Add to Cart</button>
            </form>
        </div>
        <div class="column">
            <img src="images/bBall.jfif" style="width:100%" alt="baseball">
            <form action='http://localhost:8080/SportingGoods_Team1/AddToCartServlet' method="post">
                <input type="hidden" name="proName" value ="Basketball">
                <input type="hidden" name="price" value="10.99">
                <button type="submit" class="hide-button">Add to Cart</button>
            </form>
            <img src="images/shorts.jfif" style="width:100%" alt="shorts">
            <form action="http://localhost:8080/SportingGoods_Team1/AddToCartServlet" method="post">
                <input type="hidden" name="proName" value="Shorts">
                <input type="hidden" name="price" value="20.99">
                <button type="submit" class="hide-button">Add to Cart</button>
            </form>
            <img src="images/sBall.jfif" style="width:100%" alt="softball">
            <form action="http://localhost:8080/SportingGoods_Team1/AddToCartServlet" method="post">
                <input type="hidden" name="proName" value="Soccerball">
                <input type="hidden" name="price" value="10.99">
                <button type="submit" class="hide-button">Add to Cart</button>
            </form>
            <img src="images/genericSports.jpg" style="width:100%" alt="generic sports">
        </div>
        <div class="column">
            <img src="images/shirts.jfif" style="width:100%" alt="shirts">
            <form action="http://localhost:8080/SportingGoods_Team1/AddToCartServlet" post="method">
                <input type="hidden" name="proName" value="Shirt">
                <input type="hidden" name="price" value="20.99">
                <button type="submit" class="hide-button">Add to Cart</button>
            </form>
            <img src="images/bsktBall.jfif" style="width:100%" alt="basketball">
            <form action="http://localhost:8080/SportingGoods_Team1/AddToCartServlet" method="post">
                <input type="hidden" name="proName" value="Basketball">
                <input type="hidden" name="price" value="10.99">
                <button type="submit" class="hide-button">Add to Cart</button>
            </form>    
            <img src="images/bBallGlove.jfif" style="width:100%" alt="baseball glove">
            <form action="http://localhost:8080/SportingGoods_Team1/AddToCartServlet" method="post">
                <input type="hidden" name="proName" value="BaseballGlove">
                <input type="hidden" name="price" value="12.99">
                <button type="submit" class="hide-button">Add to Cart</button>
            </form>
            <img src="images/bBallBat.jfif" style="width:100%" alt="baseball bat">
            <form action="http://localhost:8080/SportingGoods_Team1/AddToCartServlet" method="post">
                <input type="hidden" name="proName" value="BaseballBat">
                <input type="hidden" name="price" value="15.99">
                <button type="submit" class="hide-button">Add to Cart</button>
            </form>
        </div>
        <div class="quantity-box" id="quantity-box">
            <label for="quantity">Enter Quantity:</label>
            <input type="number" id="quantity" name="quantity" min="1" value="1">
        </div>
    </div>

    <!-- JavaScript for searching -->        
<script>
    function filterImages() {
        const searchInput = document.getElementById('imageSearch').value.toLowerCase();
        const images = document.querySelectorAll('.row img');
        const buttons = document.querySelectorAll('.hide-button');

        images.forEach((img, index) => {
                const altText = img.getAttribute('alt').toLowerCase();
                if (altText.includes(searchInput)) {
                    img.style.display = 'block'; // Show image
                    buttons[index].style.display = 'inline-block'; // Show associated button
                } else {
                    img.style.display = 'none'; // Hide image
                    buttons[index].style.display = 'none'; // Hide associated button
                }
        });
    }
</script>
    

    <!-- Footer -->

    <footer class="footer">
        <a id=FAQ href="faq.html">FAQ</a>
        <a id=empLoginFooter href="employeeLogin.jsp">Employee Login</a>
        <a id=aboutFooter href="#about">About</a>
    </footer>

    <!-- Link to javascript page -->
    <script src="script.js"></script>
    <link rel="javascript" type="text/javascript" href="script.js" />


</body>

</html>
