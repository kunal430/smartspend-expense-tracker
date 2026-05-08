package com.kunal.expense_backend.service;
import com.kunal.expense_backend.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository ;

    @Autowired
    public ExpenseService (ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository ;
    }


}
