package br.com.globalcode.aw.ecommerce;

import br.com.globalcode.aw.dao.ProdutoDAO;
import br.com.globalcode.aw.dao.ProdutoDB;
import br.com.globalcode.model.Produto;
import br.com.globalcode.util.GlobalcodeException;
import java.io.*;
import java.util.List;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/catalogoProdutos")
public class CatalogoProdutosView extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        // Obtencao do canal de envio de dados para o cliente
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Catalogo Produtos</title>");
        out.println("<meta charset='UTF-8'>");
        out.println("<link href= 'css/aw.css' rel='stylesheet'>");
        out.println("</head>");
        out.println("<body>");
        out.println("<H3>Catalogo de produtos </H3>");
        
        // Inicio da tabela de produtos
        out.println("<TABLE width = '700' border='0'>");

        //Linha de titulo
        out.println("<TR width = '%100' class='tituloCampo'>");
        out.println("<TD width = '%10' >Nome</TD>");
        out.println("<TD width = '%10' >Marca</TD>");
        out.println("<TD width = '%10' >Pre&ccedil;o</TD>");
        out.println("<TD width = '%20' colspan = '2'>Comprar</TD>");
        out.println("</TR>");

        //Leitura dos produtos do banco de dados
        ProdutoDAO dao = new ProdutoDB();
        List<Produto> produtos;
        try {
            produtos = dao.getCatalogoProdutos();
        } catch (GlobalcodeException ge) {
            throw new ServletException(ge);
        }
        
        //montagem da tabela com os produtos
        for (Produto prod : produtos) {
            out.println("<TR width = '%100'>");
            out.println("<TD width = '%10'  class='gridCampo'>" + prod.getNome() + "</TD>");
            out.println("<TD width = '%10'  class='gridCampo'>" + prod.getMarca() + "</TD>");
            out.println("<TD width = '%10' class='gridCampo'>" + prod.getPreco() + "</TD>");
            //o link com o id do produto é utilizado para selecionar um produto
            out.println("<TD width = '%20' colspan = '2'><A HREF= 'adicionarProdutoCarrinho?idProduto=" + prod.getId() + "' ><IMG SRC = 'imagens/carrinho.gif'/></A></TD>");
            out.println("</TR>");
        }

        // final da tabela de produtos
        out.println("</TABLE>");
        out.println("</body>");
        out.println("</html>");
    }
}
