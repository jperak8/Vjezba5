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

        Riba riba = new Riba("plava riba", 2.63, 5.93, false);
        System.out.println("Riba se kreće na slijedeći način: " + riba.kreceSe());

        Pas pasDrugi = new Pas("Pit bull", false, 19.27);
        Ptica pticaDruga = new Ptica("Lastavica", true, 6.48);
        Riba ribaDruga = new Riba("šaran", 5.73, 8.62, true);

        ArrayList<Zivotinja> ljubimciProfesor = new ArrayList<>();
        ljubimciProfesor.add(pas);
        ljubimciProfesor.add(ptica);
        ljubimciProfesor.add(riba);

        ArrayList<Zivotinja> ljubimciStudent = new ArrayList<>();
        ljubimciStudent.add(pasDrugi);
        ljubimciStudent.add(pticaDruga);
        ljubimciStudent.add(ribaDruga);

        Profesor profesor = new Profesor("Ivan", "Horvat", "Hrvatska", "Valpovo", 31550, "Kraljevci", "8b", 130299035342L, "FERIT", "Elektronika", ljubimciProfesor);
        System.out.println("Metoda predaje klase Profesor vraća: " + profesor.predaje());
        System.out.println(profesor.toString());

        Student student = new Student("Marko", "Marić", 3, "Hrvatska", "Valpovo", 31550, "Braće Radića", "39", 58731820022L, 110699035782L, "EFOS", ljubimciStudent);
        System.out.println("Metoda spava klase Student vraća: " + student.spava());
        System.out.println(student.toString());

    }

}
