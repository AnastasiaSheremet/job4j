package ru.job4j.profession;

import ru.job4j.profession.addition.Patient;

public class Surgeon extends Doctor {
    private Patient patient;

    public Surgeon(String name, String surname, String education, long birthday, Patient patient) {
        super(name, surname, education, birthday);
        this.patient = patient;
    }

    public Patient getPatient() {
        return this.patient;
    }

    public void cure(Patient patient) {
        }
}
