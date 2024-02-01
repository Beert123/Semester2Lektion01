package Opgave1.Storage;

import Opgave1.Models.Spell;
import Opgave1.Models.Weapon;

import java.util.ArrayList;

public class Storage {
    private ArrayList<Spell> spells = new ArrayList<Spell>();

    private ArrayList<Weapon> weapons = new ArrayList<Weapon>();

    public void addWeapon(Weapon weapon){
        weapons.add(weapon);
    }
    public void addSpells(Spell spell){
        spells.add(spell);
    }
}
