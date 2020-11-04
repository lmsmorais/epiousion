<!DOCTYPE html>
<html>
    <head>
        <title>Formulário Pagamento</title>
        <meta charset='UTF-8'>
        <link href='../css/aw.css' rel='stylesheet' />
    </head>

    <body>
        <H3>Dados do Pedido (JSP)</H3>
        <form name='formularioPagamento' method='post' action='PedidoView.jsp' >

            <table>
                <tr>
                    <td class='tituloform'>Dados pessoais</td>
                </tr>
                <tr>
                    <td class='gridTopico'>
                        <table>
                            <tr>
                                <td width='16%' class='gridTopico'>Nome</td>
                                <td width='84%' class='gridTopico'><input name='nome' type='text'
                                                                          size='80'></td>
                            </tr>
                            <tr>
                                <td class='gridTopico'>CPF</td>
                                <td class='gridTopico'><input name='cpf' type='text' size='80'></td>
                            </tr>
                            <tr>
                                <td class='gridTopico'>e-mail</td>
                                <td class='gridTopico'><input name='email' type='text' size='80'></td>
                            </tr>
                            <tr>
                                <td class='gridTopico'>Telefone</td>
                                <td class='gridTopico'><input name='telefone' type='text'></td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td><span class='tituloform'><br>
                        Endereço de entrega</span><br>
                    </td>
                </tr>

                <tr>
                    <td bgcolor='#FFFFFF' class='gridTopico'>
                        <table>
                            <tr>
                                <td class='gridTopico'>Rua/Av</td>
                                <td class='gridTopico'><input name='rua' type='text' size='60'></td>
                                <td class='gridTopico'>Número</td>
                                <td class='gridTopico'><input name='numero' type='text' size='5'></td>
                            </tr>
                            <tr>
                                <td class='gridTopico'>Bairro</td>
                                <td class='gridTopico'><input name='bairro' type='text' size='60'></td>
                                <td class='gridTopico'>Cidade</td>
                                <td class='gridTopico'><input name='cidade' type='text'></td>
                            </tr>
                            <tr>
                                <td class='gridTopico'>Estado</td>
                                <td class='gridTopico'><input name='estado' type='text' size='60'></td>
                                <td class='gridTopico'>CEP</td>
                                <td class='gridTopico'><input name='cep' type='text'></td>
                            </tr>
                        </table>
                    </td>
                </tr>


                <tr>
                    <td class='tituloform'><br>
                    Dados para pagamento</td>
                </tr>

                <tr>
                    <td bgcolor='#FFFFFF' class='gridTopico'>
                        <table>
                            <tr class='gridTopico'>
                                <td width='25%'>Cartão de crédito</td>
                                <td width='75%'><select name='tipo'>
                                        <option value='Visa' selected>visa</option>
                                        <option value='Master Card'>mastcard</option>
                                        <option value='American Express'>amex</option>
                                </select></td>
                            </tr>
                            <tr class='gridTopico'>
                                <td>Número do cartão</td>
                                <td><input name='numeroCartao' type='text' size='30'></td>
                            </tr>
                            <tr class='gridTopico'>
                                <td>Data Validade</td>
                                <td><input name='dataValidade' type='text' size='10'></td>
                            </tr>
                        </table>
                    </td>
                </tr>

                <tr>
                    <td class='tituloform'><br>
                    <input type='submit' value='submit'></td>
                </tr>

            </table>

        </form>
    </body>
</html>
