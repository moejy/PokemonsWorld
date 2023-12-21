package PokemonsWorld.src.DefinedTypes;

import PokemonsWorld.src.ObjectConstruction.Pokemon;
import PokemonsWorld.src.Type.PokemonType;

public class FirePokemon extends Pokemon {

    public FirePokemon(String name){
        this.name = name;
        this.type = PokemonType.FIRE;
    }
}