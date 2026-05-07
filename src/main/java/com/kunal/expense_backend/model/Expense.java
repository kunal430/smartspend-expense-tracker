package com.kunal.expense_backend.model;

public class Expense {
    private String tittle ;

    private double amount ;

    private String description ;

    public Expense() {

    }

    public Expense(String tittle , double amount, String description) {
        this.tittle= tittle ;
        this.amount = amount;
        this.description = description;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }


    public double getAmount(){
        return amount ;
    }

    public void setAmount(double amount){
        this.amount = amount ;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
