package main;

import java.io.PrintStream;

public class Account {
    private int balance = 0;
    Statement statement;

    public Account(Statement statement){
        this.statement = statement;
    }

    void deposit(int amount, String date) {
        this.balance += amount;
        statement.addNewStatement(amount, date, this.balance);
    }

    void withdrawal(int amount, String date){
        this.balance += (amount)*-1;
        statement.addNewStatement((amount)*-1, date, this.balance);
    }

    void printStatement(PrintStream out) {
        System.out.println("    Date       Credit    Debit     Balance");
        System.out.print(statement);
    }

    public void transaction(int amount, String date){
        this.balance += (amount)*-1;
        statement.addNewStatement((amount)*-1, date, this.balance);
    }
}