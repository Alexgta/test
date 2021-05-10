package com.credorax.processing.service.impl;

import com.credorax.processing.io.entity.TransactionsEntity;
import com.credorax.processing.io.repository.TransactionsRepository;
import com.credorax.processing.service.TransactionsService;
import com.credorax.processing.shared.dto.TransactionsDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TransactionsServiceImpl implements TransactionsService {

    @Autowired
    TransactionsRepository transactionsRepository;


    @Override
    public TransactionsDTO createTransactions(TransactionsDTO transaction) {

        ModelMapper modelMapper = new ModelMapper();
        TransactionsEntity transactionsEntity = modelMapper.map(transaction, TransactionsEntity.class);
        TransactionsDTO returnValue = transaction;
        TransactionsEntity savedTransactionsEntity = transactionsRepository.save(transactionsEntity);
        returnValue = modelMapper.map(savedTransactionsEntity, TransactionsDTO.class);

        return returnValue;
    }


    @Override
    public TransactionsDTO getTransactionByIvoice(int invoiceNum) {

        TransactionsEntity transactionsEntity = transactionsRepository.findByInvoice(invoiceNum);
        if (transactionsEntity == null) {
            // TODO: send 'not found'
        }
        ModelMapper modelMapper = new ModelMapper();
        TransactionsDTO returnValue = modelMapper.map(transactionsEntity, TransactionsDTO.class);
        return returnValue;
    }

}
