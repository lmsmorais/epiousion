package br.com.globalcode.aw.ecommerce;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import br.com.globalcode.model.Cliente;
import javax.servlet.annotation.WebServlet;

@WebServlet("/validaLogin")
public class ValidaLogin extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {

        String usuario = request.getParameter("username");
        String senha = request.getParameter("password");
        String destino = request.getContextPath()+"/login.jsp";
        String mensagem = null;

        if ((usuario == null) || (usuario.equals(""))) {
            mensagem = "Por favor, digite o usuário.";

        } else if ((senha == null) || (senha.equals(""))) {
            mensagem = "Por favor, digite a senha.";

        } else if (usuario.equals("gc") && senha.equals("gc")) {
            Cliente cliente = new Cliente("Globalcode", usuario, senha,
                    "(11) 3171-1987", true);
            request.getSession().setAttribute("cliente", cliente);
            destino = request.getContextPath()+"/catalogoProdutos";
        } else {
            mensagem = "Usuário e senha inválidos!";
        }
        
        if(mensagem != null) {
            request.getSession().setAttribute("mensagem", mensagem);
        }

        response.sendRedirect(destino);
    }
}
