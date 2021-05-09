package com.credorax.processing.service;

import com.credorax.processing.shared.dto.TransactionsDTO;


public interface TransactionsService {
    TransactionsDTO createTransactions(TransactionsDTO transaction);
    TransactionsDTO getTransactionByIvoice(int invoice);
}
