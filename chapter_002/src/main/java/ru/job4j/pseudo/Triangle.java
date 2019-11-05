package ru.job4j.pseudo;

public class Triangle implements Shape {
    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("*").append("**").append("***").append("****");
        return sb.toString();
    }
}
