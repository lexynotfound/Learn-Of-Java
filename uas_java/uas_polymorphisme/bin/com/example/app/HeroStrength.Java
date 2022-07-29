package com.example.app;

public class HeroStrength extends Hero{
    String type = "Strength";

    HeroStrength(String nama) {
        super(nama);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Type \t: " + this.type);
    }

    /* void showoff() {
        System.out.println("Strength Hero");
    } */
}