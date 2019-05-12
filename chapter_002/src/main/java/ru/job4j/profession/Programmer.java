package ru.job4j.profession;

import ru.job4j.profession.addition.Programm;
import ru.job4j.profession.addition.Project;

public class Programmer extends Engineer {

    public Programm writeCode(Project project) {
        return new Programm();
    }

}
