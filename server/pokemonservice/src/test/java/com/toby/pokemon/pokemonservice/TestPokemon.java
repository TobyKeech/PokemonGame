package com.toby.pokemon.pokemonservice;

import com.toby.pokemon.pokemonservice.models.Pokemon;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPokemon {

    Pokemon squirtle;
    Pokemon charmander;
    Pokemon Pickachu;

    @Before
    public void setUp(){

        squirtle = new Pokemon("squritle", 100, "water", "testpath");

        charmander = new Pokemon("charmander", 100, "fire", "test");

        Pickachu = new Pokemon("pikachu", 100, "electric", "test");

    }
}
