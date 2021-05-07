package com.credorax.processing.service.impl;

import com.credorax.processing.io.entity.TransactionsEntity;
import com.credorax.processing.io.repository.TransactionsRepository;
import com.credorax.processing.service.TransactionsService;
import com.credorax.processing.shared.dto.TransactionsDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionsServiceImpl implements TransactionsService {

    @Autowired
    TransactionsRepository transactionsRepository;

    @Override
    public TransactionsDto createTransactions(TransactionsDto transaction) {

        TransactionsEntity transactionsEntity = new TransactionsEntity();
        BeanUtils.copyProperties(transaction, transactionsEntity);
        TransactionsEntity savedTransactionsEntity =  transactionsRepository.save(transactionsEntity);
        TransactionsDto returnValue = new TransactionsDto();
        BeanUtils.copyProperties(savedTransactionsEntity, returnValue);

        return returnValue;
    }

    @Override
    public TransactionsDto getTransactionByIvoiceNum(int invoiceNum) {

        TransactionsDto returnValue = new TransactionsDto();
        TransactionsEntity transactionsEntity = transactionsRepository.findByInvoice(invoiceNum);
        if (transactionsEntity == null) {
            // TODO: add    throw new TransactionNotFoundException(invoiceNum);
        }
        BeanUtils.copyProperties(transactionsEntity, returnValue);

        return returnValue;
    }


}
