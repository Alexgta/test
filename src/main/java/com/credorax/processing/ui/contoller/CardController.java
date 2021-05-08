package com.credorax.processing.ui.contoller;


import com.credorax.processing.service.CardService;
import com.credorax.processing.shared.dto.CardDTO;
import com.credorax.processing.ui.model.response.CardRest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    CardService cardService;

    @GetMapping(path= "/{id}")      // http://localhost:8080/card/1
    public CardRest getCard(@PathVariable int id) {

        CardDTO cardDTO = cardService.getCardById(id);
        ModelMapper modelMapper = new ModelMapper();
        CardRest returnValue = modelMapper.map(cardDTO, CardRest.class);

        return returnValue;
    }

}
