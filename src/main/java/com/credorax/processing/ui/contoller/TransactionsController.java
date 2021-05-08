package com.credorax.processing.ui.contoller;


import com.credorax.processing.service.TransactionsService;
import com.credorax.processing.shared.dto.TransactionsDTO;
import com.credorax.processing.ui.model.request.TransactionsRequestModel;
import com.credorax.processing.ui.model.response.CardRest;
import com.credorax.processing.ui.model.response.CardholderRest;
import com.credorax.processing.ui.model.response.TransactionsRest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transc") // http://localhost:8080/transc
public class TransactionsController {

    @Autowired
    TransactionsService transactionsService;

    @GetMapping(path= "/{invoice}")      // http://localhost:8080/transc/101
    public TransactionsRest getTransactions(@PathVariable int invoice) {

        TransactionsDTO transactionsDto = transactionsService.getTransactionByIvoiceNum(invoice);
        ModelMapper modelMapper = new ModelMapper();
        TransactionsRest returnValue = modelMapper.map(transactionsDto, TransactionsRest.class);
        returnValue.setCardholder(modelMapper.map(transactionsDto.getCard().getCardholder(), CardholderRest.class));

        return returnValue;
    }

    @PostMapping
    public TransactionsRest createTransactions(@RequestBody TransactionsRequestModel transactionsDetails) {

        ModelMapper modelMapper = new ModelMapper();
        TransactionsDTO transactionsDto = modelMapper.map(transactionsDetails, TransactionsDTO.class);
        TransactionsDTO newTransaction = transactionsService.createTransactions(transactionsDto);
        //TransactionsRest returnValue = modelMapper.map(newTransaction, TransactionsRest.class);

        return modelMapper.map(newTransaction, TransactionsRest.class);
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
