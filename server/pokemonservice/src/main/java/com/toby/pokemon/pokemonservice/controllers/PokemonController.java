package com.toby.pokemon.pokemonservice.controllers;


import com.toby.pokemon.pokemonservice.models.Pokemon;
import com.toby.pokemon.pokemonservice.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PokemonController {

    @Autowired
    PokemonRepository pokemonRepository;

    @GetMapping(value = "/pokemons")
    public ResponseEntity<List<Pokemon>> getAllPokemonsOrByName(
            @RequestParam(name = "name", required = false) String name){
        if(name != null){
            return new ResponseEntity<>(pokemonRepository.findByName(name), HttpStatus.OK);
        }
        return new ResponseEntity<>(pokemonRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/pokemons/{id}")
    public ResponseEntity getPokemon(@PathVariable Long id){
        return new ResponseEntity(pokemonRepository.findById(id), HttpStatus.OK);
    }

}
