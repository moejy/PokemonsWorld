package PokemonsWorld.src.Main;

import PokemonsWorld.src.DefinedTypes.*;

public class PokeWorld {
    public static void main(String[] args) {
        GhostPokemon gengar = new GhostPokemon("geengi");
        FirePokemon feuriegel = new FirePokemon("feueri");
        GrassPokemon bisasam = new GrassPokemon("bissa");
        WaterPokemon shiggy = new WaterPokemon("shigsgybi");
        PsychicPokemon alkazam = new PsychicPokemon("alkaaa");
        RockPokemon onix = new RockPokemon("onyix");
        BugPokemon metapod = new BugPokemon("metaMoon");

        metapod.greet();
        onix.greet();
        alkazam.greet();
        gengar.greet();
        bisasam.greet();
        feuriegel.greet();
        shiggy.greet();
        shiggy.fight(feuriegel);
        System.out.println(shiggy.getName() + " : " + shiggy.getHP() + " HP");
        System.out.println(shiggy.getName() + " : " + shiggy.getType() + " type");
        System.out.println(shiggy.getName() + " LVL : " + shiggy.getLevel());
        shiggy.restoreHP();
    }
}