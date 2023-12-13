package PokemonsWorld.src;

import java.util.ArrayList;
import java.util.Optional;

public class DamageCalculator {
    ArrayList<DamageModifyer> modifyerList = new ArrayList<>();

    public DamageCalculator() {
        ArrayList<DamageModifyer> modifyerList = new ArrayList<>();
        modifyerList.add(new DamageModifyer(PokemonType.WATER, PokemonType.FIRE, 5.0f));
        modifyerList.add(new DamageModifyer(PokemonType.FIRE, PokemonType.WATER, 0.5f));
        this.modifyerList = modifyerList;
    }

    public float calculateDamage(PokemonType attacker, PokemonType defender, float damage) {
        return modifyerList.stream().filter(modifier -> modifier.attackerType == attacker && modifier.defenderType == defender).findFirst().get().damageModifiyer * damage;
    }
}