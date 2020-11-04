<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
    <head>
        <title>Pedido de compra</title>
        <meta charset="UTF-8">
        <link href="../css/aw.css" rel="stylesheet" />
    </head>

    <body>
        <H3>Dados do Pedido (JSP)</H3>


        <table>
            <tr>
                <td class="tituloCampo">Dados pessoais</td>
            </tr>
            <tr>
                <td>
                    <table>
                        <tr>
                            <td width="16%" class="tituloform">Nome</td>
                            <td width="84%" class="gridCampo"> ${param.nome} </td>
                        </tr>
                        <tr>
                            <td class="tituloform">CPF</td>
                            <td class="gridCampo"> ${param.cpf} </td>
                        </tr>
                        <tr>
                            <td class="tituloform">e-mail</td>
                            <td class="gridCampo"> ${param.email} </td>
                        </tr>
                        <tr>
                            <td class="tituloform">Telefone</td>
                            <td class="gridCampo"> ${param.telefone} </td>
                        </tr>
                    </table>
                </td>
            </tr>
            <tr>
                <td class="tituloCampo">Endereço de entrega <br>
                </td>
            </tr>

            <tr>
                <td bgcolor="#FFFFFF">
                    <table>
                        <tr>
                            <td class="tituloform">Rua/Av</td>
                            <td class="gridCampo"> ${param.rua} </td>
                            <td class="tituloform">Número</td>
                            <td class="gridCampo"> ${param.numero} </td>
                        </tr>
                        <tr>
                            <td class="tituloform">Bairro</td>
                            <td class="gridCampo"> ${param.bairro} </td>
                            <td class="tituloform">Cidade</td>
                            <td class="gridCampo"> ${param.cidade} </td>
                        </tr>
                        <tr>
                            <td class="tituloform">Estado</td>
                            <td class="gridCampo"> ${param.estado} </td>
                            <td class="tituloform">CEP</td>
                            <td class="gridCampo"> ${param.cep} </td>
                        </tr>
                    </table>
                </td>
            </tr>


            <tr>
                <td class="tituloCampo">Dados para pagamento</td>
            </tr>

            <tr>
                <td bgcolor="#FFFFFF">
                    <table>
                        <tr>
                            <td width="25%" class="tituloform">Cartão de crédito</td>
                            <td width="75%" class="gridCampo"> ${param.tipo} </td>
                        </tr>
                        <tr>
                            <td class="tituloform">Número do cartão</td>
                            <td class="gridCampo"> ${param.numeroCartao} </td>
                        </tr>
                        <tr>
                            <td class="tituloform">Data Validade</td>
                            <td class="gridCampo"> ${param.dataValidade} </td>
                        </tr>
                    </table>
                </td>
            </tr>
        </table>

        <H3>Items do Pedido (JSP)</H3>
        <TABLE>
            <TR>
                <TD width='%10' class='tituloCampo'>Nome</TD>
                <TD width='%20' class='tituloCampo'>Marca</TD>
                <TD width='%5' class='tituloCampo'>Quantidade</TD>
                <TD width='%35' class='tituloCampo'>Preço</TD>
            </TR>

            <c:forEach var="item" items="${carrinhoCompras.items}">
                <TR>
                    <TD width='%10' class='gridCampo'>${item.produto.nome}</TD>
                    <TD width='%20' class='gridCampo'>${item.produto.marca}</TD>
                    <TD width='%5' class='gridCampo'>${item.quantidade}</TD>
                    <TD width='%35' class='gridCampo'><fmt:formatNumber type="currency" value="${item.produto.preco}" /> (preco unid.)</TD>
                </TR>
            </c:forEach>
            <TR>
                <TD align='right' colspan='4' class='tituloform'><fmt:formatNumber type="currency" value="${carrinhoCompras.valorTotal}" /></TD>
            </TR>
        </TABLE>

    </body>
</html>
