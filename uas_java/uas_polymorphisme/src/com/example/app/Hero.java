package com.example.app;

public class Hero{
    
    String nama;

    Hero(String nama){
        this.nama = nama;
    }

    void display(){
        System.out.println("Nama Hero : " + this.nama);
    }

    void attack(Hero enemy){
        System.out.println(this.nama + " menyerang " + enemy.nama);
    }
}