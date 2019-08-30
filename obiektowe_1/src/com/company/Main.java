package com.company;

public class Main {

    public static void main(String[] args) {

        Samolot s1 = new Samolot(900, 5);
        Samolot s2 = new Samolot();

        System.out.println("Informacje na temat samolotu nr 1. Dystans: " + s1.zwroc_dystans() + " Rozmiar: "
                + s1.zwroc_rozmiar() + " Ilosc paliwa: "
                + s1.zwroc_paliwo());

        System.out.println("Informacje na temat samolotu nr 2. Dystans: " + s2.zwroc_dystans() + " Rozmiar: "
                + s2.zwroc_rozmiar() + " Ilosc paliwa: "
                + s2.zwroc_paliwo());

        s1.ustaw_paliwo(s1.zwroc_paliwo() + 100);
        System.out.println("Ilosc paliwa w s1 po dodaniu 100: " + s1.zwroc_paliwo() + " dystans po dodaniu paliwa: " + s1.zwroc_dystans());

        Samolot s3 = Samolot.dodawanie(s1,s2);

        System.out.println("Informacje na temat samolotu nr 3. Dystans: " + s3.zwroc_dystans() + " Rozmiar: "
                + s3.zwroc_rozmiar() + " Ilosc paliwa: "
                + s3.zwroc_paliwo());

        Samolot s4 = new Samolot();

        System.out.println("Informacje na temat samolotu nr 4. Dystans: " + s4.zwroc_dystans() + " Rozmiar: "
                + s4.zwroc_rozmiar() + " Ilosc paliwa: "
                + s4.zwroc_paliwo());
        s4 = Samolot.dodawanie(s4, s3);

        System.out.println("Informacje na temat samolotu nr 4. Dystans: " + s4.zwroc_dystans() + " Rozmiar: "
                + s4.zwroc_rozmiar() + " Ilosc paliwa: "
                + s4.zwroc_paliwo());


    }
}
