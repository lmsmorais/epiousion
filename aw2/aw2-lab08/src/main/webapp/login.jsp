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
            <td>Usuário</td>
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
