/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid.badexamples;

/**
 *
 * @author maumneto
 */

class AccountLSP {
    private double balance;
    public AccountLSP() {
        this.balance = 0;
    }
    public AccountLSP(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void withdraw(double value) {
        if (balance >= value) {
            this.balance = this.balance - value;
        } else {
            System.out.println("No enough funds");
        }
    }
    public void deposit(double value) {
        this.balance = this.balance + value;
    }
    public void income() {
        this.balance = this.balance*1.005;
    }
}

class AccountSpecial extends AccountLSP {
    public AccountSpecial() {
        super();
    }
    public AccountSpecial(double balance) {
        super(balance);
    }
    @Override
    public void income() {
        System.out.println("There's no income in this account type.");
    }
}
public class BadLSPExample {
    public static void main(String[] args) {
        AccountLSP accountExample = new AccountLSP(100);
        System.out.println("Balance: " + accountExample.getBalance());
        accountExample.income();
        System.out.println("Balance with income: " + accountExample.getBalance());

        AccountLSP accountSpecial = new AccountSpecial(1000);
        System.out.println("Balance: " + accountSpecial.getBalance());
        accountSpecial.income();
        System.out.println("Balance with income: " + accountSpecial.getBalance());
        
    }
}
