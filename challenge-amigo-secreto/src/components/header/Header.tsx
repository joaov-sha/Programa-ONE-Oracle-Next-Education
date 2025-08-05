import styles from './Header.module.css';

function Header(){
    
    return(
        <div className={styles.header}>
            <div className={styles.container}>
                <h1>Amigo Secreto</h1>
                <img src="src/assets/images/Gemini_Generated_Image_63vi4e63vi4e63vi.png" alt="" />
            </div>
        </div>
    )
}

export default Header