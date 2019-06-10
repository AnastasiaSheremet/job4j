package ru.job4j.pseudo;

public class Square implements Shape {
    @Override
    public String draw() {
        StringBuilder sb = new StringBuilder();
        sb.append("****").append(System.lineSeparator()).append("****").append(System.lineSeparator())
                .append("****").append(System.lineSeparator()).append("****").append(System.lineSeparator());
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println((new Square()).draw());
    }
}