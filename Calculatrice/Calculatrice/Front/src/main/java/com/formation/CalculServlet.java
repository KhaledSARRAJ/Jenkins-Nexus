package com.formation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/add")
public class CalculServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int num1 = Integer.parseInt(request.getParameter("nombre1"));
        int num2 = Integer.parseInt(request.getParameter("nombre2"));
        Calcul calcul = new Calcul();
        int resultat = calcul.additionner(num1, num2);

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<head><title>Addition</title></head>");
        out.println("<center>");
        out.println("<table>");
        out.println("<tr>");
        out.println("<td>Premier Nombre</td>");
        out.println("<td>"+num1+"</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Second Nombre</td>");
        out.println("<td>"+num2+"</td>");
        out.println("</tr>");
        out.println("<td>Resultat</td>");
        out.println("<td>"+resultat+"</td>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</center>");
        out.println("</html>");

    }
}
