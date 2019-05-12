package ru.job4j.profession;

import ru.job4j.profession.addition.Patient;

public class Surgeon extends Doctor {
    private Patient patient;

    public Patient getPatient() {
        return this.patient;
    }

    public void cure(Patient patient) {
        }
}
