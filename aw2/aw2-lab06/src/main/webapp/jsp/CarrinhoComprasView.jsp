<!DOCTYPE html>
<%@page import="br.com.globalcode.model.*"%>
<%@page import="java.util.List"%>
<%@page import="java.text.NumberFormat"%>

<%
    CarrinhoCompras carrinho = (CarrinhoCompras) session.getAttribute("carrinhoCompras");
    List<Item> itens = carrinho.getItems();
    String contexto = request.getContextPath();
%>

<HTML>
    <HEAD>
        <title>Carrinho de Compras</title>
        <meta charset='UTF-8'>
        <link href='<%=contexto%>/css/aw.css' rel='stylesheet' />
    </HEAD>

    <BODY>

        <H3>Suas compras (JSP)</H3>
        <TABLE width='700'>
            <TR>
                <TD align='right' colspan='5' class='tituloform'>
                    <A HREF='<%=contexto%>/catalogoProdutos'>Continuar compras </A>
                    <A HREF='<%=contexto%>/catalogoProdutos'>
                        <img src='<%=contexto%>/imagens/carrinho.gif' />
                    </A>
                </TD>
            </TR>

            <TR>
                <TD width='%10' class='tituloCampo'>Nome</TD>
                <TD width='%20' class='tituloCampo'>Marca</TD>
                <TD width='%5' class='tituloCampo'>Quantidade</TD>
                <TD width='%15' class='tituloCampo'>Preço unid.</TD>
                <TD width='%20' class='tituloCampo'>total</TD>
            </TR>

            <%
                NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance();
                for (Item item : itens) {
                    Produto p = item.getProduto();
                    String preco = formatadorMoeda.format(p.getPreco());
                    String totalItem = formatadorMoeda.format(p.getPreco() * item.getQuantidade());
            %>
            <TR>
                <TD width='%10' class='gridCampo'><%=p.getNome()%></TD>
                <TD width='%20' class='gridCampo'><%=p.getMarca()%></TD>
                <TD width='%5' class='gridCampo'><%=item.getQuantidade()%></TD>
                <TD width='%15' class='gridCampo' align='right'><%=preco%></TD>
                <TD width='%20' class='gridCampo' align='right'><%=totalItem%></TD>
            </TR>
            <%
                } // end for
                String precoTotal = formatadorMoeda.format(carrinho.calcularValorTotal());
            %>
            <TR>
                <TD align='right' colspan='5' class='tituloform'><%=precoTotal%></TD>
            </TR>
            <TR>
                <TD align='right' colspan='5' class='tituloform'><A
                        HREF='<%=contexto%>/jsp/FinalizarCompraView.jsp'>Finalizar Compra </A>
                </TD>
            </TR>
        </TABLE>
    </BODY>
</HTML>