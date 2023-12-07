package PokemonsWorld.src;

import java.util.Random;

public class Pokemon {
    Random random = new Random(); //TODO
    private int maxDMG = 15;
    final String name;
    private int HP = 100;
    private int level = 1;
    private String type;
    private int DMG = random.nextInt(maxDMG);
    private int EXP = 0;


    public Pokemon(String name, String typeOfPoke) {
        this.name = name;
        this.type = typeOfPoke;
    }

    public void fight(Pokemon enemy) {
        while (this.HP > 0 && enemy.HP > 0) {


            enemy.HP = enemy.HP - this.DMG;
            enemy.hpInZero();
            System.out.println(this.name + " ATTACK..." + this.DMG + " dmg made and " + enemy.name + " " + enemy.HP + " HP left");

            if (enemy.HP <= 0) {
                break;
            }


            this.HP = this.HP - enemy.DMG;
            this.hpInZero();
            System.out.println(enemy.name + " ATTACK..." + enemy.DMG + " dmg made and " + this.name + " " + this.HP + " HP left");


        }
        boolean thisPokemonWon = enemy.HP <= 0;
        boolean enemyPokemonWon = this.HP <= 0;

        this.deadMessage();
        enemy.expGainer(enemyPokemonWon);
        this.lvlUP();

        enemy.deadMessage();
        this.expGainer(thisPokemonWon);
        enemy.lvlUP();
    }


    // Private = The methods can only be used with the poke class.
    public void greet() {
        System.out.println("i am ur new pokemon " + this.name + " and iam from the type " + this.type);
    }


    private void hpInZero() {
        if (this.HP <= 0) {
            this.HP = 0;
        }
    }

    private void deadMessage() {
        if (this.HP <= 0) {
            System.out.println("oh no..." + this.name + " is dead");
        }
    }

    private void expGainer(boolean wonBattle) {
        if (wonBattle) {
            this.EXP += 10;
            System.out.println(this.name + " gained +10 EXP! - now you have " + this.EXP + " EXP! ");
        }
    }

    private void lvlUP() { //TODO
        if (this.EXP >= 100) {
            System.out.println(this.name + " got level up ");
        }
    }

    public void restoreHP() {
        System.out.println(this.name + "is getting healed... ");
        this.HP = 100;
    }


    //Getter methods

    public int getHP() {
        return this.HP;
    }

    public int getLevel() {
        return this.level;
    }

    public String getType() {
        return this.type;
    }
}

// level up method : - If one poke.Obj wins the fight , he will get XP%
// first level starts at 0 & level up will be at 100xp / every level up needs more XP% // every level + 2 %
// The HP increase while level up.// random