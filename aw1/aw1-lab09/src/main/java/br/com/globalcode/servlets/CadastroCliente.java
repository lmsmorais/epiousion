package br.com.globalcode.servlets;

import br.com.globalcode.model.Cliente;
import br.com.globalcode.model.dao.Cidades;
import br.com.globalcode.model.dao.ClienteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

@WebServlet(urlPatterns = {"/cadastroCliente"})
public class CadastroCliente extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/xml;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String action = request.getParameter("action");
        if ("consultarCliente".equalsIgnoreCase(action)) {
            System.out.println("Consultando cliente ...");
            Integer id = Integer.valueOf(request.getParameter("id"));
            System.out.println("Id do cliente: " + id);
            Cliente cliente = ClienteDAO.getInstance().getClienteById(id);
            System.out.println("Cliente encontrado: " + cliente);
            try {
                JAXBContext ctx = JAXBContext.newInstance(Cliente.class);
                Marshaller marshaller = ctx.createMarshaller();
                marshaller.marshal(cliente, out);
            } catch (JAXBException e) {
                throw new ServletException(e);
            }
        } else if ("preencherCidades".equalsIgnoreCase(action)) {
            System.out.println("Preechendo cidades ...");
            String estado = request.getParameter("estado");
            System.out.println("Estado selecionado: " + estado);
            List<String> lista = ClienteDAO.getInstance().getCidades(estado);
            Cidades cidades = new Cidades();
            cidades.setEstado(estado);
            cidades.setCidades(lista);
            try {
                JAXBContext ctx = JAXBContext.newInstance(Cidades.class);
                Marshaller marshaller = ctx.createMarshaller();
                marshaller.marshal(cidades, out);
            } catch (JAXBException e) {
                throw new ServletException(e);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
