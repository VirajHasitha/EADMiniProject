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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ManuDisplayData extends HttpServlet {

    Connection conn;
    Statement stmt;
    ResultSet res1,res2,res3,res4,res5,res6;
    ManuDatabaseConnection dbconn;
    String query1,query2,query3,query4,query5,query6;
     List lst1 = new ArrayList();
     List lst2 = new ArrayList();
     List lst3 = new ArrayList();
     List lst4 = new ArrayList();
     List lst5 = new ArrayList();
     List lst6 = new ArrayList();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            dbconn=new ManuDatabaseConnection();
            conn=dbconn.setConnection();
            stmt=conn.createStatement();
            query1="select * from enginepart where model_no=1 ;";
            query2="select * from enginepart where model_no=2 ;";
            query3="select * from enginepart where model_no=3 ;";
            query4="select * from enginepart where model_no=4 ;";
            query5="select * from enginepart where model_no=5 ;";
            query6="select * from enginepart where model_no=6 ;";
            res1 =dbconn.getResult(query1, conn);
            res2 =dbconn.getResult(query2, conn);
            res3 =dbconn.getResult(query3, conn);
            res4 =dbconn.getResult(query4, conn);
            res5 =dbconn.getResult(query5, conn);
            res6 =dbconn.getResult(query6, conn);
            while(res1.next()){
                lst1.add(res1.getString("part_no"));
                lst1.add(res1.getString("model_No"));
                 lst1.add(res1.getString("part_name"));
                 lst1.add(res1.getString("Item"));
            }res1.close();
            while(res2.next()){
                  lst2.add(res2.getString("part_no"));
                lst2.add(res2.getString("model_No"));
                 lst2.add(res2.getString("part_name"));
                 lst2.add(res2.getString("Item"));
            }res2.close();
            while(res3.next()){
                  lst3.add(res3.getString("part_no"));
                lst3.add(res3.getString("model_No"));
                 lst3.add(res3.getString("part_name"));
                 lst3.add(res3.getString("Item"));
            }res1.close();
            while(res4.next()){
                  lst4.add(res4.getString("part_no"));
                lst4.add(res4.getString("model_No"));
                 lst4.add(res4.getString("part_name"));
                 lst4.add(res4.getString("Item"));
            }res1.close();
            while(res5.next()){
                  lst5.add(res5.getString("part_no"));
                lst5.add(res5.getString("model_No"));
                 lst5.add(res5.getString("part_name"));
                 lst5.add(res5.getString("Item"));
            }res1.close();
            while(res6.next()){
                  lst6.add(res6.getString("part_no"));
                lst6.add(res6.getString("model_No"));
                 lst6.add(res6.getString("part_name"));
                 lst6.add(res6.getString("Item"));
            }res1.close();
        }catch (Exception e){
             
            RequestDispatcher rd =request.getRequestDispatcher("error.jsp");
            rd.forward(request, response);
        }finally
        {
            request.setAttribute("EmpData1", lst1);
            request.setAttribute("EmpData2", lst2);
            request.setAttribute("EmpData3", lst3);
            request.setAttribute("EmpData4", lst4);
            request.setAttribute("EmpData5", lst5);
            request.setAttribute("EmpData6", lst6);
            RequestDispatcher rd =request.getRequestDispatcher("manunews.jsp");
            rd.forward(request, response);
            lst1.clear();
            lst2.clear();
            lst3.clear();
            lst4.clear();
            lst5.clear();
            lst6.clear();
            out.close();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ManuDisplayData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ManuDisplayData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
