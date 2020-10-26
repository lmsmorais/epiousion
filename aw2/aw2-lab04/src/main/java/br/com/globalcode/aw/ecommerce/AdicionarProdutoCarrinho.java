package br.com.globalcode.aw.ecommerce;

import br.com.globalcode.aw.dao.ProdutoDAO;
import br.com.globalcode.aw.dao.ProdutoDB;
import br.com.globalcode.model.CarrinhoCompras;
import br.com.globalcode.model.Item;
import br.com.globalcode.model.Produto;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/adicionarProdutoCarrinho")
public class AdicionarProdutoCarrinho extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Produto produtoSelecionado = getProdutoSelecionado(request);
        adicionarProdutoCarrinho(request, produtoSelecionado);
        RequestDispatcher dispatcher = request.getRequestDispatcher("exibeCarrinhoCompras");
        dispatcher.forward(request, response);
    }

    private Produto getProdutoSelecionado(HttpServletRequest request) throws ServletException {
        String strIdProduto = request.getParameter("idProduto");
        Produto prod = null;
        ProdutoDAO dao = new ProdutoDB();

        try {
            int id = Integer.parseInt(strIdProduto);
            prod = dao.getProdutoById(id);
            System.out.println("[AdicionarProdutoCarrinho:getProdutoSelecionado] Produto selecionado ");
            System.out.println(prod);
        } catch (Exception e) {
            throw new ServletException(e);
        }
        return prod;

    }

    private void adicionarProdutoCarrinho(HttpServletRequest request, Produto produtoSelecionado) {
        System.out.println(produtoSelecionado);
        // Criando um novo item com o produto selecionado, quantidade igual a 1
        Item item = new Item(produtoSelecionado, 1);
        CarrinhoCompras carrinho = null;

        // -------------------------------------------------------------------
        // Insira a partir daqui o código pedido no laboratorio:
        //obter o objeto HttpSession
        HttpSession session = request.getSession();
        //recuperar o escopo de sessão 
        carrinho = (CarrinhoCompras) session.getAttribute("carrinhoCompras");
        
        // -------------------------------------------------------------------



        if (carrinho == null) { // se o carrinho de compras ainda não existe ...
            // Criando o objeto carrrinho de compras
            // passando o item como parametro no construtor
            carrinho = new CarrinhoCompras(item);





        } else { // se o carrinho de compras ja existe ...
            // Adicionando o item no carrinho atraves do metodo addItem
            carrinho.addItem(item);
        }
    }
}
