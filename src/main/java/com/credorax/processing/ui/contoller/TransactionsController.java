package com.credorax.processing.ui.contoller;


import com.credorax.processing.service.TransactionsService;
import com.credorax.processing.shared.dto.TransactionsDTO;
import com.credorax.processing.ui.model.request.TransactionsRequest;
import com.credorax.processing.ui.model.response.TransactionInsertResp;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
        TransactionsDTO newTransaction = transactionsService.createTransactions(transactionsDto);
        TransactionInsertResp returnValue = modelMapper.map(newTransaction, TransactionInsertResp.class);
        return returnValue;
        //return modelMapper.map(transactionsDto, TransactionInsertResp.class);
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
