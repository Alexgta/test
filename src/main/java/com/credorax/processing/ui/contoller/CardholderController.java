package com.credorax.processing.ui.contoller;


import com.credorax.processing.service.CardholderService;
import com.credorax.processing.shared.dto.CardholderDTO;
import com.credorax.processing.ui.model.response.CardholderRest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cardholder") // http://localhost:8080/cardholder
public class CardholderController {

    @Autowired
    CardholderService cardholderService;

    @GetMapping(path= "/{id}")      // http://localhost:8080/cardholder/1
    public CardholderRest getCardholder(@PathVariable int id) {

        CardholderDTO cardholderDTO = cardholderService.getCardholderById(id);
        ModelMapper modelMapper = new ModelMapper();
        CardholderRest returnValue = modelMapper.map(cardholderDTO, CardholderRest.class);
        return returnValue;
    }


}
