import {ReactComponent as IconGitHub} from "assets/img/github.svg";
import "./styles.css";

function NavBar() {
    return (
        <header>
            <nav className= "container">
                <div className= "dsmovie-nav-content">
                    <h1>DSMovie</h1>
                    <a href="https://github.com/dennisferreira1" target="_blank" rel="noreferrer">
                        <div className= "dsmovie-contact-container">
                            <IconGitHub/>
                            <p className= "dsmovie-contact-link">/dennisferreira1</p>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    )
}

export default NavBar;