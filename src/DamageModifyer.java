package PokemonsWorld.src;

public class DamageModifyer {

    PokemonType attackerType;

    PokemonType defenderType;

    float damageModifiyer = 1.0f;

    public DamageModifyer(PokemonType attacker, PokemonType defender, float modifyer ){
        this.attackerType = attacker;
        this.defenderType = defender;
        this.damageModifiyer = modifyer;
    }
    public DamageModifyer(PokemonType attacker, PokemonType defender){
        this.attackerType = attacker;
        this.defenderType = defender;
    }
}