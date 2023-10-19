package com.toby.pokemon.pokemonservice.models;

import javax.persistence.*;

@Entity
@Table( name = "attacks")

public class Attack {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private int value;


    @ManyToOne
    @JoinColumn(name = "pokemon_id", nullable = false)
    private Pokemon pokemon;

    public Attack(String name, int value, Pokemon pokemon) {
        this.name = name;
        this.value = value;
        this.pokemon = pokemon;
    }

    public Attack(){}

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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
