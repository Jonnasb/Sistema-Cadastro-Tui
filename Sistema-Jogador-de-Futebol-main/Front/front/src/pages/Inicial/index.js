import React from 'react';
import { useNavigate } from 'react-router-dom';
import './Welcome.css';

function Welcome() {
  const navigate = useNavigate();

  const handleClick = () => {
    navigate('/Welcome');
  };

  return (
    <div className="welcome-container">
      <h1>Bem-vindo ao Time ACELERAR!!</h1>
      <p>Orgulho, paixão e futebol de verdade.</p>
      <button onClick={handleClick}>Cadastrar</button>
    </div>
  );
}

export default Welcome;