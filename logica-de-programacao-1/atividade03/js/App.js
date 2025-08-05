function desafioUm(){
    let contador = 0;
    while(contador < 10){
        contador++;
        console.log(contador);
    }
}

function desafioDois(){
    let contador = 10;
    while(contador > 1){
        console.log(contador);
        contador--;
    }
}

function desafioTres(){
    let numero = parseInt(prompt("Informe um número"));
    if(numero > 0){
        while(numero > 0){
            console.log(numero);
            numero--;
        }
    }else{
        while(numero < 0){
            console.log(numero);
            numero++;
        }
    }
}

function desafioQuatro(){
    let numero = parseInt(prompt("Informe um número:"));
    let contador = 0;
    if(numero > 0){
        while(contador < numero){
            console.log(contador);
            contador++;
        }
    }
}