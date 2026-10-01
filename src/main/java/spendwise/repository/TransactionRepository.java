package spendwise.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spendwise.model.Transaction;

public interface TransactionRepository
        extends JpaRepository<Transaction, Long> {

}