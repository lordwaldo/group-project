package com.example.sportinggoods;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import javax.naming.InitialContext;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "shipmentServlet", urlPatterns = {"/shipmentServlet"})

public class shipmentServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String angui = "";

        try{
            angui =request.getParameter("Cid");
            System.out.println("Cid name" + angui);

            shipment a1;
            a1 = new shipment();

            a1.selectDB(angui);
            a1.display();

            HttpSession sess1 =request.getSession();
            sess1.setAttribute("a1", a1);

            RequestDispatcher rd = request.getRequestDispatcher("");
            rd.forward(request,response);


        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
