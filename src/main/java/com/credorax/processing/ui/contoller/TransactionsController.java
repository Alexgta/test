package com.credorax.processing.ui.contoller;


import com.credorax.processing.service.TransactionsService;
import com.credorax.processing.shared.CredUtil;
import com.credorax.processing.shared.dto.TransactionsDTO;
import com.credorax.processing.ui.model.request.TransactionsRequest;
import com.credorax.processing.ui.model.response.TransactionInsertResp;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.io.IOException;

@RestController
@RequestMapping("/transc") // http://localhost:8080/transc
public class TransactionsController {

    @Autowired
    TransactionsService transactionsService;

    @GetMapping(path= "/{invoice}")      // http://localhost:8080/transc/101
    public TransactionInsertResp getTransactions(@PathVariable int invoice) {

        TransactionsDTO transactionsDto = transactionsService.getTransactionByIvoice(invoice);
        ModelMapper modelMapper = new ModelMapper();
        TransactionInsertResp returnValue = modelMapper.map(transactionsDto, TransactionInsertResp.class);

        return returnValue;
    }

    @PostMapping
    public TransactionInsertResp createTransactions(@RequestBody TransactionsRequest transactionsDetails) {

        ModelMapper modelMapper = new ModelMapper();
        TransactionsDTO transactionsDto = modelMapper.map(transactionsDetails, TransactionsDTO.class);
        TransactionInsertResp returnValue;
        if (transactionsDto.validate()) {
            TransactionsDTO newTransaction = transactionsService.createTransactions(transactionsDto);
            returnValue = modelMapper.map(newTransaction, TransactionInsertResp.class);
        } else
            returnValue = modelMapper.map(transactionsDto, TransactionInsertResp.class);


        // Save to file for audite.
        try {
            ObjectMapper mapper = new ObjectMapper();
            // Java in JSON String
            String jsonString = mapper.writeValueAsString(returnValue);
            CredUtil.saveAuditMessage(jsonString);
        }
        catch (IOException e) {
            System.out.println("exception occoured"+ e);
        }

        return returnValue;
    }

    @PutMapping
    public String updateTransactions() {
        return "updateTransactions not allowed";
    }

    @DeleteMapping
    public String deleteTransactions() {
        return "deleteTransactions not allowed";
    }

}
