package com.credorax.processing.service.impl;

import com.credorax.processing.io.entity.CardEntity;
import com.credorax.processing.io.entity.CardholderEntity;
import com.credorax.processing.io.entity.TransactionsEntity;
import com.credorax.processing.io.repository.CardRepository;
import com.credorax.processing.io.repository.CardholderRepository;
import com.credorax.processing.io.repository.TransactionsRepository;
import com.credorax.processing.service.CardholderService;
import com.credorax.processing.service.TransactionsService;
import com.credorax.processing.shared.dto.CardDTO;
import com.credorax.processing.shared.dto.TransactionsDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionsServiceImpl implements TransactionsService {

    @Autowired
    TransactionsRepository transactionsRepository;

    @Autowired
    CardRepository cardRepository;

    @Autowired
    CardholderRepository cardholderRepository;

    @Override
    public TransactionsDTO createTransactions(TransactionsDTO transaction) {

        ModelMapper modelMapper = new ModelMapper();
        TransactionsEntity transactionsEntity = modelMapper.map(transaction, TransactionsEntity.class);
        CardEntity cardEntity = cardRepository.findByPanAndExpiryDate(transaction.getCard().getPan(),
                transaction.getCard().getExpiryDate());
        CardholderEntity cardholderEntity = cardholderRepository.findByEmail(transaction.getCardholder().getEmail());
                //transaction.getCardholder().getcName());
        cardEntity.setCardholder(cardholderEntity);
        transactionsEntity.setCard(cardEntity);
        //transaction.setCard(cardDTO);

        TransactionsEntity savedTransactionsEntity = transactionsRepository.save(transactionsEntity);
        TransactionsDTO returnValue = modelMapper.map(savedTransactionsEntity, TransactionsDTO.class);

        return returnValue;
    }

    @Override
    public TransactionsDTO getTransactionByIvoiceNum(int invoiceNum) {

        TransactionsEntity transactionsEntity = transactionsRepository.findByInvoice(invoiceNum);
        if (transactionsEntity == null) {
            // TODO: add    throw new TransactionNotFoundException(invoiceNum);
        }
        ModelMapper modelMapper = new ModelMapper();
        TransactionsDTO returnValue = modelMapper.map(transactionsEntity, TransactionsDTO.class);

        return returnValue;
    }


}
