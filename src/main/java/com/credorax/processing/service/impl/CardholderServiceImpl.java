package com.credorax.processing.service.impl;

import com.credorax.processing.io.entity.CardholderEntity;
import com.credorax.processing.io.repository.CardholderRepository;
import com.credorax.processing.service.CardholderService;
import com.credorax.processing.shared.dto.CardholderDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardholderServiceImpl implements CardholderService {

    @Autowired
    CardholderRepository cardholderRepository;

    @Override
    public CardholderDTO getCardholderById(int cardholderId) {

        CardholderEntity cardholderEntity = cardholderRepository.findById(cardholderId);
        ModelMapper modelMapper = new ModelMapper();
        CardholderDTO returnValue = modelMapper.map(cardholderEntity, CardholderDTO.class);
        return returnValue;
    }

    /*@Override
    public CardholderDTO getCardholderByEmailAndCName(String email, String cName) {
        CardholderEntity cardholderEntity = cardholderRepository.findByEmailAndCName(email, cName);
        ModelMapper modelMapper = new ModelMapper();
        CardholderDTO returnValue = modelMapper.map(cardholderEntity, CardholderDTO.class);
        return returnValue;
    }*/
}
