package PokemonsWorld.src.DefinedTypes;

import PokemonsWorld.src.ObjectConstruction.Pokemon;
import PokemonsWorld.src.Type.PokemonType;

public class BugPokemon extends Pokemon {

    public BugPokemon(String name) {
        this.name = name;
        this.type = PokemonType.BUG;
    }
}