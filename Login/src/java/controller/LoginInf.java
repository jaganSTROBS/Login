/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author stslap_124
 */
public class LoginInf extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("name");
		String pass = request.getParameter("password");
		response.setContentType("index.html");
        try (PrintWriter out = response.getWriter()) {
            RequestDispatcher rd = null;
            request.setAttribute(id, "name");
            if(id.equals("name") && pass.equals("pass")){
                rd = request.getRequestDispatcher("welcome.html");
                rd.forward(request, response);
            }
            else{
                
                rd = request.getRequestDispatcher("error.html");
                rd.include(request, response);
            }
        }

	}
}



        