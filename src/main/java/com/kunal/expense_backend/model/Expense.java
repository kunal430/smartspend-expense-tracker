package com.kunal.expense_backend.model;

import jakarta.persistence.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name ="expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)

    private long id ;

    private String tittle ;

    private double amount ;

    private String description ;

    private String catagory ;

    public Expense() {

    }

    public Expense( long id ,String tittle , double amount, String description , String catagory) {
        this.id=id ;
        this.tittle= tittle ;
        this.amount = amount;
        this.description = description;
        this.catagory = catagory ;

    }


    public long getId(){
        return id ;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }
}
