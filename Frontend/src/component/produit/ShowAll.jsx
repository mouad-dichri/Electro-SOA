import axios from "axios";
import { useEffect, useState } from "react";
import Product from "./Product";
import "./ShowAll.css"; // Ajout du fichier CSS

export default function ShowAll() {
  const [products, setProducts] = useState([]);

  useEffect(() => {
    axios
      .get("http://localhost:8081/produits/showAll")
      .then((result) => setProducts(result.data))
      .catch((error) => console.log("Erreur de récupération de l'API: " + error));
  }, []);

  return (
    <div className="container">
      <h1>Liste des Produits</h1>
      <div className="product-grid">
        {products.map((prod) => (
          <Product key={prod.id} prod={prod} />
        ))}
      </div>
    </div>
  );
}
