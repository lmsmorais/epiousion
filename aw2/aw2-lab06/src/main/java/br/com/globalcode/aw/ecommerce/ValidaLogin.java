package br.com.globalcode.aw.ecommerce;

import br.com.globalcode.exception.LoginFailedException;
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

        if ((usuario == null) || (usuario.equals(""))) {
            throw new LoginFailedException("Por favor, digite o usuário.");

        } else if ((senha == null) || (senha.equals(""))) {
            throw new LoginFailedException("Por favor, digite a senha.");

        } else if (usuario.equals("gc") && senha.equals("gc")) {
            Cliente cliente = new Cliente("Globalcode", usuario, senha,
                    "(11) 3171-1987", true);
            request.getSession().setAttribute("cliente", cliente);
        } else {
            throw new LoginFailedException("Usuário e senha inválidos!");
        }

        response.sendRedirect(request.getContextPath()+"/catalogoProdutos");
    }
}
