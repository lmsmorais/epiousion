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
                <TD class='tituloCampo'>Nome</TD>
                <TD class='tituloCampo'>Marca</TD>
                <TD class='tituloCampo'>Quantidade</TD>
                <TD class='tituloCampo'>Preço unid.</TD>
                <TD class='tituloCampo'>total</TD>
            </TR>
            <c:forEach var="item" items="${carrinhoCompras.items}" >
                <TR>
                    <TD class='gridCampo'>${item.produto.nome}</TD>
                    <TD class='gridCampo'>${item.produto.marca}</TD>
                    <TD class='gridCampo'>${item.quantidade}</TD>
                    <TD class='gridCampo' align='right'><fmt:formatNumber type="currency" value="${item.produto.preco}" /></TD>
                    <TD class='gridCampo' align='right'><fmt:formatNumber type="currency" value="${item.produto.preco * item.quantidade}" /></TD>
                </TR>
            </c:forEach>
            <TR>
                <TD align='right' colspan='5' class='tituloform'><fmt:formatNumber type="currency" value="${carrinhoCompras.valorTotal}" /></TD>
            </TR>
            <TR>
                <TD align='right' colspan='5' class='tituloform'><A
                        HREF='${pageContext.request.contextPath}/jsp/FinalizarCompraView.jsp'>Finalizar Compra </A>
                </TD>
            </TR>
        </TABLE>
    </BODY>
</HTML>