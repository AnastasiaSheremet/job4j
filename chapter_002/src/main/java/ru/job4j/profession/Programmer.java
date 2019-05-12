package ru.job4j.profession;

import ru.job4j.profession.addition.Programm;
import ru.job4j.profession.addition.Project;

public class Programmer extends Engineer {

    public Programmer(String name, String surname, String education, long birthday, Project project) {
        super(name, surname, education, birthday, project);
    }

    public Programm writeCode(Project project) {
        return new Programm();
    }

}
