package com.smartspend.expence_tracker.Controller;

import com.smartspend.expense_tracker.Model.Expense;
import com.smartspend.expence_tracker.Repository.ExpenseRepositery;
import com.smartspend.expence_tracker.Service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book/v1")
public class ExpenseController {
    private final ExpenseService expenseService;

    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @PostMapping("/addExpence")
    public ResponseEntity<Expence> addExpence(@RequestBody Expence expense){
        Expense savedExpense = ExpenseService.addExpence(expense);
        return ExpenseRepositery.ok(savedExpense);
    }
}

