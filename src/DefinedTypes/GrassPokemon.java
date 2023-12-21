package PokemonsWorld.src.DefinedTypes;

import PokemonsWorld.src.ObjectConstruction.Pokemon;
import PokemonsWorld.src.Type.PokemonType;

public class GrassPokemon extends Pokemon {

    public GrassPokemon(String name){
        this.name = name;
        this.type = PokemonType.GRASS;
    }
}