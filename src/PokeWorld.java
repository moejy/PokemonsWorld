package PokemonsWorld.src;

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
        System.out.println(gengar.name + " : " + bisasam.getHP() + " HP");
        System.out.println(gengar.name + " : " + gengar.getType() + " type");
        System.out.println(gengar.name + " LVL : " + gengar.getLevel());
        gengar.restoreHP();
    }
}