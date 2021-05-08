package com.credorax.processing.io.repository;


import com.credorax.processing.io.entity.CardholderEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardholderRepository extends CrudRepository<CardholderEntity, Integer>  {
    CardholderEntity findById(int cardholderId);
}
