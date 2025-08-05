import styles from './Main.module.css';
import {useState} from 'react';

function Main(){
    const [nome, setNome] = useState("");
    const [lista, setLista] = useState<string[]>([]);

    function addToList(){
        const name = nome.trim();
        if(!name){
            alert("Por favor, insira um nome para continuar!");
            return
        }else{
            setLista([...lista, name]);
            setNome("");
        }
    }

    function drawFriend(){
        
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
                    <button><span className="material-symbols-outlined">play_circle</span>Sortear amigo</button>
                </div>
            </div>
        </div>
    )
}

export default Main