package com.bae.pokeapi.receiver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import com.bae.pokeapi.persistence.domain.Search;
import com.bae.pokeapi.persistence.repository.SearchMongoRepository;

@Component
public class SearchReceiver {

	@Autowired
	private SearchMongoRepository repository;

	@JmsListener(destination = "SearchQueue", containerFactory = "myFactory")
	public void receiveMessage(Search search) {
		repository.save(search);
	}

}
