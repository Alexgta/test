package com.credorax.processing.service;

import com.credorax.processing.shared.dto.CardDTO;

public interface CardService {

    CardDTO getCardById(int cardId);
    CardDTO getCardByPanAndExpiryDate(String pan, String expiryDate);

}
