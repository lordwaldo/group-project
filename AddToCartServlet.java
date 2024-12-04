/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Random;

/**
 *
 * @author Katie
 */
public class AddToCartServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        
            Random random = new Random();
            String custID = "";
            String proName = "";
            String orderID = "";
            String priceStr = "";
            
            HttpSession ses1 = request.getSession();
            Business.Customers c1 = (Business.Customers) ses1.getAttribute("c1");
            custID = c1.getID(); 
            ses1.setAttribute("cartList",c1.list1);
            
            if(custID == null){
                response.sendRedirect("customerLogin.jsp");
                return;
            }
        try{
           
            proName = request.getParameter("proName");
            priceStr = request.getParameter("price");
            double price = Double.parseDouble(priceStr);
            
            int randomNumber = random.nextInt(1000);
            orderID = "t" + String.format("%03d", randomNumber);
            
            
            Business.Cart cart1 = new Business.Cart();
            
            cart1.insertDB(custID, proName, orderID, price);
            cart1.display();
            
            RequestDispatcher rd1 = request.getRequestDispatcher("/index.jsp");
            
            rd1.forward(request, response);
            
            
            
        }catch(Exception e){
            System.out.println("Error with AddToCart Servlet...");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
