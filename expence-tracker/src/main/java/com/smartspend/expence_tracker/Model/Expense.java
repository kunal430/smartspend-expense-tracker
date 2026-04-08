package com.smartspend.expence_tracker.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Expense {
    @Id
    @GeneratedValue
    private Long Id;


    private String title ;
    private Double amount ;

    public Expense() {}
    public Expense(String title , Double amount ){
        this.amount = amount ;
        this.title = title ;
    }

    public Long getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public Double getAmount() {
        return amount;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
