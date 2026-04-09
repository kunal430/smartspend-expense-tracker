package com.smartspend.expence_tracker.Service;

import com.smartspend.expence_tracker.Model.Expense;
import com.smartspend.expence_tracker.Repository.ExpenseRepositery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {
    @Autowired
    ExpenseRepositery expenseRepositery;
    public Expense addExpence(Expense expense){
        return expenseRepositery.save(expense);
    }
}
