<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cart</title>
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
        <a href="#"><i class="fas fa-shopping-cart"></i> Cart</a>
        <input type="text" placeholder="Search..">
    </div>

    <h1>Your Shopping Cart</h1>

    <table class="cart-table">
        <thead>
            <tr>
                <th>Product</th>
                <th>Quantity</th>
                <th>Price</th>
                <th>Total</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td class="cart-item">
                    Product 1
                </td>
                <td>2</td>
                <td>$15.00</td>
                <td>$30.00</td>
            </tr>
            <tr>
                <td class="cart-item">
                    Product 2
                </td>
                <td>1</td>
                <td>$25.00</td>
                <td>$25.00</td>
            </tr>
            <tr class="total-row">
                <td colspan="3">Total</td>
                <td>$55.00</td>
            </tr>
        </tbody>
    </table>

    <div class="cart-summary">
        <h3>Cart Summary</h3>
        <p>Total Items: 3</p>
        <p>Subtotal: $55.00</p>
        <button class="checkout-btn">Proceed to Checkout</button>
    </div>

    <!-- Footer -->

    <footer class="footer">
        <a id=FAQ href="faq.html">FAQ</a>
        <a id=empLoginFooter href="#empLogin">Employee Login</a>
        <a id=aboutFooter href="#about">About</a>
    </footer>


</body>

</html>