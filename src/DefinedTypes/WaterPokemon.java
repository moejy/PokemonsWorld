package PokemonsWorld.src.DefinedTypes;

import PokemonsWorld.src.ObjectConstruction.Pokemon;
import PokemonsWorld.src.Type.PokemonType;

public class WaterPokemon extends Pokemon {

    public WaterPokemon(String name){
        this.name = name;
        this.type = PokemonType.WATER;
    }
}