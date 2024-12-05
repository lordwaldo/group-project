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

/************************
 * CIST 2391 - E-commerce Project
 * Group 1
 * September 2024
 ********************/
public class EmployeeLoginServlet extends HttpServlet {

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
        
            String empID = "";
            String empPass = "";
            String DBid = "";
            String DBpass = "";
            
        try (PrintWriter out = response.getWriter()) {
            
            empID = request.getParameter("empID");
            empPass = request.getParameter("empPass");

            Business.Employee e1 = new Business.Employee();
            
            e1.selectDB(empID);
            
            DBid = e1.getEmpID();
            DBpass = e1.getEmpPass();
            
            if(empID.equals(DBid) && empPass.equals(DBpass)){
                
                System.out.println("Login valid");
                
                RequestDispatcher rd1 = request.getRequestDispatcher("/index.jsp");
                
                rd1.forward(request,response);
                
            }
            else{
                System.out.println("Login invalid");
                
                RequestDispatcher rd1 = request.getRequestDispatcher("/error.jsp");
             
                rd1.forward(request,response);
            }
            
            HttpSession ses1;
            ses1 = request.getSession(true);
            ses1.setAttribute("e1", e1);
            System.out.println("Employee added to session...");
            
        }catch(Exception e){
            System.out.println("Error with forwarding employee log in servlet...");
        }finally{
            out.close();
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
