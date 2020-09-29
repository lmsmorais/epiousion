/*
 * Esta função le e exibe em uma janela de diálogo o valor
 * da propriedade username armazenado. Caso não seja encontrada
 * solicita ao usuário que entre com um valor para a propriedade. 
 */
function boasvindas() {
    var username = leValorPropriedade('username');
    alert("Username = " + username);

    if (username != null) {
        alert('Bem vindo de volta ' + username + '!');
    }
    else {
        username = prompt('Qual o seu username', "");
        adicionarPropriedade('username', username, 1);
    }

    // vamos recuperar o paragrafo para inserção da saudação ao usuário
    var p = document.getElementById("mensagem");

    // vamos criar um novo text node para adicionar ao elemento p
    myTextNode = document.createTextNode(username);
    p.appendChild(myTextNode);
}

/*
 * Esta função deve imprimir todos os valores armazenados em sessionStorage
 */
function imprimirPropriedades() {
    var propriedades;
    for(var i in localStorage){
        propriedades += "Valores Armazenados: "+ localStorage[i] + "\n";
    }

    alert(propriedades);

}

/*
 * Esta função deve ler e retornar o valor com o nome solicitado, 
 * que está armazenado em sessionStorage
 */
function leValorPropriedade(nome) {
    return localStorage[nome];
}
/*
 * Esta função deve remover o valor solicitado de sessionStorage
 */
function removerPropriedade(nome) {
    localStorage.removeItem(nome);
}

/*
 * Esta função deve adicionar o valor solicitado em sessionStorage
 */
function adicionarPropriedade(nome, valor) {
    localStorage[nome] = valor;
}


