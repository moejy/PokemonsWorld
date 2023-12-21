package PokemonsWorld.src.DefinedTypes;

import PokemonsWorld.src.ObjectConstruction.Pokemon;
import PokemonsWorld.src.Type.PokemonType;

public class RockPokemon extends Pokemon {

    public RockPokemon(String name){
        this.name = name;
        this.type = PokemonType.ROCK;
    }
}