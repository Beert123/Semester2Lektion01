package Opgave1.Models;

import java.util.ArrayList;

public class Spellcaster extends Character {
    private ArrayList<Spell> spells;
    public Spellcaster(String name, int level, ArrayList<Spell> spells) {
        super(name, level);
        this.spells = spells;
    }
}
