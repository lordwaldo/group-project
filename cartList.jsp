<%-- 
    Document   : cartList
    Created on : Nov 20, 2024, 11:16:44 AM
    Author     : Katie
--%>
<%@page import="Business.Cart"%>
<%@page import="Business.Customers"%>
<%@page import="Business.CartList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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
        <jsp useBean id ="c1" scope="session" class="Business.Customers"/>
        
        <%
            Customers c1;
            c1 = (Customers)session.getAttribute("c1");
            
            if(c1 != null){
                c1.display();
            }else{
                out.println("Customer is not logged in...");
            }
        %>
        
        <table class="cart-table">
            
            <tr><th colspan="Cart"></th></tr>
            
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
                
                
            </tr>
            
            <%
                double cartTotal = 0;
                int c = c1.list1.count;
                
                if(c1 != null){
                    int count = c1.list1.count;
                    Cart cart1;
                    
                    for(int i = 0; i < count; i++){
                        cart1 = c1.list1.cartAr[i];
                        cartTotal += cart1.getPrice();
                
            %>
            
            <tr>
                <td>
                    <%out.println(cart1.getOrderID());%>
                </td>
                
                <td>
                    <i>1</i>
                </td>
                <td>
                    <%out.println(cart1.getPrice());%>
                </td>
            </tr>
            <%      }
                }else{
               
                    out.println("<tr><td colspan='4'>Your Cart is empty</td></tr>");
                }
            
            %>
            
            <tr>
                <td colspan="3" style="text-align: right;"><b>Total:</b></td>
                <td><%= cartTotal %></td>
            </tr>
            
            <tr>
                <td>
                    
                </td>
            </tr>            
        </table>  
                
        <div class="cart-summary">
            <button class="checkout-btn">Proceed to Checkout</button>
        </div>
                
        <footer class="footer">
            <a id=FAQ href="faq.html">FAQ</a>
            <a id=empLoginFooter href="#empLogin">Employee Login</a>
            <a id=aboutFooter href="#about">About</a>
        </footer>
                    
            
    </body>
</html>
