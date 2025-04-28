package org.ayomide.data.repository;

import org.ayomide.data.model.Auction;
import org.springframework.data.mongodb.repository.MongoRepository;



public interface AuctionRepository extends MongoRepository<Auction,String> {

}
