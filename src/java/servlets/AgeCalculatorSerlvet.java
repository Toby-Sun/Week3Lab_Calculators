package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tobys
 */
public class AgeCalculatorSerlvet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/agecalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String currentAge =request.getParameter("currentAge");
        request.setAttribute("currentAge", currentAge);
        /*int nextAge = Integer. parseInt(currentAge) + 1;*/
       
        if(currentAge == null || currentAge.equals("")){
            request.setAttribute("message", "You must give your current age");
            getServletContext().getRequestDispatcher("/WEB-INF/nextAge.jsp")
                .forward(request, response);
        }
        
        try {
        int numCurrentAge = Integer.parseInt(currentAge);
        int nextAge = numCurrentAge + 1;
        
        request.setAttribute("message", "Your next age is " + (nextAge));
        getServletContext().getRequestDispatcher("/WEB-INF/nextAge.jsp")
                .forward(request, response);
        }
        catch(NumberFormatException e){
            request.setAttribute("message", "You must enter a number");
         getServletContext().getRequestDispatcher("/WEB-INF/nextAge.jsp")
                .forward(request, response);   
        }
    }
}