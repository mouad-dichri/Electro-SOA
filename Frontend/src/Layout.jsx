import { Outlet } from "react-router-dom";

export default function Layout() {
    return (
        <div>
            <header>
                <h1>Electro DICHRI</h1>
                <nav>
                    <a href="/">Accueil</a> | <a href="/produits">Produits</a>| <a href="/login">Se Connecter</a>
                </nav>
            </header>
            
            <main>
                <Outlet /> 
            </main>

            <footer>
                <p>© 2025 Electro Dichri. Tous droits réservés.</p>
            </footer>
        </div>
    );
}
