package br.com.globalcode.teste;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/olamundo")
public class OlaMundo extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        // Obtencao do canal para envio de dados para o cliente
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Ola Mundo Servlet</title></head>");
        out.println("<body>");
        out.println("Ola Mundo - requisicao recebida via GET");
        out.println("<br/>Data atual: " + new java.util.Date());
        out.println("</body>");
        out.println("</html>");
        // Vai imprimir na console tomcat
        System.out.println("Catalogo Produtos: requisicao via GET");
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        // Obtencao do canal de comunicacao de envio de dados para o cliente
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>Ola Mundo Servlet</title></head>");
        out.println("<body>");
        out.println("Ola Mundo - requisicao recebida via POST");
        out.println("<br/>Data atual: " + new java.util.Date());
        out.println("</body>");
        out.println("</html>");
        // Vai imprimir na console do tomcat
        System.out.println("Catalogo Produtos: requisicao via POST");
    }
}