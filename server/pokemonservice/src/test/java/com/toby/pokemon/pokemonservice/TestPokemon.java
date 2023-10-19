package com.toby.pokemon.pokemonservice;

import com.toby.pokemon.pokemonservice.models.Attack;
import com.toby.pokemon.pokemonservice.models.Defence;
import com.toby.pokemon.pokemonservice.models.Pokemon;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestPokemon {

    Pokemon squirtle;
    Pokemon charmander;
    Pokemon pickachu;

    Attack waterBlast;
    Attack fireBlast;
    Attack electricBlast;

    Defence waterBlock;
    Defence fireBlock;
    Defence electricBlock;


    @Before
    public void setUp(){

//        pokemon set up for testing

        squirtle = new Pokemon("squritle", 100, "water", "testpath");
        charmander = new Pokemon("charmander", 100, "fire", "test");
        pickachu = new Pokemon("pikachu", 100, "electric", "test");

//        attack set up for testing

        waterBlast = new Attack("water blast", 25, squirtle);
        fireBlast = new Attack("fire blast", 25, charmander);
        electricBlast = new Attack("electric blast", 25, pickachu);

//        defence set up for testing
        waterBlock = new Defence(" water block", 25, squirtle);
        fireBlock = new Defence(" fire block", 25, charmander);
        electricBlock = new Defence("electric block", 25, pickachu);

    }

    @Test
    public void pokeHasName(){
        assertEquals("squritle", squirtle.getName());
    }

    @Test
    public void pokeHasType(){
        assertEquals("water", squirtle.getType());
    }
    @Test
    public void pokeHasHp(){
        assertEquals(100, squirtle.getHp());
    }

    @Test
    public void attackHasName(){
        assertEquals("fire blast", fireBlast.getAttackName());
    }

    @Test
    public void attackHasValue(){
        assertEquals(25, fireBlast.getAttackValue());
    }

    @Test
    public void attackAssignedToPokemon(){
        assertEquals(charmander, fireBlast.getPokemonWhoAttacked());
    }

    @Test
    public void defenceHasName(){
        assertEquals("electric block", electricBlock.getDefenceName());
    }

    @Test
    public void defenceHasValue(){
        assertEquals(25, electricBlock.getDefenceValue());
    }

    @Test
    public void defenceAssignedToPokemon(){
        assertEquals(pickachu, electricBlock.getPokemon());
    }

    @Test
    public void addAttack(){
        charmander.addAttack(fireBlast);
        charmander.addAttack(fireBlast);
        charmander.addAttack(fireBlast);
        assertEquals(3, charmander.getNumberOfAttacks());
    }

    @Test
    public void addDefence(){
        pickachu.addDefence(electricBlock);
        pickachu.addDefence(electricBlock);
        pickachu.addDefence(electricBlock);
        assertEquals(3, pickachu.getNumberOfDefences());
    }


}
