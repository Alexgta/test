package com.credorax.processing.ui.contoller;


import com.credorax.processing.service.TransactionsService;
import com.credorax.processing.shared.dto.TransactionsDto;
import com.credorax.processing.ui.model.request.TransactionsDetailsRequestModel;
import com.credorax.processing.ui.model.response.TransactionsRest;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transc") // http://localhost:8080/transc
public class TransactionsController {

    @Autowired
    TransactionsService transactionsService;

    @GetMapping
    public String getTransactions() {
        return "getTransactions called";
    }

    @PostMapping
    public TransactionsRest createTransactions(@RequestBody TransactionsDetailsRequestModel transactionsDetails) {
        TransactionsRest returnValue = new TransactionsRest();

        TransactionsDto transactionsDto = new TransactionsDto();
        BeanUtils.copyProperties(transactionsDetails, transactionsDto);

        TransactionsDto newTransaction = transactionsService.createTransactions(transactionsDto);
        BeanUtils.copyProperties(newTransaction, returnValue);


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
