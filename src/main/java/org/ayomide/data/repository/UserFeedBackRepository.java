package org.ayomide.data.repository;

import org.ayomide.data.model.UserFeedBack;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserFeedBackRepository extends MongoRepository<UserFeedBack,String> {
}
