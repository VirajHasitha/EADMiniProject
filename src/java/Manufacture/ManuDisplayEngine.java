/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manufacture;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Krish
 */
public class ManuDisplayEngine extends HttpServlet {

    Connection conn;
    Statement stmt;
    ResultSet res1;
    ManuDatabaseConnection dbconn;
    String query1;
     List lst1 = new ArrayList();
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
        try {
            dbconn=new ManuDatabaseConnection();
            conn=dbconn.setConnection();
            stmt=conn.createStatement();
            query1="select * from EngineModel;";
             res1 =dbconn.getResult(query1, conn);
          while(res1.next()){
                lst1.add(res1.getString("ModelID"));
                lst1.add(res1.getString("EngineName"));
                lst1.add(res1.getString("FuelType"));
                lst1.add(res1.getString("Cylinders"));
                lst1.add(res1.getString("CubicCapacity"));
                lst1.add(res1.getString("Cost"));
                
            }res1.close(); 
        }catch (Exception e){
             
            RequestDispatcher rd =request.getRequestDispatcher("/modules/manufacturing/error.jsp");
            rd.forward(request, response);
        }finally
        {
            request.setAttribute("EmpData1", lst1);
             RequestDispatcher rd =request.getRequestDispatcher("/modules/manufacturing/man_index.jsp");
            rd.forward(request, response);
             lst1.clear();
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