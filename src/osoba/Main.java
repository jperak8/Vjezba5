package osoba;

import zivotinja.Pas;
import zivotinja.Ptica;
import zivotinja.Riba;
import zivotinja.Zivotinja;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Pas pas = new Pas("Labrador", true, 16.75);
        System.out.println("Pas se kreće na slijedeći način: " + pas.kreceSe());

        Ptica ptica = new Ptica("Roda", true, 52.83);
        System.out.println("Ptica se kreće na slijedeći način: " + ptica.kreceSe());

        Riba riba = new Riba(2.63, 5.93, false);
        System.out.println("Riba se kreće na slijedeći način: " + riba.kreceSe());

        ArrayList<Zivotinja> ljubimci = new ArrayList<>();
        ljubimci.add(pas);
        ljubimci.add(ptica);
        ljubimci.add(riba);

        //Adresa ivanovaAdresa = new Adresa("Hrvatska", "Valpovo", 31550, "Kraljevci", "8b");

        Profesor profesor = new Profesor(130299035342L, ljubimci, "FERIT", "Ivan", "Horvat", "Hrvatska", "Valpovo", 31550, "Kraljevci", "8b",  "Elektronika");
        System.out.println("Metoda predaje klase Profesor vraća: " + profesor.predaje());
        System.out.println(profesor.toString());

//        Student student = new Student("EFOS", 1302990300011L, 3);
//        System.out.println("Metoda spava klase Student vraća: " + student.spava());

    }

}
