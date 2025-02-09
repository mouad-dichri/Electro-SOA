import "./Product.css"; 

export default function Product({ prod }) {
  return (
    <div className="product-card">
      <h2>{prod.nom}</h2>
      <p>Prix: {prod.prix} €</p>
      <button>Acheter</button>
    </div>
  );
}
