package com.toby.pokemon.pokemonservice.repositories;

import com.toby.pokemon.pokemonservice.models.Attack;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttackRepository extends JpaRepository<Attack, Long> {
}
