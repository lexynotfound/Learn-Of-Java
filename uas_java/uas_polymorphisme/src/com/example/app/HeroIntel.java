package com.example.app;

public class HeroIntel extends Hero {
    String type = "Intel";

    HeroIntel(String nama) {
        super(nama);
    }

    @Override
    void display() {
        super.display();
        System.out.println("Nama Hero : " + this.nama);
    }
    
}
