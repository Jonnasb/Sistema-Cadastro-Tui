// src\components\ListaDeUsuarios\index.js

import { useState, useEffect } from "react";
import axios from "axios";
import './styles.css'

function ListaDeUsuarios() {
    const [usuarios, setUsuarios] = useState([])

    useEffect(() => {
        const carregarUsuarios = async () => {
            try {
                const response = await axios.get('http://localhost:8080/jogadores')
                setUsuarios(response.data)
            } catch (error) {
                alert('Erro ao buscar usuários: ', error)
                setUsuarios([])
            }
        }
        carregarUsuarios()
    }, [])

    return (
        <ul id="listaUsurios" className="lista-usuarios">
            {usuarios.length === 0 ? (
                <li>Nenhum usuário encontrado.</li>
            ) : (
                usuarios.map( usuario => (
                    <li key={usuario.id}>
                        <strong>Nome: </strong> {usuario.nome}<br />
                        <strong>Sexo: </strong> {usuario.sexo} <br />
                        <strong>Idade: </strong> {usuario.idade} <br />
                        <strong>Altura: </strong> {usuario.altura} <br />
                        <strong>Peso: </strong> {usuario.peso} <br />
                        <strong>Posição: </strong> {usuario.posicao} <br />
                        <strong>Número da Camisa: </strong> {usuario.numCamisa}           
                    </li>
                ))
            )}
        </ul>
    )
    
}

export default ListaDeUsuarios