/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.minhtu.demo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Pass
 */
@WebServlet("/Simple-Servlet")
public class SimpleSerlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html");
        out.println("hello Minh Tú</br>");
        List<String> student = new ArrayList<String>();
        student.add("student-1");
        student.add("student-2");

        out.println("<table>");
            out.println("<tr><td>Students</td></tr>");

            for (String string : student) {
                out.printf("<tr><td>%s</td></tr>", string);
            }
        out.println("</table?");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }
    
    
}
