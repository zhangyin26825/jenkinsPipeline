package com.zhangyin;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by yin on 2016/6/29.
 */
@WebServlet(name = "AnnotationServlet", urlPatterns = "/AnnotationServlet")
public class AnnotationServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML>");
        out.println("<HTML>");
        out.println(" <HEAD>");
        out.println("<TITLE>A Servlet</TITLE>");
        out.println("<meta http-equiv=\"content-type\" " + "content=\"text/html; charset=utf-8\">");
        out.println("</HEAD>");
        out.println("<BODY>");
        out.println("Hello AnnotationServlet.");
        out.println(" </BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }
}