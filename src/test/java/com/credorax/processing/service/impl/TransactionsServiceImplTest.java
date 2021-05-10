package com.credorax.processing.service.impl;

import com.credorax.processing.io.entity.TransactionsEntity;
import com.credorax.processing.io.repository.TransactionsRepository;
import com.credorax.processing.shared.dto.TransactionsDTO;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

class TransactionsServiceImplTest {

    @InjectMocks
    TransactionsServiceImpl transactionsService;

    @Mock
    TransactionsRepository transactionsRepository;

    @BeforeEach
    void setUp() throws Exception {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void getTransactionByIvoice() {

        TransactionsEntity transactionsEntity = new TransactionsEntity();
        transactionsEntity.setId(100);
        transactionsEntity.setAmount(101);
        transactionsEntity.setCurrency("USD");
        transactionsEntity.setEmail("test@net.com");
        when(transactionsRepository.findByInvoice(anyInt())).thenReturn(transactionsEntity);

        TransactionsDTO transactionsDTO = transactionsService.getTransactionByIvoice(123);
        assertNotNull(transactionsDTO);
        assertEquals(100, transactionsDTO.getId());
        assertEquals(101, transactionsDTO.getAmount());
        assertEquals("USD", transactionsDTO.getCurrency());
        assertEquals("test@net.com", transactionsDTO.getEmail());

    }


}