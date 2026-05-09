package com.kunal.expense_backend.controller;

import com.kunal.expense_backend.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/expense")
public class ExpenseController {
    private final ExpenseService expenseService ;

    @Autowired

    public ExpenseController (ExpenseService expenseService){
        this.expenseService=expenseService ;
    }
}
