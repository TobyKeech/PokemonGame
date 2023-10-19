package com.toby.pokemon.pokemonservice.models;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "pokemons")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "hp")
    private int hp;
    @Column(name = "type")
    private String type;
    @Column(name = "imgPath")
    private String imgpath;

    @JsonIgnoreProperties({"pokemon"})
    @OneToMany(mappedBy = "pokemon")
    private List<Attack>attackList;

    @JsonIgnoreProperties({"pokemon"})
    @OneToMany(mappedBy = "pokemon")
    private List<Defence>defenceList;

    public Pokemon ( String name, int hp, String type,String imgpath){
        this.name = name;
        this.hp = hp;
        this.type = type;
        this.imgpath = imgpath;
        this.attackList= new ArrayList<Attack>();
        this.defenceList = new ArrayList<Defence>();

    }

    public Pokemon(){};

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getType() {
        return type;
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public List<Attack> getAttackList() {
        return attackList;
    }

    public void setAttackList(List<Attack> attackList) {
        this.attackList = attackList;
    }

    public List<Defence> getDefenceList() {
        return defenceList;
    }

    public void setDefenceList(List<Defence> defenceList) {
        this.defenceList = defenceList;
    }

    public int getNumberOfAttacks(){
        return this.attackList.size();
    }

    public void addAttack(Attack attack){
        this.attackList.add(attack);
    }

    public int getNumberOfDefences(){
        return this.defenceList.size();
    }

    public void addDefence(Defence defence){
        this.defenceList.add(defence);
    }
}
