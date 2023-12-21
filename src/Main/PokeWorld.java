package PokemonsWorld.src.Main;

import PokemonsWorld.src.DefinedTypes.*;

public class PokeWorld {
    public static void main(String[] args) {
        GhostPokemon gengar = new GhostPokemon("gengi");
        FirePokemon feuriegel = new FirePokemon("feuri");
        GrassPokemon bisasam = new GrassPokemon("bisa");
        WaterPokemon shiggy = new WaterPokemon("shiggybi");
        PsychicPokemon alkazam = new PsychicPokemon("alka");
        RockPokemon onix = new RockPokemon("onix");
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