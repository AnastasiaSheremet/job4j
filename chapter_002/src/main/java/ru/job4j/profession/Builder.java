package ru.job4j.profession;

import com.sun.javafx.tk.Toolkit;
import ru.job4j.profession.addition.Building;
import ru.job4j.profession.addition.Project;

public class Builder extends Engineer {

    public Building build(Project project){
        return new Building();
    }
}
