import styles from './Main.module.css';
import {useState} from 'react';

function Main(){
    const [nome, setNome] = useState("");
    const [lista, setLista] = useState<string[]>([]);
    const [sorteado, setSorteado] = useState<string | null>(null);

    function addToList(){
        const name = nome.trim();
        if(!name){
            alert("Por favor, insira um nome para continuar!");
            return
        }

        if(lista.includes(name)){
            alert("Nome já adicionado!");
            return;
        }

        setLista([...lista, name]);
        setNome("");
    }

    function drawFriend(){
        if(lista.length === 0){
            alert("Não há nomes para sortear!");
            return;
        }

        const position = Math.floor(Math.random() * lista.length);
        const nomeSorteado = lista[position];

        setSorteado(nomeSorteado);
        setLista(lista.filter(nome => nome !== nomeSorteado));
    }

    return(
        <div className={styles.challenge}>
            <div className={styles.container}>
                <h2>Digite o nome de seus amigos</h2>
                <div>
                    <input type="text" placeholder='Insira um nome' value={nome} onChange={e => setNome(e.target.value)}/>
                    <button onClick={addToList}>Adicionar</button>
                </div>
                <div className={styles.lista}>
                    <ul>
                        {lista.map((item, index) => (
                        <li key={index}>{item}</li>
                        ))}
                    </ul>
                </div>
                <div className={styles.controls}>
                    <button onClick={drawFriend}><span className="material-symbols-outlined">play_circle</span>Sortear amigo</button>
                </div>
                {sorteado && (
                    <div className={styles.resultado}>
                        <p><b>Amigo sorteado: {sorteado}</b></p>
                    </div>
                )}
            </div>
        </div>
    )
}

export default Main