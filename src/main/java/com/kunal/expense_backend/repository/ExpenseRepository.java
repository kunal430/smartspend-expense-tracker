package com.kunal.expense_backend.repository;

import com.kunal.expense_backend.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepository extends JpaRepository<Expense , Long> {
}
