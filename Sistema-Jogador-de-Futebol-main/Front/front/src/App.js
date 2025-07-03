import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import PaginaCadastro from './pages/Cadastro';
import PaginaListaUsuarios from './pages/Lista';
import './App.css'; // Para estilos globais, se necessário
import Welcome from './pages/Inicial';

function App() {
  return (
    <Router>
      <Routes>
        <Route path="/welcome" element={<PaginaCadastro />}/>
        <Route path="/" element={<Welcome/>} />
        <Route path="/usuarios" element={<PaginaListaUsuarios />} />
      </Routes>
    </Router>
  );
}

export default App;