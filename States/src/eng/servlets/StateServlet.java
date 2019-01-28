package eng.servlets;

import eng.model.Country;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StateServlet", urlPatterns = "/StateServlet")
public class StateServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("stateName");
        String numberOfCitizensS = request.getParameter("citizens");
        int numberOfCitizens = Integer.parseInt(numberOfCitizensS);
        String flagUrl = request.getParameter("flagUrl");

        Country country = new Country(name, numberOfCitizens, flagUrl);

        HttpSession session = request.getSession();

        List<Country> countries = (List<Country>) session.getAttribute("countries");

        if (countries == null) {
            countries = new ArrayList<>();
        }

        countries.add(country);
        session.setAttribute("countries", countries);

        response.sendRedirect("main.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
