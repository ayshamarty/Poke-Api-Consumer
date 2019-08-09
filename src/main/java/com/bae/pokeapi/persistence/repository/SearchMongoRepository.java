package com.bae.pokeapi.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bae.pokeapi.persistence.domain.Search;

@Repository
public interface SearchMongoRepository extends MongoRepository<Search, Long> {

}
