var pontuacaoUs = 0
var pontuacaoPc = 0



function jogar(){

    let maoUsuario = Number(prompt('Pedra(1), papel(2) ou Tesoura(3)?'))
    let random = parseInt(Math.random() * 3 + 1)
    let maoComputador = random

    if(maoComputador === maoUsuario){
        alert('Empatou')
        return

    }else{
        switch(maoUsuario){
            case 1:
                if(maoUsuario == 1 && maoComputador == 2){
                    alert('O computador pontuou!')
                    pontuacaoPc ++;
                }else if(maoUsuario == 1 && maoComputador == 3){
                    alert('O usuário pontuou!')
                    pontuacaoUs ++;
                }
            break;
            case 2:
                if(maoUsuario == 2 && maoComputador == 1){
                    alert('O usuário pontuou!')
                    pontuacaoUs ++;
                }else if(maoUsuario == 2 && maoComputador == 3){
                    alert('O computador pontuou!')
                    pontuacaoPc ++;
                }
                break;
            case 3:
                if(maoUsuario == 3 && maoComputador == 1){
                    alert('O computador pontuou!')
                    pontuacaoPc ++;
                }else if(maoUsuario == 3 && maoComputador == 2){
                    alert('O usuário pontuou!')
                    pontuacaoUs ++;

                }

        }
    }   
    document.getElementById("#pontuacaoPc").innerHTML = `Pontuação do Computador: ${pontuacaoPc}`
    document.getElementById("#pontuacaoUs").innerHTML = `Pontuação do Jogador: ${pontuacaoUs}`

}

