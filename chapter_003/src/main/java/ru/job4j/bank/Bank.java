package ru.job4j.bank;

import java.util.*;

public class Bank {
    Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        List<Account> accounts = new ArrayList<>();
        users.putIfAbsent(user, accounts);
    }

    public void deleteUser(User user) {
        users.remove(user);
    }

    public void addAccountToUser(String passport, Account account) {
        Set<User> keys = this.users.keySet();
        for (User user : keys) {
            if (user.getPassport().equals(passport)) {
                List<Account> newAccounts = this.users.get(user);
                newAccounts.add(account);
                this.users.replace(user, newAccounts);
            }
        }
    }

    public void deleteAccountFromUser(String passport, Account account) {
        Set<User> keys = this.users.keySet();
        for (User user : keys) {
            if (user.getPassport().equals(passport)) {
                List<Account> newAccounts = this.users.get(user);
                newAccounts.remove(account);
                this.users.replace(user, newAccounts);
            }
        }
    }

    public List<Account> getUserAccounts(String passport) {
        List<Account> userAccounts = new ArrayList<>();
        Set<User> keys = this.users.keySet();
        for (User user : keys) {
            if (user.getPassport().equals(passport)) {
                userAccounts = this.users.get(user);
            }
        }
        return userAccounts;
    }

    public Account getOneAccount(String passport, String requisites) {
        List<Account> accounts = getUserAccounts(passport);
        Account account = new Account();
        for (Account a : accounts) {
            if (a.getRequisites().equals(requisites)) {
                account = a;
                break;
            }
        }
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite, String destPassport, String dstRequisite, double amount) {
        Account src = getOneAccount(srcPassport, srcRequisite);
        Account dest = getOneAccount(destPassport, dstRequisite);
        if (src.getValue() - amount >= 0) {
            dest.setValue(dest.getValue() + amount);
            src.setValue(src.getValue() - amount);
            return true;
        } else {
            return false;
        }
    }
}
