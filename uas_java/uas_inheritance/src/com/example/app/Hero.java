package com.example.app;

/**
 * Hero class.
 */
public class Hero {
    String name;
    double hp, atk;

    public Hero(String name, double hp, double atk) {
        this.name = name;
        this.hp = hp;
        this.atk = atk;
    }

    //melakukan sebuah method atau penyerangan
    void attack(Hero enemy){
        System.out.println("\n" + this.name + "Attack");
        enemy.takeDamage(this.atk);
    }
    //melakukan sebuah method untuk menggambil attack power
    void takeDamage(double damage){
        this.hp -= damage;
        System.out.println(this.name + " Receive Damage : " + this.hp);
    }

    // method untuk menampilkan data hero
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("ATK: " + atk);
    }
}
