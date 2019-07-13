package com.aawadall.repository;

import java.util.List;

import com.aawadall.model.Transaction;

public interface TransactionRepository {
    List<Transaction> getTransactions();
}