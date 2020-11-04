<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<HTML>
    <HEAD>
        <title>Carrinho de Compras</title>
        <meta charset='UTF-8'>
        <link href='${pageContext.request.contextPath}/css/aw.css' rel='stylesheet' />
    </HEAD>

    <BODY>

        <H3>Suas compras (JSP)</H3>
        <TABLE width='700'>
            <TR>
                <TD align='right' colspan='5' class='tituloform'>
                    <A HREF='${pageContext.request.contextPath}/catalogoProdutos'>Continuar compras </A>
                    <A HREF='${pageContext.request.contextPath}/catalogoProdutos'>
                        <img src='${pageContext.request.contextPath}/imagens/carrinho.gif' />
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
            	<c:forEach var="item" items="${carrinhoCompras.itens}">

            <TR>
                <TD width='%10' class='gridCampo'>${item.produto.nome}</TD>
                <TD width='%20' class='gridCampo'>${item.produto.marca}</TD>
                <TD width='%5' class='gridCampo'>${item.quantidade}</TD>
                <TD width='%15' class='gridCampo' align='right'><fmt:formatNumber type="currency" value="${item.produto.preco}"/></TD>
                <TD width='%20' class='gridCampo' align='right'><fmt:formatNumber type="currency" value="${item.produto.preco * item.quantidade}"/></TD>
            </TR>
            
            <TR>
                <TD align='right' colspan='5' class='tituloform'><fmt:formatNumber type="currency" value="${carrinhoCompras.valorTotal}"/></TD>
            </TR>
            <TR>
                <TD align='right' colspan='5' class='tituloform'><A
                        HREF='${pageContext.request.contextPath}/jsp/FinalizarCompraView.jsp'>Finalizar Compra </A>
                </TD>
            </TR>
            </c:forEach>
        </TABLE>
    </BODY>
</HTML>