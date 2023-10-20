package com.toby.pokemon.pokemonservice.components;

import com.toby.pokemon.pokemonservice.models.Attack;
import com.toby.pokemon.pokemonservice.models.Defence;
import com.toby.pokemon.pokemonservice.models.Pokemon;
import com.toby.pokemon.pokemonservice.repositories.AttackRepository;
import com.toby.pokemon.pokemonservice.repositories.DefenceRepository;
import com.toby.pokemon.pokemonservice.repositories.PokemonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("!test")
//@Component //Comment this out if you do not to run the data loader.
public class DataLoader implements ApplicationRunner {

    @Autowired
    PokemonRepository pokemonRepository;

    @Autowired
    AttackRepository attackRepository;

    @Autowired
    DefenceRepository defenceRepository;


    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        Pokemon squirtle = new Pokemon("Squritle", 100, "water", "https://i.ibb.co/zJqy5G8/html.gif");
        pokemonRepository.save(squirtle);
        Pokemon charmander = new Pokemon("Charmander", 100, "fire", "https://i.ibb.co/hyD57DQ/css.gif");
        pokemonRepository.save(charmander);
        Pokemon pikachu = new Pokemon("Pikachu", 100, "electric", "https://i.ibb.co/M5b5Ms5/js.gif");
        pokemonRepository.save(pikachu);

        Attack waterBlast = new Attack("Water Blast", 25, squirtle);
        attackRepository.save(waterBlast);
        Attack fireBlast = new Attack("Fire Blast", 25, charmander);
        attackRepository.save(fireBlast);
        Attack electricBlast = new Attack("Electric Blast", 25, pikachu);
        attackRepository.save(electricBlast);

        Defence waterBlock = new Defence("Water Block", 25, squirtle);
        defenceRepository.save(waterBlock);
        Defence fireBlock = new Defence("Fire Block", 25, charmander);
        defenceRepository.save(fireBlock);
        Defence electricBlock = new Defence("Electric Block", 25, pikachu);
        defenceRepository.save(electricBlock);


    }
};
