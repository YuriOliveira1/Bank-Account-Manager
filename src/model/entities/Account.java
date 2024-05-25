package model.entities;

public class Account {

    private Integer number;
    private String holder;
    private double balance;
    private double withdrawLimit;

    public Account(Integer number, String holder, double balance, double withdrawLimit){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        withdrawCheck(amount);
        balance -= amount;
    }

    // Não pode ocorrer se não houver saldo na conta
    // Withdraw error: Not Enough Balance
    // Não pode ocorrer se o valor do saque for superior ao limite de saque
    // Withdraw error: The Amount exceeds withdraw Limit
    public void withdrawCheck(double amount){
        if (amount > getWithdrawLimit()) {
            throw new IllegalArgumentException("The Amount exceeds withdraw Limit");
        } if (amount > getBalance()) {
            throw new IllegalArgumentException("Not Enough Balance");
        }
    }


    @Override
    public String toString() {
        return "New Balence: ";
    }


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }
}
