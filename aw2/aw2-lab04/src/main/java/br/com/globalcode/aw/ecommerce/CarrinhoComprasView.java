package br.com.globalcode.aw.ecommerce;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.NumberFormat;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import br.com.globalcode.model.CarrinhoCompras;
import br.com.globalcode.model.Item;
import br.com.globalcode.model.Produto;
import javax.servlet.annotation.WebServlet;

@WebServlet("/exibeCarrinhoCompras")
public class CarrinhoComprasView extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doAction(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doAction(request, response);
    }

    public void doAction(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String contexto = request.getContextPath();
        try {
            CarrinhoCompras carrinho = null;
            // -------------------------------------------------------------------
            // Insira a partir daqui o código pedido no laboratorio:
            //obter o objeto HttpSession
            HttpSession session = request.getSession();
            //recuperar dado do escopo da sessão
            carrinho = (CarrinhoCompras) session.getAttribute("carrinhoCompras");
            
            // -------------------------------------------------------------------



            List<Item> itens = carrinho.getItems();
            PrintWriter out = response.getWriter();
            response.setContentType("text/html");
            out.println("<HTML>");
            out.println("<HEAD>");
            out.println("<TITLE>Carrinho de Compras</TITLE>");
            out.println("<META charset='UTF-8'>");
            out.println("<LINK href= 'css/aw.css' rel='stylesheet' />");
            out.println("</HEAD>");
            out.println("<BODY>");
            out.println("<H3>Suas compras:</H3>");
            out.println("<TABLE width = '700' border='0'>");
            out.println("<TR>");
            out.println("  <TD width = '70%' colspan='4'></TD>");
            out.println("  <TD  class = 'tituloform' width = '70%'>");
            out.println("     <A HREF= '" + contexto + "/catalogoProdutos' >Continuar compras</A>");
            out.println("  </TD>");
            out.println("  <TD width='10%'>");
            out.println("     <A HREF= '" + contexto + "/catalogoProdutos'>");
            out.println("       <img src='" + contexto + "/imagens/carrinho.gif'/> </A>");
            out.println("  </TD>");
            out.println("</TR>");
            out.println("<TR width = '%100' class='tituloCampo'>");
            out.println("<TD width = '%10' >Nome</TD>");
            out.println("<TD width = '%10'  >Marca</TD>");
            out.println("<TD width = '%10' >Pre&ccedil;o</TD>");
            out.println("<TD width = '%20' colspan = '2'>Quantidade</TD>");
            out.println("</TR>");

            // loop para imprimir todos os itens encontrados no carrinho de compras
            for (Item item : itens) {
                String itemFormatadoHTML = imprimeItem(request, item);
                out.println(itemFormatadoHTML);
            }
            out.println("</TABLE>");
            out.println("</BODY>");
            out.println("</HTML>");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String imprimeItem(HttpServletRequest request, Item item) {
        Produto p = item.getProduto();
        NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance();
        String preco = formatadorMoeda.format(p.getPreco());
        String pNome = "<TD width='%10'  class='gridCampo'> " + p.getNome() + "</TD>\n";
        String pMarca = "<TD width='%10'  class='gridCampo'> " + p.getMarca() + "</TD>\n";
        String pPreco = "<TD width='%10' class='gridCampo'> " + preco + " (preco unid.)</TD>\n";
        String pQuantidade = "<TD width = '%20' class='gridCampo'>"+item.getQuantidade()+"</TD>";
        String dados = "";
        dados += "<TR width = '%100'>" + pNome + pMarca + pPreco + pQuantidade +"</TR> \n";
        return dados;
    }
}
