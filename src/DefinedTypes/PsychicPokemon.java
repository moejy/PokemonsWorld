package PokemonsWorld.src.DefinedTypes;

import PokemonsWorld.src.ObjectConstruction.Pokemon;
import PokemonsWorld.src.Type.PokemonType;

public class PsychicPokemon extends Pokemon {

    public PsychicPokemon(String name){
        this.name = name;
        this.type = PokemonType.PSYCHIC;

    }
}