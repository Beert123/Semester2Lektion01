package Opgave1.Storage;

import Opgave1.Models.*;
import Opgave1.Models.Character;

import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        Storage storage = innitStorage();
    }
    private static Storage innitStorage(){
        Storage storage = new Storage();

        Weapon longSword = new Weapon("Long sword");
        Weapon shortBow = new Ranged("Shortbow", 80);
        ArrayList<Weapon> weaponsBarbar1 = new ArrayList<>();
        weaponsBarbar1.add(longSword);
        weaponsBarbar1.add(shortBow);

        Warrior barbar1 = new Barbarian("Forstelr", 1, weaponsBarbar1);

        Spell fireBall = new Spell(150,Duration.INSTANTANEOUS);
        ArrayList<Spell> wizSpells = new ArrayList<>();
        wizSpells.add(fireBall);

        Spellcaster wiz1 = new Wizard("Orlemaex", 1, wizSpells);

        storage.addSpells(fireBall);
        storage.addWeapon(longSword);
        storage.addWeapon(shortBow);


        return storage;
    }
}
