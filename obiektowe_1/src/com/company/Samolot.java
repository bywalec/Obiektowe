package com.company;

import java.util.Random;

public class Samolot {

    private int rozmiar, ilosc_paliwa, dystans;

    public Samolot(int paliwo, int wielkosc){

        rozmiar = wielkosc;
        ilosc_paliwa = paliwo;
        dystans = (ilosc_paliwa / rozmiar);
        System.out.println("Jestem konstruktorem z argumentami.");
    }

    Random rand = new Random();

    public Samolot(){
        this.rozmiar = rand.nextInt(10) + 1;
        this.ilosc_paliwa = rand.nextInt(600) + 500;
        this.dystans = ilosc_paliwa / rozmiar;
        System.out.println("Jestem konstruktorem bez argumentów.");
    }

    public void ustaw_paliwo(int ilosc_paliwa)
    {
        this.ilosc_paliwa = ilosc_paliwa;
        this.dystans = this.ilosc_paliwa / this.rozmiar;
    }

    public void ustaw_rozmiar(int rozmiar)
    {
        this.rozmiar = rozmiar;
        this.dystans = this.ilosc_paliwa / this.rozmiar;
    }

    public int zwroc_paliwo()
    {
        return this.ilosc_paliwa;
    }

    public int zwroc_rozmiar()
    {
        return this.rozmiar;
    }

    public int zwroc_dystans()
    {
        return this.dystans;
    }

    public static Samolot dodawanie(Samolot s1, Samolot s2)
    {

        return new Samolot(s1.ilosc_paliwa + s2.ilosc_paliwa, (s1.rozmiar + s2.rozmiar)/2);
    }


}
