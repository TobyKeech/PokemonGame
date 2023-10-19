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

    public String getDefenceName() {
        return name;
    }

    public int getDefenceValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Pokemon getPokemon() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}
