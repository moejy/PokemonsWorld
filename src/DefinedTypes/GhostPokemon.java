package PokemonsWorld.src.DefinedTypes;

import PokemonsWorld.src.ObjectConstruction.Pokemon;
import PokemonsWorld.src.Type.PokemonType;

public class GhostPokemon extends Pokemon {

    public GhostPokemon(String name)  {
        this.name = name;
        this.type = PokemonType.GHOST;
    }
}