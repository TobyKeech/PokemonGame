package com.toby.pokemon.pokemonservice.models;

import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;

@Entity
@Table(name = "defences")
public class Defence {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "name")
    private String name;

    @Column(name= "value")
    private int value;

    @ManyToOne
    @JoinColumn(name = "pokemon_id", nullable = false)
    private Pokemon pokemon;

    public Defence(String name, int value, Pokemon pokemon) {
        this.name = name;
        this.value = value;
        this.pokemon = pokemon;
    }

    public Defence(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
