package com.credorax.processing.service;

import com.credorax.processing.shared.dto.TransactionsDto;

public interface TransactionsService {
    TransactionsDto createTransactions(TransactionsDto transaction);
    TransactionsDto getTransactionByIvoiceNum(int invoice);
}
