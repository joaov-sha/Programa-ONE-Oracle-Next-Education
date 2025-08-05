function desafioUm(){
    console.log("Hello World!");
}

function desafioDois(){
    let nome = prompt("Informe seu nome:");
    console.log(`Olá, ${nome}!`);
}

function desafioTres(){
    let nome = prompt("Informe seu nome:");
    alert(`Olá, ${nome}!`);
}

function desafioQuatro(){
    let linguagem = prompt("Qual a linguagem de programação que você mais gosta ?");
    console.log(linguagem);
}

function desafioCinco(){
    let numero1, numero2, resultado;
    numero1 = parseInt(prompt("Informe um número qualquer:"));
    numero2 = parseInt(prompt("Informe outro número qualquer:"));
    resultado = numero1+numero2;
    console.log(`A soma de ${numero1} e ${numero2} é igual a ${resultado}.`);
}

function desafioSeis(){
    let numero1, numero2, resultado;
    numero1 = parseInt(prompt("Informe um número qualquer:"));
    numero2 = parseInt(prompt("Informe outro número qualquer:"));
    resultado = numero1-numero2;
    console.log(`A diferença entre ${numero1} e ${numero2} é igual a ${resultado}`);
}

function desafioSete(){
    let idade = parseInt(prompt("Informe sua idade"));
    if(idade >= 18){
        console.log("Você é maior de idade!");
    }else{
        console.log("Você é menor de idade!");
    }
}

function desafioOito(){
    let numero = parseInt(prompt("Informe um número qualquer"));
    if(numero > 0){
        console.log(`O número informado (${numero}) é positivo!`);
    }else if(numero == 0){
        console.log(`O número informado ${numero} é zero!`);
    }else{
        console.log(`O número informado (${numero} é negativo!)`);
    }
}


function desafioNove(){
    let numero = 1;
    while(numero <= 10){
        console.log(numero);
        numero++;
    }
}

function desafioDez(){
    let nota = 7.5;
    if(nota >= 7){
        console.log("Aprovado!");
    }else{
        console.log("Reprovado!");
    }
}

function desafioOnze(){
    console.log(Math.random());
}

function desafioDoze(){
    let numeroAleatorio = Math.floor(Math.random() * 10 - 1 + 1);
    console.log(numeroAleatorio);
}

function desafioTreze(){
    let numeroAleatorio = Math.floor(Math.random() * 1000 - 1 + 1);
    console.log(numeroAleatorio);
}