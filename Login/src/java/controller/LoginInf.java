package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginInf extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id = request.getParameter("name");
		String pass = request.getParameter("password");
		response.setContentType("index.html");
            RequestDispatcher rd = null;
            request.setAttribute(id, "name");
            if(id.equals("name") && pass.equals("password")){
                rd = request.getRequestDispatcher("welcome.html");
                rd.forward(request, response);
            }
            else{
                
                rd = request.getRequestDispatcher("error.html");
                rd.include(request, response);
            }
        }

	
    }





        