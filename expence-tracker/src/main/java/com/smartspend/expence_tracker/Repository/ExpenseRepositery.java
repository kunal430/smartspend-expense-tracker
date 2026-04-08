package com.smartspend.expence_tracker.Repository;

import com.smartspend.expence_tracker.Model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpenseRepositery extends JpaRepository<Expense,Integer> {
}
