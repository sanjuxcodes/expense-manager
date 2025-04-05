package com.expensemanager.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "expenses") 
public class Expense {
    @Id  
    private String id;
    private String name;
    private double amount;
   // private String category;
}
