package ru.job4j.profession;

import ru.job4j.profession.addition.Project;

public class Engineer extends Profession {
    protected Project project;

    public Engineer(String name, String surname, String education, long birthday, Project project) {
        super(name, surname, education, birthday);
        this.project = project;
        }

    public Project getProject() {
        return this.project;
    }
}
