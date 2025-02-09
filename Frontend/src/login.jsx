import { useState } from "react";
import { useNavigate } from "react-router-dom";
import axios from "axios";

export default function Login() {
    const [nom, setNom] = useState("");
    const [password, setPassword] = useState("");
    const [error, setError] = useState("");

    const navigate = useNavigate(); 

    const handleLogin = async (e) => {
        e.preventDefault();
        setError(""); 

        try {
            const response = await axios.post("http://localhost:8088/clients/login", {
                nom,
                password
            });

            if (response.status === 200) {
               // alert("Connexion réussie !");
                navigate("/produits"); 
            }
        } catch (err) {
            setError("Nom ou mot de passe incorrect !");
        }
    };

    return (
        <div>
            <h2>Connexion</h2>
            <form onSubmit={handleLogin}>
                <input
                    type="text"
                    placeholder="Nom"
                    value={nom}
                    onChange={(e) => setNom(e.target.value)}
                    required
                />
                <input
                    type="password"
                    placeholder="Mot de passe"
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                    required
                />
                <button type="submit">Se connecter</button>
            </form>
            {error && <p style={{ color: "red" }}>{error}</p>}
        </div>
    );
}
