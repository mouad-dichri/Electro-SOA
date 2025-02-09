
import { BrowserRouter, Route, Routes } from 'react-router-dom'
import './App.css'
import ShowAll from './component/produit/ShowAll'
import Layout from './Layout'
import Home from './Home'
import Login from './login'


function App() {

  return (
    <>
    <BrowserRouter>
    <Routes>
    <Route path="/" element={<Layout />}>
                    <Route index element={<Home />} />
                    <Route path="/login" element={<Login />} />
                    <Route path="/produits" element={<ShowAll />} />
                </Route>
    </Routes>
    </BrowserRouter>
 
    </>
  )
}

export default App
