package com.toby.pokemon.pokemonservice.models;

public class Attack {

    private String name;

    private int value;

    private Pokemon pokemon;

    public Attack(String name, int value, Pokemon pokemon) {
        this.name = name;
        this.value = value;
        this.pokemon = pokemon;
    }
}
