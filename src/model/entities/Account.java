package model.entities;


import model.exceptions.WithdrawException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawLimit;

    public Account() {}

    public Account(Integer number, String holder, Double balance, Double withDrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Double getBalance() {
        return balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withDraw(double amount) throws WithdrawException{
        if(amount > withDrawLimit){
            throw new WithdrawException("Withdraw error: The amount exceeds withdraw limit");
        }
        if(amount > balance || balance <= 0){
            throw new WithdrawException("Withdraw error: Not enough balance");
        }

        balance -= amount;
    }
}
