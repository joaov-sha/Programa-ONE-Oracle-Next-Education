function desafioUm(){
    let diaDaSemana = prompt("Informe o dia da semana:");
    if(diaDaSemana == "Sábado" || diaDaSemana == "Domingo"){
        alert("Bom fim de semana!");
    }else{
        alert("Boa semana!");
    }
}

function desafioDois(){
    let numero = prompt("Informe um número:")
    if(numero > 0){
        alert("O número informado é positivo!")
    }else if(numero == 0){
        alert("O número informado é zero!");
    }else{
        alert("O número informado é negativo!");
    }
}

function desafioTres(){
    let pontos = 100;
    if(pontos >= 100){
        alert("Parabéns, você venceu!");
    }else{
        alert("Tente novamente para ganhar!");
    }
}

function desafioQuatro(){
    let saldoEmConta = 1000;
    alert(`O seu saldo em conta é: ${saldoEmConta}`);
}

function desafioCinco(){
    let nome = prompt("Informe seu nome:");
    alert(`Olá ${nome}, seja bem-vindo!`);
}