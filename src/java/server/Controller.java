/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;

import configuracao.HibernateUtil;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Aluno;
import model.Ra;
import org.hibernate.Hibernate;
import org.hibernate.SessionFactory;
import org.hibernate.Session;

/**
 *
 * @author Alexandre.Torres
 */
public class Controller extends HttpServlet {

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

        SessionFactory sf = null;
        Session session = null;

        Aluno a = new Aluno();
        Ra ra = new Ra();
        ra.setAtivo(true);
        ra.setNumero( Long.parseLong( request.getParameter("ra")) );
        
        a.setNome( request.getParameter("nome"));
        a.setRa(ra);
        a.setNota("MM");
        a.setNota("SS");
        a.setNota("MS");
        
        try {
            /* TODO output your page here. You may use following sample code. */
            
            sf = HibernateUtil.getSessionFactory();
            session = sf.openSession();
            
            session.beginTransaction();
            //session.save(ra);
            session.save(a);
            session.getTransaction().commit();
            
            request.setAttribute("aluno", a);
                        
        } catch (Exception e ){
            e.printStackTrace();
            session.getTransaction().rollback();
        } catch (Throwable t){
            t.printStackTrace();
        } finally {
            session.close();
            sf.close();
        }
        
        request.getRequestDispatcher("Resultado.jsp").forward(request, response);
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
