package com.credorax.processing.service.impl;

import com.credorax.processing.io.entity.CardEntity;
import com.credorax.processing.io.repository.CardRepository;
import com.credorax.processing.service.CardService;
import com.credorax.processing.shared.dto.CardDTO;
import com.credorax.processing.ui.model.response.CardRest;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardServiceImpl implements CardService {

    @Autowired
    CardRepository cardRepository;

    @Override
    public CardDTO getCardById(int cardId) {

        CardEntity cardEntity = cardRepository.findById(cardId);
        ModelMapper modelMapper = new ModelMapper();
        CardDTO returnValue = modelMapper.map(cardEntity, CardDTO.class);
        return returnValue;

    }

    @Override
    public CardDTO getCardByPanAndExpiryDate(String pan, String expiryDate) {
        CardEntity cardEntity = cardRepository.findByPanAndExpiryDate(pan, expiryDate);
        ModelMapper modelMapper = new ModelMapper();
        CardDTO returnValue = modelMapper.map(cardEntity, CardDTO.class);
        return returnValue;
    }


}
