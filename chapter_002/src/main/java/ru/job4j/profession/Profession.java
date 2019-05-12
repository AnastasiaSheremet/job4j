package ru.job4j.profession;

import ru.job4j.profession.addition.Project;

public class Profession {
    protected String name;
    protected String surname;
    protected String education;
    protected long birthday;

    public Profession(String name, String surname, String education, long birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getEducation() {
        return this.education;
    }

    public long getBirthday() {
        return this.birthday;
    }
}
