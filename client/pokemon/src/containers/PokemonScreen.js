import React, { useEffect, useState } from 'react'
import pokemon from '../components/Pokemon';
import Pokemon from '../components/Pokemon'

const PokemonContainer = () => {

  const [pokemonData, setPokemonData] = useState([]);


  useEffect(()=>{
    getPokemons();
  }, [])

  const getPokemons = function (){
    fetch('http://localhost:8080/pokemons')
    .then(res => res.json())
    .then(pokemonData => setPokemonData(pokemonData))
    console.log(pokemonData)
    console.log("hello")
  }

  console.log(pokemonData)


    
  return (
    <>

    <Pokemon pokemons={pokemonData}/> 
    </>
  )
}

export default PokemonContainer