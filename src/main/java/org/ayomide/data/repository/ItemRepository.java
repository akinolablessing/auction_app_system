package org.ayomide.data.repository;

import org.ayomide.data.model.Item;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ItemRepository extends MongoRepository<Item,String> {

}
