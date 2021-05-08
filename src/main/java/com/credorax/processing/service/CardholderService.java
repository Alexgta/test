package com.credorax.processing.service;

import com.credorax.processing.shared.dto.CardholderDTO;

public interface CardholderService {

    CardholderDTO getCardholderById(int cardholderId);
    //CardholderDTO getCardholderByEmailAndCName(String email, String cName);

}
