function validaForm() {
    if (!validaEmail() ||
            !validaTelefone() ||
            !validaNumero ||
            !validaCep() ||
            !validaEstado() || 
            !validaBandeira() || 
            !validaNumeroCartao() || 
            !validaNumeroVerificacao() || 
            !validaNomeTitular() || 
            !validaDataValidadeCartao()) {
        return false;
    } 
    return true;
}
function validaTelefone() {
    var telefone = $("#telefone");
    if (telefone.val().length < 9) {
        notificaErro("telefone");
        return false;
    } else {
        retornaCor("telefone");
        return true;
    }
}
function validaEmail() {
    var email = $("#email");
    posicaoArroba = email.val().indexOf("@");
    posicaoPonto = email.val().lastIndexOf(".");
    if (posicaoArroba < 1 || posicaoPonto - posicaoArroba < 2) {
        notificaErro("email");
        return false;
    } else {
        retornaCor("email");
        return true;
    }
}
function validaNumero() {
    var numero = $("#enderecoNumero");
    var valor = parseInt(numero.val());
    if (isNaN(valor)) {
        notificaErro("enderecoNumero");
        return false;
    } else {
        retornaCor("enderecoNumero");
        return true;
    }
}
function validaCep() {
    var cep = $("#enderecoCep");
    if (cep.val().length != 9) {
        notificaErro("enderecoCep");
        return false;
    } else {
        retornaCor("enderecoCep");
        return true;
    }
}
function validaEstado() {
    var estado = $("#enderecoEstado");
    if (estado.val().length != 2) {
        notificaErro("enderecoEstado");
        return false;
    } else {
        retornaCor("enderecoEstado");
        return true;
    }
}

function validaBandeira() {
    var numero = $("#bandeira");
    var valor = parseInt(numero.val());
    if (isNaN(valor)) {
        notificaErro("bandeira");
        return false;
    } else {
        retornaCor("bandeira");
        return true;
    }
}
function validaNomeTitular() {
    var nome = $("#nomeTitular");
    if (nome.val().length < 5) {
        notificaErro("nomeTitular");
        return false;
    } else {
        retornaCor("nomeTitular");
        return true;
    }
}
function validaNumeroCartao() {
    var numero = $("#numeroCartao");
    var valor = parseInt(numero.val());
    if (isNaN(valor)) {
        notificaErro("numeroCartao");
        return false;
    } else {
        retornaCor("numeroCartao");
        return true;
    }
}
function validaNumeroVerificacao() {
    var numero = $("#numeroVerificacao");
    var valor = parseInt(numero.val());
    if (isNaN(valor)) {
        notificaErro("numeroVerificacao");
        return false;
    } else {
        retornaCor("numeroVerificacao");
        return true;
    }
}
function validaDataValidadeCartao() {
    var data = $("#dataValidadeCartao");
    if (data.val().length != 5) {
        notificaErro("dataValidadeCartao");
        return false;
    } else {
        retornaCor("dataValidadeCartao");
        return true;
    }
}

function notificaErro(idElemento) {
    var oElemento = $("#" + idElemento);
    alert("Campo " + idElemento + " inválido.");
    oElemento.css("color", "#FF0000");
    oElemento.focus();
}
function retornaCor(idElemento) {
    var oElemento = $("#" + idElemento);
    oElemento.css("color", "");
}