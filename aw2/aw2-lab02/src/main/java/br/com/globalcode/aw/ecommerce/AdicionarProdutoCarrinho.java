package br.com.globalcode.aw.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.globalcode.aw.dao.ProdutoDAO;
import br.com.globalcode.aw.dao.ProdutoDB;
import br.com.globalcode.model.Produto;
import br.com.globalcode.util.GlobalcodeException;

@WebServlet("/adicionarProdutosCarrinho")
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
        //armazenar id do produto
        String idProduto = request.getParameter("idProduto");
        Produto produto = null;
        
        //carregar dados do produto do banco de dados
        int id = Integer.parseInt(idProduto);
        ProdutoDAO pdao = new ProdutoDB();
        try {
			produto = pdao.getProdutoById(id);
		} catch (GlobalcodeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        // -------------------------------------------------------------------
        
        
        
        
        // Impressao dos dados do produto
        out.println("<br/>id: <strong>" + produto.getId() + "</strong>");
        out.println("<br/>nome: <strong>" + produto.getNome() + "</strong>");
        out.println("<br/>marca: <strong>" + produto.getMarca() + "</strong>");
        out.println("<br/>pre&ccedil;o: <strong>" + produto.getPreco() + "</strong>");
        out.println("</body>");
        out.println("</html>");
        
        out.println("</body>");
        out.println("</html>");
    }
}
