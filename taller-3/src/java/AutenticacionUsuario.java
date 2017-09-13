/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "AutenticacionUsuario", urlPatterns = {"/AutenticacionUsuario"})
public class AutenticacionUsuario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = resp.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<tittle>Servlet Formulario</tittle>");
            out.println("</head>");
            out.println("<body>");
            String usuario = req.getParameter("usuario");
            String password = req.getParameter("password");
           if(usuario==password){
            out.println("Bienvenido, " + usuario + " " + password + " usuarioAutenticado" + ("usario" + usuario + "Contraseña"+password));
            out.println("</body>");
            out.println("</html>");
}
           
        } catch (Exception e) {
            System.err.println("Usuario o contraseña invalido" + e);
        }

    }

}

