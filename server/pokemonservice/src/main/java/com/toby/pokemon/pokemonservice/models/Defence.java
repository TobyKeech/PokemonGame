package com.toby.pokemon.pokemonservice.models;

public class Defence {

    private String name;

    private int value;

    private Pokemon pokemon;

    public Defence(String name, int value, Pokemon pokemon) {
        this.name = name;
        this.value = value;
        this.pokemon = pokemon;
    }
}
