let drawnNumber = drawNumber();
let trys = 0;

window.addEventListener("load", () => {
    showTitles();
});

function showTitles(){
    let title = document.querySelector('h1');
    title.innerHTML = `Jogo do número secreto`;
    let subTitle = document.querySelector('p');
    subTitle.innerHTML = `Escolha um número entre 1 e 10`;
}

function drawNumber(){
    let number = Math.floor(Math.random() * 10 - 1 + 1) + 1;
    let drawnNumbers = [];
    if(drawnNumbers.includes(number)){
        drawNumber();
    }else{
        drawnNumbers.push(number);
        return number;
    }
}

function validateNumber(){
    let userNumber = document.getElementById("secret").value;
    if(userNumber == drawnNumber){
        trys++;
        document.querySelector("h1").innerHTML = `Parabéns, você acertou o número!`;
        document.querySelector("p").innerHTML = `O número era: ${userNumber} e você fez ${trys} tentativa(s)!`;
        document.getElementById("secret").setAttribute("disabled", true);
        document.getElementById("play").setAttribute("disabled", true);
        document.getElementById("reset").setAttribute("disabled", false);
    }else{
        trys++;
        document.getElementById("secret").value = "";
        document.getElementById("secret").focus();
        if(userNumber > drawnNumber){
            document.querySelector("p").innerHTML = `O número secreto é menor que o número informado!`;
        }else{
            document.querySelector("p").innerHTML = `O número secreto é maior que o número informado!`;
        }
    }
    if(trys >= 10){
        document.getElementById("secret").setAttribute("disabled",true);
        document.querySelector("h1").innerHTML = `Infelizmente você perdeu!`;
        document.querySelector("p").innerHTML = `O número era: ${userNumber} e você fez ${trys} tentativa(s)`;
        document.getElementById("reset").setAttribute("disabled", false);
    }
}

function resetGame(){
    let i = 0;
    console.log(i);
    i++;
}