package br.com.globalcode.aw.ecommerce;

import br.com.globalcode.aw.dao.ProdutoDAO;
import br.com.globalcode.aw.dao.ProdutoDB;
import br.com.globalcode.model.Produto;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/adicionarProdutoCarrinho")
public class AdicionarProdutoCarrinho extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        // Obtencao do canal de envio de dados para o cliente
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Carrinho de compras</title>");
        out.println("<meta charset='utf-8'>");
        out.println("<link href= 'css/aw.css' rel='stylesheet'></link>");
        out.println("</head>");
        out.println("<body>");
        out.println("<H3>Adicionando produtos no carrinho de compras</H3>");

        // -------------------------------------------------------------------
        // Insira a partir daqui o codigo pedido no laboratorio:
        // -------------------------------------------------------------------
        String idProduto = request.getParameter("idProduto");
        Produto prod = null;
        try {
            int id = Integer.parseInt(idProduto);
            ProdutoDAO dao = new ProdutoDB();
            prod = dao.getProdutoById(id);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }

        // Impressao dos dados do produto
        if (prod != null) {
            out.println("<br/>id: <strong>" + prod.getId() + "</strong>");
            out.println("<br/>nome: <strong>" + prod.getNome() + "</strong>");
            out.println("<br/>marca: <strong>" + prod.getMarca() + "</strong>");
            out.println("<br/>pre&ccedil;o: <strong>" + prod.getPreco() + "</strong>");
            out.println("</body>");
            out.println("</html>");
        }
        
        out.println("</body>");
        out.println("</html>");
    }
}
