/*
  UAS PROGRAMMING II
  KURNIA RAIHAN ARDIAN
  2122.01.0018
 */

package com.example.app;

public class Main{
    public static void main(String[] args) {
        Hero hero1 = new Hero("Kurnia Raihan Ardian");
        HeroStrength hero2 = new HeroStrength("Kurnia");
        hero1.display();
        hero2.display();

        // Polymorphism
        Hero hero3 = new HeroAgility("Febe");
        hero3.display();

        HeroAgility hero4 = new HeroAgility("Wasda");
        hero4.display();
        hero4.showoff();

        // Array List
        Hero[] heroes = new Hero[4];
        heroes[0] = hero1;
        heroes[1] = hero2;
        heroes[2] = hero3;
        heroes[3] = hero4;//casting

        heroes[0].display();
        heroes[1].display();
        heroes[2].display();

        // Method calls atau memanggil
        hero4.showoff();

        // aplikasi
        hero1.attack(hero3);
        hero1.attack(hero2);
        hero1.attack(hero4);
    }
}
