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
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                .forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstNum = request.getParameter("firstNum");
        String secondNum = request.getParameter("secondNum");

        request.setAttribute("firstNum", firstNum);
        request.setAttribute("secondNum", secondNum);

        int n1 = Integer.parseInt(firstNum);
        int n2 = Integer.parseInt(secondNum);
        int n3;

        if (request.getParameter("plusButton") != null) {
            n3 = n1 + n2;
            request.setAttribute("result", "Result: " + n3);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
        } else if (request.getParameter("minusButton") != null) {
            n3 = n1 - n2;
            request.setAttribute("result", "Result: " + n3);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
        } else if (request.getParameter("multiplyButton") != null) {
            n3 = n1 * n2;
            request.setAttribute("result", "Result: " + n3);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
        } else if (request.getParameter("moduloButton") != null) {
            n3 = n1 % n2;
            request.setAttribute("result", "Result: " + n3);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp")
                    .forward(request, response);
        }

    }

}
