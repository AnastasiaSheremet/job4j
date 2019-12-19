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
        User user = getUserByPassport(passport);
        List<Account> newAccounts = getUserAccounts(passport);
        newAccounts.add(account);
        this.users.replace(user, newAccounts);
    }

    public void deleteAccountFromUser(String passport, Account account) {
        List<Account> newAccounts = getUserAccounts(passport);
        newAccounts.remove(account);
        this.users.replace(getUserByPassport(passport), newAccounts);
    }

    public List<Account> getUserAccounts(String passport) {
        User user = getUserByPassport(passport);
        return this.users.get(user);
    }

    public User getUserByPassport(String passport) {
        User user = new User();
        Set<User> keys = this.users.keySet();
        for (User u : keys) {
            if (u.getPassport().equals(passport)) {
                user = u;
                break;
            }
        }
        return user;
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
        return src.transfer(src, dest, amount);
    }
}
