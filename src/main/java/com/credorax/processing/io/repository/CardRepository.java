package com.credorax.processing.io.repository;

import com.credorax.processing.io.entity.CardEntity;
import com.credorax.processing.io.entity.TransactionsEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends CrudRepository<CardEntity, Integer> {
    CardEntity findById(int cardId);
}
