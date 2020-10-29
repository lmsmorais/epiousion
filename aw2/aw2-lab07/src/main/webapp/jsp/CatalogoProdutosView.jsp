<!DOCTYPE html>
<%@page import="br.com.globalcode.model.*, java.util.*, java.text.NumberFormat"%>

<html>
    <head>
        <title>Catalogo Produtos</title>
        <meta charset='UTF-8'>
        <link href='${pageContext.request.contextPath}/css/aw.css' rel='stylesheet' />
    </head>
    <body>
        <H3>Catalogo de produtos (JSP)</H3>
        <TABLE width='700'>
            <TR class='tituloCampo'>
                <TD width = '%10'>Nome</TD>
                <TD width = '%10'>Marca</TD>
                <TD width = '%10'>Preço</TD>
                <TD width = '%20'>Comprar</TD>
            </TR>

            <%
                List<Produto> catalogoProdutos = (List<Produto>) request.getAttribute("catalogo");
                NumberFormat formatadorMoeda = NumberFormat.getCurrencyInstance();
                for (Produto produto : catalogoProdutos) {
            %>
            <TR>
                <TD width='%10' class='gridCampo'><%=produto.getNome()%></TD>
                <TD width='%10' class='gridCampo'><%=produto.getMarca()%></TD>
                <TD width='%10' class='gridCampo'><%=formatadorMoeda.format(produto.getPreco())%></TD>
                <TD width='%20'>
                    <%
                        String linkAdicionarProdutoCarrinho = request.getContextPath() + "/adicionarProdutoCarrinho?idProduto=" + produto.getId();
                        String imagemCarrinho = request.getContextPath() + "/imagens/carrinho.gif";
                    %>
                    <A HREF='<%=linkAdicionarProdutoCarrinho%>'><IMG SRC='<%=imagemCarrinho%>' /></A>
                </TD>
            </TR>
            <%
                }
            %>
        </TABLE>
    </body>
</html>
