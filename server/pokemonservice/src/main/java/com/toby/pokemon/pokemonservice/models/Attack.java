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

    public String getAttackName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttackValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Pokemon getPokemonWhoAttacked() {
        return pokemon;
    }

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }
}
