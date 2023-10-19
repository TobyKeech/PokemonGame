package com.toby.pokemon.pokemonservice.repositories;

import com.toby.pokemon.pokemonservice.models.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
