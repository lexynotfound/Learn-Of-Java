package com.example.app;

public class HeroAgility extends Hero {
    String type = "Agility";

    HeroAgility(String nama) {
        super(nama);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Nama Hero : " + this.nama);
    }

    void showoff() {
        System.out.println("Agility Hero");
    }
    
}
