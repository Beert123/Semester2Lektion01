package Opgave1.Models;

import java.util.ArrayList;

public class Warrior extends Character{
    private ArrayList<Weapon> weapons;

    public Warrior(String name, int level, ArrayList<Weapon> weapons) {
        super(name, level);
        this.weapons = weapons;
    }
}
