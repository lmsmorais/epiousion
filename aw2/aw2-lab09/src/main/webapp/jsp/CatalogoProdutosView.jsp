<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
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
                <TD>Nome</TD>
                <TD>Marca</TD>
                <TD>Preço</TD>
                <TD>Comprar</TD>
            </TR>
            <c:forEach var="produto" items="${catalogo}">
                <TR>
                    <TD class='gridCampo'>${produto.nome}</TD>
                    <TD class='gridCampo'>${produto.marca}</TD>
                    <TD class='gridCampo'><fmt:formatNumber type="currency" value="${produto.preco}" /></TD>
                    <TD>
                        <A HREF='${pageContext.request.contextPath}/adicionarProdutoCarrinho?idProduto=${produto.id}'>
                            <IMG SRC='${pageContext.request.contextPath}/imagens/carrinho.gif' />
                        </A>
                    </TD>
                </TR>
            </c:forEach>
        </TABLE>
    </body>
</html>
