package org.example.rpg;

public class GameTest {

    public static void main(String[] args) {

        Troll troll = new Troll("Mountain Troll", 300, 40);

        System.out.println("Monster: " + troll.getName());
        System.out.println("Base Damage: " + troll.getDamage());
        System.out.println("Bleed Damage: " + troll.bleed());
        System.out.println("Poison Damage: " + troll.poison());
        System.out.println("Total Attack Damage: " + troll.attack());
    }
}
