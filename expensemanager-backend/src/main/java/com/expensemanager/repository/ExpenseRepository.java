package com.expensemanager.repository;

import com.expensemanager.model.Expense;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends MongoRepository<Expense, String> {
}
