<%-- 
    Document   : checkout
    Created on : Oct 31, 2024, 2:05:50 AM
    Author     : Jose
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>    
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
        <title>Checkout</title>
        
        <!-- Link to CSS page -->
        <link rel="stylesheet" type="text/css" href="styles.css" />
        
        <style type="text/css">
        <!-- 

        .checkout {
        float: left;
        margin-left: 500px;
        margin-bottom: 16px;
        }
        
        .total {
        float: right;
        background-color: white;
        margin-right: 600px;
        width: 130px;
        height: 150px;
        padding: 10px;
        border: 5px solid black;
        }
        
        .footer{
            margin-top: 500px;
            
        }
        
        -->
        </style>
    
    </head>
    
    <body>
        
        <div class="topnav">
        <a class="active" href="index.html">Home</a>
        <a href="newAccount.html">Create New Account</a>
        <a href="loginPage.html">Log In</a>
        <a href="cart.html"><i class="fas fa-shopping-cart"></i> Cart</a>
        <input type="text" placeholder="Search..">
        </div>
        
        
    <h2>Checkout</h2>      
    <div class="checkout">    
     
    <form action="">
        <div>
            <label>Name on Card</label>
            <input id="Cname" type="text" name="text" required>
        </div>  
        
        <div>
            <label>Date of Expiration</label>
            <input id="DoE" type="text" name="text" required>
        </div>
        
        <div>
            <label>CVV</label>
            <input id="CVV" type="text" name="text" required>
        </div>

        <div>
            <label>Address</label>
            <input id="Address" type="text" name="text" required>
        </div>

        <div>
            <label>State</label>
            <input id="state" type="text" name="text" required>
        </div>

        
        <div>
            <label>Zipcode</label>
            <input id="zcode" type="text" name="text" required>
        </div>
        


        <button id="Checkout"type="submit">Submit</button>
    </form>
    </div>
    
    <div class="total">
        
        <label>Items:</label>
        <label>Shipping:</label>
        <label>Tax:</label>
        <h3>Total:</h3>
        
    </div>
    
    <!-- Footer -->
    <footer class="footer">
    <a id=FAQ href="#news">FAQ</a>
    <a id=empLoginFooter href="#empLogin">Employee Login</a>
    <a id=aboutFooter href="#about">About</a>
    </footer>
        
    </body>
    
    
    
</html>
