package test.webapp.servlet;

import com.google.gson.Gson;
import test.webapp.model.Creative;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author auryadkina
 *         Created on 4/14/2015
 */
@WebServlet("/creative")
public class CreativeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getParameter("country");
        request.getParameter("os");
        request.getParameter("limit");
        response.setContentType("application/json; charset=UTF-8");

        Creative creative = new Creative();
        creative.setDescription("sdfsf");
        creative.setId(1L);
        creative.setUrl("sdfsf");
        Gson gson = new Gson();
        String jsonOutput = gson.toJson(creative);
        PrintWriter out = response.getWriter();
        out.println(jsonOutput);
        out.flush();
        out.close();
    }
}
