package ru.job4j.profession;

import com.sun.javafx.tk.Toolkit;
import ru.job4j.profession.addition.Building;
import ru.job4j.profession.addition.Project;

public class Builder extends Engineer {

    public Builder(String name, String surname, String education, long birthday, Project project) {
        super(name, surname, education, birthday, project);
    }

    public Building build(Project project){
        return new Building();
    }
}
