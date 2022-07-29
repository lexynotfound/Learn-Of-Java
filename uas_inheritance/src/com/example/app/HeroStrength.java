package com.example.app;

public class HeroStrength extends Hero {

    String type = "Strength";

    //subclass of Hero / constructor
    public HeroStrength(String name, double hp, double atk) {
        super(name, hp, atk);
    }

    @Override
    public
    void display(){
        System.out.println("Name: " + name);
        System.out.println("HP: " + hp);
        System.out.println("ATK: " + atk);
        System.out.println("Type: " + type);
    }

    @override
    void takeDamage(double damage){
        this.hp -= 0.5 * damage;
        System.out.println(this.name + " Receive Half Damage : " + this.hp + " -> " + 0.5*damage);
    }
    
}
