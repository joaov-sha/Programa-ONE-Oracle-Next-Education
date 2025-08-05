function desafioUm(){
    alert("Boas vindas ao nosso site!");
}

function desafioDois(){
    let nome = "Lua";
}

function desafioTres(){
    let idade = 25;
}

function desafioQuatro(){
    let numeroDeVendas = 50;
}

function desafioCinco(){
    let saldoDisponivel = 1000;
}

function desafioSeis(){
    alert("Erro! Preencha todos os campos");
}

function desafioSete(){
    let mensagemDeErro = "Erro! Preencha todos os campos";
    alert(mensagemDeErro);
}

function desafioOito(){
    let nome = prompt("Informe um nome de usuário: ");
}

function desafioNove(){
    let idade = parseInt(prompt("Informe a sua idade:"));
    return idade;
}

function desafioDez(){
    let idade = desafioNove();
    if(idade >= 18){
        alert("Pode tirar a habilitação!")
    }
}