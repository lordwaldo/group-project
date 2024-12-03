<!doctype html>
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
        <a href="newAccount.html">Create New Account</a>
        <a href="loginPage.html">Log In</a>
        <a href="cart.html"><i class="fas fa-shopping-cart"></i> Cart</a>
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
            <img src="images/fBall.webp" style="width:100%" alt="football">
            <img src="images/cleats.jfif" style="width:100%" alt="cleats">
            <img src="images/rShoes.jfif" style="width:100%" alt="running shoes">
        </div>
        <div class="column">
            <img src="images/bBall.jfif" style="width:100%" alt="basetball">
            <img src="images/shorts.jfif" style="width:100%" alt="shorts">
            <img src="images/sBall.jfif" style="width:100%" alt="softball">
            <img src="images/genericSports.jpg" style="width:100%" alt="generic sports">
        </div>
        <div class="column">
            <img src="images/shirts.jfif" style="width:100%" alt="shirts">
            <img src="images/bsktBall.jfif" style="width:100%" alt="basketball">
            <img src="images/bBallGlove.jfif" style="width:100%" alt="baseball glove">
            <img src="images/bBallBat.jfif" style="width:100%" alt="baseball bat">
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

        images.forEach(img => {
            const altText = img.getAttribute('alt').toLowerCase();
            if (altText.includes(searchInput)) {
                img.style.display = 'block'; // Show image
            } else {
                img.style.display = 'none'; // Hide image
            }
        });
    }
</script>
    

    <!-- Footer -->

    <footer class="footer">
        <a id=FAQ href="faq.html">FAQ</a>
        <a id=empLoginFooter href="#empLogin">Employee Login</a>
        <a id=aboutFooter href="#about">About</a>
    </footer>

    <!-- Link to javascript page -->
    <script src="script.js"></script>
    <link rel="javascript" type="text/javascript" href="script.js" />


</body>

</html>