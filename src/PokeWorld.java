package PokemonsWorld.PokemonWorld;

public class PokeWorld {
    public static void main(String[] args) {
        Pokemon shiggy = new Pokemon("Shiggy", "Water");
        Pokemon fireu = new Pokemon("Fireu", "Fire");


        shiggy.greet();
        fireu.greet();
        shiggy.fight(fireu);
        System.out.println(shiggy.name + " : " + shiggy.getHP() + " HP");
        System.out.println(shiggy.name + " : " + shiggy.getType() + " type");
        System.out.println(shiggy.name + " LVL : " + shiggy.getLevel());
        shiggy.restoreHP();
    }
}