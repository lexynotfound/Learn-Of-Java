/*
  UAS PROGRAMMING II
  KURNIA RAIHAN ARDIAN
  2122.01.0018
 */

package com.example.app;

/* 
 *  Inheritance adalah sebuah konsep pewarisan sifat berupa variabel 
 *  dan fungsi yang dimiliki oleh class untuk diwariskan kepada kelas-kelas yang lain.
 *  Konsep dari inheritance sendiri yaitu untuk membuat struktur class pada pemrograman 
 *  yang dimana struktur tersebut terdapat sebuah Parentclass atau Superclass sebagai 
 *  induk kelas dan Subclass sebagai anak kelas. Konsep tersebut merupakan sebuah percabangan 
 *  dari sebuah class (Superclass) yang memiliki sifat umum menjadi sebuah class(Subclass) 
 *  yang memiliki sifat lebih spesifik.
 */

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Inosuke", 100, 150);
        HeroStrength hero2 = new HeroStrength("Abdul", 100, 200);
        hero.display();
        hero2.display();
        
        //melakukan penyerangan
        hero2.attack(hero);
        hero.attack(hero2);
        
        hero.display();
        hero2.display();
        
    }
}