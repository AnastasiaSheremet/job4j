package ru.job4j.bank;

import java.util.Objects;

public class Account {
    private double value;
    private String requisites;

    public Account() {

    }

    public Account(double value, String requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    public boolean transfer(Account sourse, Account destination, double amount) {
        boolean valid = false;
        if (sourse != null && destination != null) {
            if (sourse.value - amount >= 0) {
                sourse.value -= amount;
                destination.value += amount;
                valid = true;
            }
        }
    return valid;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getRequisites() {
        return requisites;
    }

    public void setRequisites(String requisites) {
        this.requisites = requisites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Double.compare(account.value, value) == 0
                && requisites.equals(account.requisites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, requisites);
    }

    @Override
    public String toString() {
        return "Account{"
                + "value=" + value
                + ", requisites='" + requisites + '\''
                + '}';
    }
}
