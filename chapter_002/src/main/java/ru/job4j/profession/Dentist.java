package ru.job4j.profession;

import ru.job4j.profession.addition.Tooth;

public class Dentist extends Doctor {
    private Tooth tooth;

    public Dentist(String name, String surname, String education, long birthday, Tooth tooth) {
        super(name, surname, education, birthday);
        this.tooth = tooth;
    }

    public Tooth getTooth() {
        return this.tooth;
    }

    public void treatTooth() {

    }

    public void deleteTooth() {

    }
}
