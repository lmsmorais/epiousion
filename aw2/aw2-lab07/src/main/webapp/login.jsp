<!-- A vari�vel mensagem serve para retornar uma mensagem,
 atribu�da na valida��o de login
	Atrav�s da express�o delimitada chamada Expression Language(EL)
ex: ${xxxx}
	A mensagem de erro � exibida apenas de retornada na valida��o de login
na classe java, em EL as vari�veis s�o acessadas diretamente, dentro do HTML
ela pode ser exibida normalmente		
 -->

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Login</title>
    </head>
  <body>    
      <form method="post" action='${pageContext.request.contextPath}/validaLogin'>
      <table cellspacing="2" cellpadding="3" width="30%">     
          <tr>
            <td colspan="2">
                <strong>
                    ${mensagem}
                </strong>
            </td>
          </tr> 
          <tr>
            <td>Usu�rio</td>
            <td><input type="text" name="username" size="10" />
            </td>
          </tr>        
          <tr>
            <td>Senha</td>
            <td><input type="password" name="password" size="10" />
            </td>
          </tr>
          <tr>
            <td><button type="submit">Entrar</button></td>
            <td>
            </td>
          </tr>
      </table>
    </form>
  </body>
</html>
