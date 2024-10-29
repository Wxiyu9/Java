package JavaHomework3_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 账户类
class Account {
    private String accountNumber; // 账号
    private String accountHolderName; // 储户姓名
    private double balance; // 存款余额
    private String password; // 密码

    public Account(String accountNumber, String accountHolderName, double initialBalance, String password) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.password = password;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public boolean validatePassword(String password) {
        return this.password.equals(password);
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("存款成功！当前余额: " + balance);
        } else {
            System.out.println("存款金额必须大于0。");
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("取款成功！当前余额: " + balance);
            return true;
        } else {
            System.out.println("取款失败，余额不足或金额无效。");
            return false;
        }
    }
}

// ATM机类
class ATM {
    private List<Account> accounts; // 账户列表

    public ATM() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account login(String accountNumber, String password) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber) && account.validatePassword(password)) {
                System.out.println("登录成功！欢迎 " + account.getAccountHolderName());
                return account; // 登录成功，返回账户
            }
        }
        System.out.println("登录失败，账号或密码错误。");
        return null; // 登录失败
    }
}

